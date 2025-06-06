/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ArrayTest
    /// </summary>
    [DataContract(Name = "ArrayTest")]
    public partial class ArrayTest : IEquatable<ArrayTest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ArrayTest" /> class.
        /// </summary>
        /// <param name="arrayOfString">arrayOfString.</param>
        /// <param name="arrayArrayOfInteger">arrayArrayOfInteger.</param>
        /// <param name="arrayArrayOfModel">arrayArrayOfModel.</param>
        public ArrayTest(List<string> arrayOfString = default, List<List<long>> arrayArrayOfInteger = default, List<List<ReadOnlyFirst>> arrayArrayOfModel = default)
        {
            this.ArrayOfString = arrayOfString;
            this.ArrayArrayOfInteger = arrayArrayOfInteger;
            this.ArrayArrayOfModel = arrayArrayOfModel;
        }

        /// <summary>
        /// Gets or Sets ArrayOfString
        /// </summary>
        [DataMember(Name = "array_of_string", EmitDefaultValue = false)]
        public List<string> ArrayOfString { get; set; }

        /// <summary>
        /// Gets or Sets ArrayArrayOfInteger
        /// </summary>
        [DataMember(Name = "array_array_of_integer", EmitDefaultValue = false)]
        public List<List<long>> ArrayArrayOfInteger { get; set; }

        /// <summary>
        /// Gets or Sets ArrayArrayOfModel
        /// </summary>
        [DataMember(Name = "array_array_of_model", EmitDefaultValue = false)]
        public List<List<ReadOnlyFirst>> ArrayArrayOfModel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ArrayTest {\n");
            sb.Append("  ArrayOfString: ").Append(ArrayOfString).Append("\n");
            sb.Append("  ArrayArrayOfInteger: ").Append(ArrayArrayOfInteger).Append("\n");
            sb.Append("  ArrayArrayOfModel: ").Append(ArrayArrayOfModel).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input as ArrayTest).AreEqual;
        }

        /// <summary>
        /// Returns true if ArrayTest instances are equal
        /// </summary>
        /// <param name="input">Instance of ArrayTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayTest input)
        {
            return OpenAPIClientUtils.compareLogic.Compare(this, input).AreEqual;
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ArrayOfString != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayOfString.GetHashCode();
                }
                if (this.ArrayArrayOfInteger != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayArrayOfInteger.GetHashCode();
                }
                if (this.ArrayArrayOfModel != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayArrayOfModel.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
