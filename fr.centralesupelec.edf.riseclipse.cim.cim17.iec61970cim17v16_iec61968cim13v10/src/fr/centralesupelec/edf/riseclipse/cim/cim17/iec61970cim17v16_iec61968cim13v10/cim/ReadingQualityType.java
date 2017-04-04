/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Quality Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSubCategory <em>Sub Category</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSystemId <em>System Id</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getReadingQualities <em>Reading Qualities</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingQualityType()
 * @model
 * @generated
 */
public interface ReadingQualityType extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Category</em>' attribute.
     * @see #isSetCategory()
     * @see #unsetCategory()
     * @see #setCategory(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingQualityType_Category()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingQualityType.category' kind='element'"
     * @generated
     */
    String getCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Category</em>' attribute.
     * @see #isSetCategory()
     * @see #unsetCategory()
     * @see #getCategory()
     * @generated
     */
    void setCategory( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getCategory <em>Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCategory()
     * @see #getCategory()
     * @see #setCategory(String)
     * @generated
     */
    void unsetCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getCategory <em>Category</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Category</em>' attribute is set.
     * @see #unsetCategory()
     * @see #getCategory()
     * @see #setCategory(String)
     * @generated
     */
    boolean isSetCategory();

    /**
     * Returns the value of the '<em><b>Sub Category</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sub Category</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sub Category</em>' attribute.
     * @see #isSetSubCategory()
     * @see #unsetSubCategory()
     * @see #setSubCategory(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingQualityType_SubCategory()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingQualityType.subCategory' kind='element'"
     * @generated
     */
    String getSubCategory();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSubCategory <em>Sub Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Category</em>' attribute.
     * @see #isSetSubCategory()
     * @see #unsetSubCategory()
     * @see #getSubCategory()
     * @generated
     */
    void setSubCategory( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSubCategory <em>Sub Category</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubCategory()
     * @see #getSubCategory()
     * @see #setSubCategory(String)
     * @generated
     */
    void unsetSubCategory();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSubCategory <em>Sub Category</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Category</em>' attribute is set.
     * @see #unsetSubCategory()
     * @see #getSubCategory()
     * @see #setSubCategory(String)
     * @generated
     */
    boolean isSetSubCategory();

    /**
     * Returns the value of the '<em><b>System Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>System Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>System Id</em>' attribute.
     * @see #isSetSystemId()
     * @see #unsetSystemId()
     * @see #setSystemId(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingQualityType_SystemId()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingQualityType.systemId' kind='element'"
     * @generated
     */
    String getSystemId();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSystemId <em>System Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>System Id</em>' attribute.
     * @see #isSetSystemId()
     * @see #unsetSystemId()
     * @see #getSystemId()
     * @generated
     */
    void setSystemId( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSystemId <em>System Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSystemId()
     * @see #getSystemId()
     * @see #setSystemId(String)
     * @generated
     */
    void unsetSystemId();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getSystemId <em>System Id</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>System Id</em>' attribute is set.
     * @see #unsetSystemId()
     * @see #getSystemId()
     * @see #setSystemId(String)
     * @generated
     */
    boolean isSetSystemId();

    /**
     * Returns the value of the '<em><b>Reading Qualities</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality#getReadingQualityType <em>Reading Quality Type</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reading Qualities</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reading Qualities</em>' reference list.
     * @see #isSetReadingQualities()
     * @see #unsetReadingQualities()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getReadingQualityType_ReadingQualities()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality#getReadingQualityType
     * @model opposite="ReadingQualityType" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ReadingQualityType.ReadingQualities' kind='element'"
     * @generated
     */
    EList< ReadingQuality > getReadingQualities();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getReadingQualities <em>Reading Qualities</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReadingQualities()
     * @see #getReadingQualities()
     * @generated
     */
    void unsetReadingQualities();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType#getReadingQualities <em>Reading Qualities</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reading Qualities</em>' reference list is set.
     * @see #unsetReadingQualities()
     * @see #getReadingQualities()
     * @generated
     */
    boolean isSetReadingQualities();

} // ReadingQualityType
