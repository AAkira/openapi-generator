/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
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

package org.openapitools.codegen.templating.mustache;

import com.samskivert.mustache.Mustache;
import com.samskivert.mustache.Template.Fragment;

import java.io.IOException;
import java.io.Writer;

/**
 * Replaces duplicate line break characters in a fragment with single line break.
 * <p>
 * Register:
 * <pre>
 * additionalProperties.put("trimTrailingWhiteSpace", new TrimTrailingWhiteSpaceLambda());
 * </pre>
 * <p>
 * Use:
 * <pre>
 * {{#trimTrailingWhiteSpace}}{{name}}{{/trimTrailingWhiteSpace}}
 * </pre>
 */
public class TrimTrailingWhiteSpaceLambda implements Mustache.Lambda {
    private final boolean withNewLine;

    public TrimTrailingWhiteSpaceLambda(boolean withNewLine) {
        this.withNewLine = withNewLine;
    }

    @Override
    public void execute(Fragment fragment, Writer writer) throws IOException {
        writer.write(fragment.execute().stripTrailing());

        if (this.withNewLine) {
            writer.write("\n");
        }
    }
}
