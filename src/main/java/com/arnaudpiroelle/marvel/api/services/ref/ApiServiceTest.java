/**
 * Copyright (C) 2014 Arnaud Piroelle (contact@arnaudpiroelle.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arnaudpiroelle.marvel.api.services.ref;

import com.arnaudpiroelle.marvel.api.MarvelApiBuilder;

/**
 * Created by apiroelle on 24/07/2014.
 */
public class ApiServiceTest {

    public void setUp() throws Exception {

        String publicApiKey = System.getProperty("marvelPublicApiKey");
        String privateApiKey = System.getProperty("marvelPrivateApiKey");;

        MarvelApiBuilder.initMarvelApiBuilder(publicApiKey, privateApiKey);
    }
}
