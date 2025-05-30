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
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Descendant1
    /// </summary>
    [DataContract(Name = "Descendant1")]
    public partial class Descendant1 : TestDescendants, IEquatable<Descendant1>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Descendant1" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Descendant1() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Descendant1" /> class.
        /// </summary>
        /// <param name="descendantName">descendantName (required).</param>
        /// <param name="alternativeName">alternativeName (required).</param>
        /// <param name="objectType">objectType (required) (default to ObjectTypeEnum.Descendant1).</param>
        public Descendant1(string descendantName = default, string alternativeName = default, ObjectTypeEnum objectType = ObjectTypeEnum.Descendant1) : base(alternativeName, objectType)
        {
            // to ensure "descendantName" is required (not null)
            if (descendantName == null)
            {
                throw new ArgumentNullException("descendantName is a required property for Descendant1 and cannot be null");
            }
            this.DescendantName = descendantName;
        }

        /// <summary>
        /// Gets or Sets DescendantName
        /// </summary>
        [DataMember(Name = "descendantName", IsRequired = true, EmitDefaultValue = true)]
        public string DescendantName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Descendant1 {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  DescendantName: ").Append(DescendantName).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
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
            return this.Equals(input as Descendant1);
        }

        /// <summary>
        /// Returns true if Descendant1 instances are equal
        /// </summary>
        /// <param name="input">Instance of Descendant1 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Descendant1 input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.DescendantName == input.DescendantName ||
                    (this.DescendantName != null &&
                    this.DescendantName.Equals(input.DescendantName))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = base.GetHashCode();
                if (this.DescendantName != null)
                {
                    hashCode = (hashCode * 59) + this.DescendantName.GetHashCode();
                }
                return hashCode;
            }
        }

    }

}
