/**
 * Copyright 2012-2014 Rafal Lewczuk <rafal.lewczuk@jitlogic.com>
 * <p/>
 * This is free software. You can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * <p/>
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this software. If not, see <http://www.gnu.org/licenses/>.
 */
package com.jitlogic.zico.client.inject;


import com.google.inject.assistedinject.Assisted;
import com.jitlogic.zico.client.views.traces.MethodAttrsDialog;
import com.jitlogic.zico.client.views.traces.MethodRankingPanel;
import com.jitlogic.zico.client.views.admin.PasswordChangeDialog;
import com.jitlogic.zico.client.views.traces.TraceCallTreePanel;
import com.jitlogic.zico.client.views.traces.TraceRecordSearchDialog;
import com.jitlogic.zico.client.views.traces.TraceSearchPanel;
import com.jitlogic.zico.client.views.admin.TraceTemplatePanel;
import com.jitlogic.zico.client.views.admin.UserManagementPanel;
import com.jitlogic.zico.shared.data.HostProxy;
import com.jitlogic.zico.shared.data.TraceInfoProxy;

public interface PanelFactory {

    public TraceSearchPanel traceSearchPanel(HostProxy host);

    public TraceCallTreePanel traceCallTreePanel(TraceInfoProxy traceInfo);

    public TraceTemplatePanel traceTemplatePanel();

    public TraceRecordSearchDialog traceRecordSearchDialog(TraceCallTreePanel panel, TraceInfoProxy trace);

    public MethodAttrsDialog methodAttrsDialog(@Assisted("hostName") String hostName, Long dataOffs, String path, @Assisted("minTime") Long minTime);

    public MethodRankingPanel methodRankingPanel(TraceInfoProxy traceInfo);

    public PasswordChangeDialog passwordChangeDialog(@Assisted("userName") String userName);

    public UserManagementPanel userManagementPanel();
}
