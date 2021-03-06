/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2016 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.jsoninput;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.pentaho.di.core.injection.BaseMetadataInjectionTest;
import org.pentaho.di.core.row.ValueMetaInterface;
import org.pentaho.di.core.row.value.ValueMetaString;

public class JsonInputMetaInjectionTest extends BaseMetadataInjectionTest<JsonInputMeta> {
  @Before
  public void setup() {
    setup( new JsonInputMeta() );
  }

  @Test
  public void test() throws Exception {
    check( "FILE_NAME_OUTPUT", new BooleanGetter() {
      public boolean get() {
        return meta.includeFilename();
      }
    } );
    check( "FILE_NAME_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.getFilenameField();
      }
    } );
    check( "ROW_NUMBER_OUTPUT", new BooleanGetter() {
      public boolean get() {
        return meta.includeRowNumber();
      }
    } );
    check( "ROW_NUMBER_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.getRowNumberField();
      }
    } );
    check( "ROW_LIMIT", new LongGetter() {
      public long get() {
        return meta.getRowLimit();
      }
    } );
    check( "ADD_RESULT_FILE", new BooleanGetter() {
      public boolean get() {
        return meta.addResultFile();
      }
    } );
    check( "IGNORE_EMPTY_FILE", new BooleanGetter() {
      public boolean get() {
        return meta.isIgnoreEmptyFile();
      }
    } );
    check( "DO_NOT_FAIL_IF_NO_FILE", new BooleanGetter() {
      public boolean get() {
        return meta.isDoNotFailIfNoFile();
      }
    } );
    check( "IGNORE_MISSING_PATH", new BooleanGetter() {
      public boolean get() {
        return meta.isIgnoreMissingPath();
      }
    } );
    check( "READ_SOURCE_AS_URL", new BooleanGetter() {
      public boolean get() {
        return meta.isReadUrl();
      }
    } );
    check( "REMOVE_SOURCE_FIELDS", new BooleanGetter() {
      public boolean get() {
        return meta.isRemoveSourceField();
      }
    } );
    check( "ACCEPT_FILE_NAMES", new BooleanGetter() {
      public boolean get() {
        return meta.inputFiles.acceptingFilenames;
      }
    } );
    check( "ACCEPT_FILE_STEP", new StringGetter() {
      public String get() {
        return meta.inputFiles.acceptingStepName;
      }
    } );
    check( "PASS_THROUGH_FIELDS", new BooleanGetter() {
      public boolean get() {
        return meta.inputFiles.passingThruFields;
      }
    } );
    check( "ACCEPT_FILE_FIELD", new StringGetter() {
      public String get() {
        return meta.inputFiles.acceptingField;
      }
    } );
    check( "ADD_FILES_TO_RESULT", new BooleanGetter() {
      public boolean get() {
        return meta.inputFiles.isaddresult;
      }
    } );
    check( "IGNORE_ERRORS", new BooleanGetter() {
      public boolean get() {
        return meta.errorHandling.errorIgnored;
      }
    } );
    check( "FILE_ERROR_FIELD", new StringGetter() {
      public String get() {
        return meta.errorHandling.fileErrorField;
      }
    } );
    check( "FILE_ERROR_MESSAGE_FIELD", new StringGetter() {
      public String get() {
        return meta.errorHandling.fileErrorMessageField;
      }
    } );
    check( "SKIP_BAD_FILES", new BooleanGetter() {
      public boolean get() {
        return meta.errorHandling.skipBadFiles;
      }
    } );
    check( "WARNING_FILES_TARGET_DIR", new StringGetter() {
      public String get() {
        return meta.errorHandling.warningFilesDestinationDirectory;
      }
    } );
    check( "WARNING_FILES_EXTENTION", new StringGetter() {
      public String get() {
        return meta.errorHandling.warningFilesExtension;
      }
    } );
    check( "ERROR_FILES_TARGET_DIR", new StringGetter() {
      public String get() {
        return meta.errorHandling.errorFilesDestinationDirectory;
      }
    } );
    check( "ERROR_FILES_EXTENTION", new StringGetter() {
      public String get() {
        return meta.errorHandling.errorFilesExtension;
      }
    } );
    check( "LINE_NR_FILES_TARGET_DIR", new StringGetter() {
      public String get() {
        return meta.errorHandling.lineNumberFilesDestinationDirectory;
      }
    } );
    check( "LINE_NR_FILES_EXTENTION", new StringGetter() {
      public String get() {
        return meta.errorHandling.lineNumberFilesExtension;
      }
    } );
    check( "FILE_SHORT_FILE_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.shortFilenameField;
      }
    } );
    check( "FILE_EXTENSION_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.extensionField;
      }
    } );
    check( "FILE_PATH_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.pathField;
      }
    } );
    check( "FILE_SIZE_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.sizeField;
      }
    } );
    check( "FILE_HIDDEN_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.hiddenField;
      }
    } );
    check( "FILE_LAST_MODIFICATION_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.lastModificationField;
      }
    } );
    check( "FILE_URI_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.uriField;
      }
    } );
    check( "FILE_ROOT_URI_FIELDNAME", new StringGetter() {
      public String get() {
        return meta.additionalOutputFields.rootUriField;
      }
    } );
    check( "FILENAME", new StringGetter() {
      public String get() {
        return meta.inputFiles.fileName[0];
      }
    } );
    check( "FILEMASK", new StringGetter() {
      public String get() {
        return meta.inputFiles.fileMask[0];
      }
    } );
    check( "EXCLUDE_FILEMASK", new StringGetter() {
      public String get() {
        return meta.inputFiles.excludeFileMask[0];
      }
    } );
    check( "FILE_REQUIRED", new StringGetter() {
      public String get() {
        return meta.inputFiles.fileRequired[0];
      }
    } );
    check( "INCLUDE_SUBFOLDERS", new StringGetter() {
      public String get() {
        return meta.inputFiles.includeSubFolders[0];
      }
    } );
    check( "FIELD_NAME", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getName();
      }
    } );
    check( "FIELD_PATH", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getPath();
      }
    } );
    check( "FIELD_POSITION", new IntGetter() {
      public int get() {
        return meta.inputFiles.inputFields[0].getPosition();
      }
    } );
    check( "FIELD_LENGTH", new IntGetter() {
      public int get() {
        return meta.inputFiles.inputFields[0].getLength();
      }
    } );
    check( "FIELD_IGNORE", new BooleanGetter() {
      public boolean get() {
        return meta.inputFiles.inputFields[0].isIgnored();
      }
    } );
    check( "FIELD_FORMAT", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getFormat();
      }
    } );
    check( "FIELD_PRECISION", new IntGetter() {
      public int get() {
        return meta.inputFiles.inputFields[0].getPrecision();
      }
    } );
    check( "FIELD_CURRENCY", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getCurrencySymbol();
      }
    } );
    check( "FIELD_DECIMAL", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getDecimalSymbol();
      }
    } );
    check( "FIELD_GROUP", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getGroupSymbol();
      }
    } );
    check( "FIELD_REPEAT", new BooleanGetter() {
      public boolean get() {
        return meta.inputFiles.inputFields[0].isRepeated();
      }
    } );
    check( "FIELD_NULL_STRING", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getNullString();
      }
    } );
    check( "FIELD_IF_NULL", new StringGetter() {
      public String get() {
        return meta.inputFiles.inputFields[0].getIfNullValue();
      }
    } );

    ValueMetaInterface mftt = new ValueMetaString( "f" );
    injector.setProperty( meta, "FIELD_TRIM_TYPE", setValue( mftt, "left" ), "f" );
    assertEquals( 1, meta.inputFiles.inputFields[0].getTrimType() );
    injector.setProperty( meta, "FIELD_TRIM_TYPE", setValue( mftt, "right" ), "f" );
    assertEquals( 2, meta.inputFiles.inputFields[0].getTrimType() );
    skipPropertyTest( "FIELD_TRIM_TYPE" );

    skipPropertyTest( "FIELD_TYPE" );
  }
}
