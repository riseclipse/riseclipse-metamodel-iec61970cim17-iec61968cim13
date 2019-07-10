/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Set Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject <em>Target Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject <em>Properties Object</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDataSetMember()
 * @model
 * @generated
 */
public interface DataSetMember extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Target Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getTargetingCIMDataObject <em>Targeting CIM Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Object</em>' reference.
     * @see #isSetTargetObject()
     * @see #unsetTargetObject()
     * @see #setTargetObject(IdentifiedObject)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDataSetMember_TargetObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getTargetingCIMDataObject
     * @model opposite="TargetingCIMDataObject" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DataSetMember.TargetObject' kind='element'"
     * @generated
     */
    IdentifiedObject getTargetObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject <em>Target Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Object</em>' reference.
     * @see #isSetTargetObject()
     * @see #unsetTargetObject()
     * @see #getTargetObject()
     * @generated
     */
    void setTargetObject( IdentifiedObject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject <em>Target Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetObject()
     * @see #getTargetObject()
     * @see #setTargetObject(IdentifiedObject)
     * @generated
     */
    void unsetTargetObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getTargetObject <em>Target Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Object</em>' reference is set.
     * @see #unsetTargetObject()
     * @see #getTargetObject()
     * @see #setTargetObject(IdentifiedObject)
     * @generated
     */
    boolean isSetTargetObject();

    /**
     * Returns the value of the '<em><b>Properties Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject <em>Properties CIM Data Object</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties Object</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties Object</em>' reference.
     * @see #isSetPropertiesObject()
     * @see #unsetPropertiesObject()
     * @see #setPropertiesObject(IdentifiedObject)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDataSetMember_PropertiesObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IdentifiedObject#getPropertiesCIMDataObject
     * @model opposite="PropertiesCIMDataObject" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DataSetMember.PropertiesObject' kind='element'"
     * @generated
     */
    IdentifiedObject getPropertiesObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject <em>Properties Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties Object</em>' reference.
     * @see #isSetPropertiesObject()
     * @see #unsetPropertiesObject()
     * @see #getPropertiesObject()
     * @generated
     */
    void setPropertiesObject( IdentifiedObject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject <em>Properties Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPropertiesObject()
     * @see #getPropertiesObject()
     * @see #setPropertiesObject(IdentifiedObject)
     * @generated
     */
    void unsetPropertiesObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DataSetMember#getPropertiesObject <em>Properties Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Properties Object</em>' reference is set.
     * @see #unsetPropertiesObject()
     * @see #getPropertiesObject()
     * @see #setPropertiesObject(IdentifiedObject)
     * @generated
     */
    boolean isSetPropertiesObject();

} // DataSetMember
