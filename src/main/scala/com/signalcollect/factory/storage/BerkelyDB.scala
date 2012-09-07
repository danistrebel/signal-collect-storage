/*
 *  @author Daniel Strebel
 *  
 *  Copyright 2011 University of Zurich
 *      
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *         http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */

package com.signalcollect.factory.storage

import com.signalcollect.interfaces.Storage
import com.signalcollect.interfaces.StorageFactory
import com.signalcollect.storage.BerkDBJE
import com.signalcollect.storage.DefaultStorage

/**
 *  The Berkeley DB storage factory creates storage objects that store vertices in Berkeley DB.
 */
object BerkeleyDB extends StorageFactory {
  class BerkeleyDBStorage extends DefaultStorage with BerkDBJE
  def createInstance: Storage = new BerkeleyDBStorage
}