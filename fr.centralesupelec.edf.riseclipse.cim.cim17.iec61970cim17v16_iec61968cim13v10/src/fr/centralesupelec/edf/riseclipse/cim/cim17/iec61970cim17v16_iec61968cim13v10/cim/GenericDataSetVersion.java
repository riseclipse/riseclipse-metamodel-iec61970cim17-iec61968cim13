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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Data Set Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMajorVersion <em>Major Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMinorVersion <em>Minor Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getPublished <em>Published</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenericDataSetVersion()
 * @model
 * @generated
 */
public interface GenericDataSetVersion extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Major Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Major Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Major Version</em>' attribute.
     * @see #isSetMajorVersion()
     * @see #unsetMajorVersion()
     * @see #setMajorVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenericDataSetVersion_MajorVersion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenericDataSetVersion.majorVersion' kind='element'"
     * @generated
     */
    String getMajorVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMajorVersion <em>Major Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Major Version</em>' attribute.
     * @see #isSetMajorVersion()
     * @see #unsetMajorVersion()
     * @see #getMajorVersion()
     * @generated
     */
    void setMajorVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMajorVersion <em>Major Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMajorVersion()
     * @see #getMajorVersion()
     * @see #setMajorVersion(String)
     * @generated
     */
    void unsetMajorVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMajorVersion <em>Major Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Major Version</em>' attribute is set.
     * @see #unsetMajorVersion()
     * @see #getMajorVersion()
     * @see #setMajorVersion(String)
     * @generated
     */
    boolean isSetMajorVersion();

    /**
     * Returns the value of the '<em><b>Minor Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minor Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minor Version</em>' attribute.
     * @see #isSetMinorVersion()
     * @see #unsetMinorVersion()
     * @see #setMinorVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenericDataSetVersion_MinorVersion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenericDataSetVersion.minorVersion' kind='element'"
     * @generated
     */
    String getMinorVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMinorVersion <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minor Version</em>' attribute.
     * @see #isSetMinorVersion()
     * @see #unsetMinorVersion()
     * @see #getMinorVersion()
     * @generated
     */
    void setMinorVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMinorVersion <em>Minor Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinorVersion()
     * @see #getMinorVersion()
     * @see #setMinorVersion(String)
     * @generated
     */
    void unsetMinorVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getMinorVersion <em>Minor Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minor Version</em>' attribute is set.
     * @see #unsetMinorVersion()
     * @see #getMinorVersion()
     * @see #setMinorVersion(String)
     * @generated
     */
    boolean isSetMinorVersion();

    /**
     * Returns the value of the '<em><b>Published</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Published</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Published</em>' attribute.
     * @see #isSetPublished()
     * @see #unsetPublished()
     * @see #setPublished(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGenericDataSetVersion_Published()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GenericDataSetVersion.published' kind='element'"
     * @generated
     */
    Date getPublished();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getPublished <em>Published</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Published</em>' attribute.
     * @see #isSetPublished()
     * @see #unsetPublished()
     * @see #getPublished()
     * @generated
     */
    void setPublished( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getPublished <em>Published</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPublished()
     * @see #getPublished()
     * @see #setPublished(Date)
     * @generated
     */
    void unsetPublished();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericDataSetVersion#getPublished <em>Published</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Published</em>' attribute is set.
     * @see #unsetPublished()
     * @see #getPublished()
     * @see #setPublished(Date)
     * @generated
     */
    boolean isSetPublished();

} // GenericDataSetVersion
