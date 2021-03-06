/*
 * Copyright (C) 2018 Blockchain Data Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eco.data.m3.routing.api.rest.response;

import java.util.List;

import eco.data.m3.routing.api.core.NodeInfo;
import eco.data.m3.routing.api.rest.BaseResponse;

/**
* @author: xquan
* Rest Response, pair with the request with the same prefix.
* @since: 2018-6-29
**/
public class ListNodesResponse extends BaseResponse{

	private List<NodeInfo> nodes ;

	public List<NodeInfo> getNodes() {
		return nodes;
	}

	public void setNodes(List<NodeInfo> nodes) {
		this.nodes = nodes;
	}
	
}
