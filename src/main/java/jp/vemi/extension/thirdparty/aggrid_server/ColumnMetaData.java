/*
 * Copyright(c) 2021 VEMI Develop Solutions.
 */

/*
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.vemi.extension.thirdparty.aggrid_server;

@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Data
@lombok.Builder
public class ColumnMetaData {

  String field;

  String headerName;

  String cellEditor;

  @lombok.Builder.Default
  Boolean cellEditorPopup = false;

  CellRendererParams cellRendererParams;

  CellEditorParams cellEditorParams;

  @lombok.Builder.Default
  Integer width = 120;

  @lombok.Builder.Default
  Boolean rowDrag = false;

  @lombok.Builder.Default
  Boolean checkboxSelection = false;

  @lombok.Builder.Default
  Boolean headerCheckboxSelection = false;

  @lombok.Builder.Default
  Boolean headerCheckboxSelectionFilteredOnly = false;

}
