/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2019-2020 Pierre Leresteux.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import io.saagie.updatarium.dsl.action.BasicAction
import io.saagie.updatarium.dsl.changeSet
import io.saagie.updatarium.dsl.changelog

changelog {
    changesets {
        +changeSet {
            id = "ChangeSet-bash-2-1"
            author = "Bash"
            actions {
                +BasicAction {
                    (11..15).forEach {
                        logger.info { "Hello $it!" }
                    }

                }
            }
        }
        +changeSet {
            id = "ChangeSet-bash-2-2"
            author = "Bash"
            tags = listOf("before","after")
            actions {
                +BasicAction {
                    (16..20).forEach {
                        logger.info { "Hello $it!" }
                    }

                }
            }
        }
    }
}