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
    /// NullableClass
    /// </summary>
    [DataContract(Name = "NullableClass")]
    public partial class NullableClass : IEquatable<NullableClass>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NullableClass" /> class.
        /// </summary>
        /// <param name="integerProp">integerProp.</param>
        /// <param name="numberProp">numberProp.</param>
        /// <param name="booleanProp">booleanProp.</param>
        /// <param name="stringProp">stringProp.</param>
        /// <param name="dateProp">dateProp.</param>
        /// <param name="datetimeProp">datetimeProp.</param>
        /// <param name="arrayNullableProp">arrayNullableProp.</param>
        /// <param name="arrayAndItemsNullableProp">arrayAndItemsNullableProp.</param>
        /// <param name="arrayItemsNullable">arrayItemsNullable.</param>
        /// <param name="objectNullableProp">objectNullableProp.</param>
        /// <param name="objectAndItemsNullableProp">objectAndItemsNullableProp.</param>
        /// <param name="objectItemsNullable">objectItemsNullable.</param>
        public NullableClass(int? integerProp = default, decimal? numberProp = default, bool? booleanProp = default, string stringProp = default, DateTime? dateProp = default, DateTime? datetimeProp = default, List<Object> arrayNullableProp = default, List<Object> arrayAndItemsNullableProp = default, List<Object> arrayItemsNullable = default, Dictionary<string, Object> objectNullableProp = default, Dictionary<string, Object> objectAndItemsNullableProp = default, Dictionary<string, Object> objectItemsNullable = default)
        {
            this._IntegerProp = integerProp;
            if (this.IntegerProp != null)
            {
                this._flagIntegerProp = true;
            }
            this._NumberProp = numberProp;
            if (this.NumberProp != null)
            {
                this._flagNumberProp = true;
            }
            this._BooleanProp = booleanProp;
            if (this.BooleanProp != null)
            {
                this._flagBooleanProp = true;
            }
            this._StringProp = stringProp;
            if (this.StringProp != null)
            {
                this._flagStringProp = true;
            }
            this._DateProp = dateProp;
            if (this.DateProp != null)
            {
                this._flagDateProp = true;
            }
            this._DatetimeProp = datetimeProp;
            if (this.DatetimeProp != null)
            {
                this._flagDatetimeProp = true;
            }
            this._ArrayNullableProp = arrayNullableProp;
            if (this.ArrayNullableProp != null)
            {
                this._flagArrayNullableProp = true;
            }
            this._ArrayAndItemsNullableProp = arrayAndItemsNullableProp;
            if (this.ArrayAndItemsNullableProp != null)
            {
                this._flagArrayAndItemsNullableProp = true;
            }
            this._ArrayItemsNullable = arrayItemsNullable;
            if (this.ArrayItemsNullable != null)
            {
                this._flagArrayItemsNullable = true;
            }
            this._ObjectNullableProp = objectNullableProp;
            if (this.ObjectNullableProp != null)
            {
                this._flagObjectNullableProp = true;
            }
            this._ObjectAndItemsNullableProp = objectAndItemsNullableProp;
            if (this.ObjectAndItemsNullableProp != null)
            {
                this._flagObjectAndItemsNullableProp = true;
            }
            this._ObjectItemsNullable = objectItemsNullable;
            if (this.ObjectItemsNullable != null)
            {
                this._flagObjectItemsNullable = true;
            }
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets IntegerProp
        /// </summary>
        [DataMember(Name = "integer_prop", EmitDefaultValue = true)]
        public int? IntegerProp
        {
            get{ return _IntegerProp;}
            set
            {
                _IntegerProp = value;
                _flagIntegerProp = true;
            }
        }
        private int? _IntegerProp;
        private bool _flagIntegerProp;

        /// <summary>
        /// Returns false as IntegerProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeIntegerProp()
        {
            return _flagIntegerProp;
        }
        /// <summary>
        /// Gets or Sets NumberProp
        /// </summary>
        [DataMember(Name = "number_prop", EmitDefaultValue = true)]
        public decimal? NumberProp
        {
            get{ return _NumberProp;}
            set
            {
                _NumberProp = value;
                _flagNumberProp = true;
            }
        }
        private decimal? _NumberProp;
        private bool _flagNumberProp;

        /// <summary>
        /// Returns false as NumberProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeNumberProp()
        {
            return _flagNumberProp;
        }
        /// <summary>
        /// Gets or Sets BooleanProp
        /// </summary>
        [DataMember(Name = "boolean_prop", EmitDefaultValue = true)]
        public bool? BooleanProp
        {
            get{ return _BooleanProp;}
            set
            {
                _BooleanProp = value;
                _flagBooleanProp = true;
            }
        }
        private bool? _BooleanProp;
        private bool _flagBooleanProp;

        /// <summary>
        /// Returns false as BooleanProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeBooleanProp()
        {
            return _flagBooleanProp;
        }
        /// <summary>
        /// Gets or Sets StringProp
        /// </summary>
        [DataMember(Name = "string_prop", EmitDefaultValue = true)]
        public string StringProp
        {
            get{ return _StringProp;}
            set
            {
                _StringProp = value;
                _flagStringProp = true;
            }
        }
        private string _StringProp;
        private bool _flagStringProp;

        /// <summary>
        /// Returns false as StringProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeStringProp()
        {
            return _flagStringProp;
        }
        /// <summary>
        /// Gets or Sets DateProp
        /// </summary>
        [JsonConverter(typeof(OpenAPIDateConverter))]
        [DataMember(Name = "date_prop", EmitDefaultValue = true)]
        public DateTime? DateProp
        {
            get{ return _DateProp;}
            set
            {
                _DateProp = value;
                _flagDateProp = true;
            }
        }
        private DateTime? _DateProp;
        private bool _flagDateProp;

        /// <summary>
        /// Returns false as DateProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeDateProp()
        {
            return _flagDateProp;
        }
        /// <summary>
        /// Gets or Sets DatetimeProp
        /// </summary>
        [DataMember(Name = "datetime_prop", EmitDefaultValue = true)]
        public DateTime? DatetimeProp
        {
            get{ return _DatetimeProp;}
            set
            {
                _DatetimeProp = value;
                _flagDatetimeProp = true;
            }
        }
        private DateTime? _DatetimeProp;
        private bool _flagDatetimeProp;

        /// <summary>
        /// Returns false as DatetimeProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeDatetimeProp()
        {
            return _flagDatetimeProp;
        }
        /// <summary>
        /// Gets or Sets ArrayNullableProp
        /// </summary>
        [DataMember(Name = "array_nullable_prop", EmitDefaultValue = true)]
        public List<Object> ArrayNullableProp
        {
            get{ return _ArrayNullableProp;}
            set
            {
                _ArrayNullableProp = value;
                _flagArrayNullableProp = true;
            }
        }
        private List<Object> _ArrayNullableProp;
        private bool _flagArrayNullableProp;

        /// <summary>
        /// Returns false as ArrayNullableProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayNullableProp()
        {
            return _flagArrayNullableProp;
        }
        /// <summary>
        /// Gets or Sets ArrayAndItemsNullableProp
        /// </summary>
        [DataMember(Name = "array_and_items_nullable_prop", EmitDefaultValue = true)]
        public List<Object> ArrayAndItemsNullableProp
        {
            get{ return _ArrayAndItemsNullableProp;}
            set
            {
                _ArrayAndItemsNullableProp = value;
                _flagArrayAndItemsNullableProp = true;
            }
        }
        private List<Object> _ArrayAndItemsNullableProp;
        private bool _flagArrayAndItemsNullableProp;

        /// <summary>
        /// Returns false as ArrayAndItemsNullableProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayAndItemsNullableProp()
        {
            return _flagArrayAndItemsNullableProp;
        }
        /// <summary>
        /// Gets or Sets ArrayItemsNullable
        /// </summary>
        [DataMember(Name = "array_items_nullable", EmitDefaultValue = false)]
        public List<Object> ArrayItemsNullable
        {
            get{ return _ArrayItemsNullable;}
            set
            {
                _ArrayItemsNullable = value;
                _flagArrayItemsNullable = true;
            }
        }
        private List<Object> _ArrayItemsNullable;
        private bool _flagArrayItemsNullable;

        /// <summary>
        /// Returns false as ArrayItemsNullable should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeArrayItemsNullable()
        {
            return _flagArrayItemsNullable;
        }
        /// <summary>
        /// Gets or Sets ObjectNullableProp
        /// </summary>
        [DataMember(Name = "object_nullable_prop", EmitDefaultValue = true)]
        public Dictionary<string, Object> ObjectNullableProp
        {
            get{ return _ObjectNullableProp;}
            set
            {
                _ObjectNullableProp = value;
                _flagObjectNullableProp = true;
            }
        }
        private Dictionary<string, Object> _ObjectNullableProp;
        private bool _flagObjectNullableProp;

        /// <summary>
        /// Returns false as ObjectNullableProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeObjectNullableProp()
        {
            return _flagObjectNullableProp;
        }
        /// <summary>
        /// Gets or Sets ObjectAndItemsNullableProp
        /// </summary>
        [DataMember(Name = "object_and_items_nullable_prop", EmitDefaultValue = true)]
        public Dictionary<string, Object> ObjectAndItemsNullableProp
        {
            get{ return _ObjectAndItemsNullableProp;}
            set
            {
                _ObjectAndItemsNullableProp = value;
                _flagObjectAndItemsNullableProp = true;
            }
        }
        private Dictionary<string, Object> _ObjectAndItemsNullableProp;
        private bool _flagObjectAndItemsNullableProp;

        /// <summary>
        /// Returns false as ObjectAndItemsNullableProp should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeObjectAndItemsNullableProp()
        {
            return _flagObjectAndItemsNullableProp;
        }
        /// <summary>
        /// Gets or Sets ObjectItemsNullable
        /// </summary>
        [DataMember(Name = "object_items_nullable", EmitDefaultValue = false)]
        public Dictionary<string, Object> ObjectItemsNullable
        {
            get{ return _ObjectItemsNullable;}
            set
            {
                _ObjectItemsNullable = value;
                _flagObjectItemsNullable = true;
            }
        }
        private Dictionary<string, Object> _ObjectItemsNullable;
        private bool _flagObjectItemsNullable;

        /// <summary>
        /// Returns false as ObjectItemsNullable should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeObjectItemsNullable()
        {
            return _flagObjectItemsNullable;
        }
        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NullableClass {\n");
            sb.Append("  IntegerProp: ").Append(IntegerProp).Append("\n");
            sb.Append("  NumberProp: ").Append(NumberProp).Append("\n");
            sb.Append("  BooleanProp: ").Append(BooleanProp).Append("\n");
            sb.Append("  StringProp: ").Append(StringProp).Append("\n");
            sb.Append("  DateProp: ").Append(DateProp).Append("\n");
            sb.Append("  DatetimeProp: ").Append(DatetimeProp).Append("\n");
            sb.Append("  ArrayNullableProp: ").Append(ArrayNullableProp).Append("\n");
            sb.Append("  ArrayAndItemsNullableProp: ").Append(ArrayAndItemsNullableProp).Append("\n");
            sb.Append("  ArrayItemsNullable: ").Append(ArrayItemsNullable).Append("\n");
            sb.Append("  ObjectNullableProp: ").Append(ObjectNullableProp).Append("\n");
            sb.Append("  ObjectAndItemsNullableProp: ").Append(ObjectAndItemsNullableProp).Append("\n");
            sb.Append("  ObjectItemsNullable: ").Append(ObjectItemsNullable).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
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
            return OpenAPIClientUtils.compareLogic.Compare(this, input as NullableClass).AreEqual;
        }

        /// <summary>
        /// Returns true if NullableClass instances are equal
        /// </summary>
        /// <param name="input">Instance of NullableClass to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NullableClass input)
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
                if (this.IntegerProp != null)
                {
                    hashCode = (hashCode * 59) + this.IntegerProp.GetHashCode();
                }
                if (this.NumberProp != null)
                {
                    hashCode = (hashCode * 59) + this.NumberProp.GetHashCode();
                }
                if (this.BooleanProp != null)
                {
                    hashCode = (hashCode * 59) + this.BooleanProp.GetHashCode();
                }
                if (this.StringProp != null)
                {
                    hashCode = (hashCode * 59) + this.StringProp.GetHashCode();
                }
                if (this.DateProp != null)
                {
                    hashCode = (hashCode * 59) + this.DateProp.GetHashCode();
                }
                if (this.DatetimeProp != null)
                {
                    hashCode = (hashCode * 59) + this.DatetimeProp.GetHashCode();
                }
                if (this.ArrayNullableProp != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayNullableProp.GetHashCode();
                }
                if (this.ArrayAndItemsNullableProp != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayAndItemsNullableProp.GetHashCode();
                }
                if (this.ArrayItemsNullable != null)
                {
                    hashCode = (hashCode * 59) + this.ArrayItemsNullable.GetHashCode();
                }
                if (this.ObjectNullableProp != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectNullableProp.GetHashCode();
                }
                if (this.ObjectAndItemsNullableProp != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectAndItemsNullableProp.GetHashCode();
                }
                if (this.ObjectItemsNullable != null)
                {
                    hashCode = (hashCode * 59) + this.ObjectItemsNullable.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
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
