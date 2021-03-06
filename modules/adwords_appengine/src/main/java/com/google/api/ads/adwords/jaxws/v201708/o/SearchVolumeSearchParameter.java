// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201708.o;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link SearchParameter} that specifies the level of search volume expected in results,
 *             and it has a direct relationship to {@link AttributeType#SEARCH_VOLUME SEARCH_VOLUME}. Absence of
 *             a {@link SearchVolumeSearchParameter} in a {@link TargetingIdeaSelector} is equivalent to having
 *             no constraint on search volume specified.
 *             <p>This element is supported by following {@link IdeaType}s: KEYWORD.
 *             <p>This element is supported by following {@link RequestType}s: IDEAS, STATS.
 *           
 * 
 * <p>Java class for SearchVolumeSearchParameter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchVolumeSearchParameter">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201708}SearchParameter">
 *       &lt;sequence>
 *         &lt;element name="operation" type="{https://adwords.google.com/api/adwords/o/v201708}LongComparisonOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchVolumeSearchParameter", propOrder = {
    "operation"
})
public class SearchVolumeSearchParameter
    extends SearchParameter
{

    protected LongComparisonOperation operation;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link LongComparisonOperation }
     *     
     */
    public LongComparisonOperation getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongComparisonOperation }
     *     
     */
    public void setOperation(LongComparisonOperation value) {
        this.operation = value;
    }

}
