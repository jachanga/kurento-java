/*
 * (C) Copyright 2014 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */

package org.kurento.test.browser;

/**
 * Type of candidate
 *
 * @author Raul Benitez (rbenitez@gsyc.es)
 * @since 6.3.1
 */
public enum WebRtcCandidateType {
  HOST, RELAY, SRFLX, ALL;

  public String getJsFunction(String url, String username, String password) {
    switch (this) {
      case RELAY:
        return "setIceServers('" + url + "', '" + username + "', '" + password + "');";
      case HOST:
      case SRFLX:
      case ALL:
        return null;
      default:
        throw new IllegalArgumentException();
    }
  }

  @Override
  public String toString() {
    switch (this) {
      case HOST:
        return "host";
      case RELAY:
        return "relay";
      case SRFLX:
        return "srflx";
      case ALL:
        return "all";
      default:
        throw new IllegalArgumentException();
    }
  }
}
