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
 * A representation of the model object '<em><b>ICCP Information Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getLocalReference <em>Local Reference</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getScope <em>Scope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getTASE2BilateralTable <em>TASE2 Bilateral Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPInformationMessage()
 * @model
 * @generated
 */
public interface ICCPInformationMessage extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Local Reference</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local Reference</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local Reference</em>' attribute.
     * @see #isSetLocalReference()
     * @see #unsetLocalReference()
     * @see #setLocalReference(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPInformationMessage_LocalReference()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPInformationMessage.localReference' kind='element'"
     * @generated
     */
    String getLocalReference();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getLocalReference <em>Local Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local Reference</em>' attribute.
     * @see #isSetLocalReference()
     * @see #unsetLocalReference()
     * @see #getLocalReference()
     * @generated
     */
    void setLocalReference( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getLocalReference <em>Local Reference</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocalReference()
     * @see #getLocalReference()
     * @see #setLocalReference(String)
     * @generated
     */
    void unsetLocalReference();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getLocalReference <em>Local Reference</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Local Reference</em>' attribute is set.
     * @see #unsetLocalReference()
     * @see #getLocalReference()
     * @see #setLocalReference(String)
     * @generated
     */
    boolean isSetLocalReference();

    /**
     * Returns the value of the '<em><b>Scope</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scope</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scope</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #setScope(ICCPScope)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPInformationMessage_Scope()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPInformationMessage.scope' kind='element'"
     * @generated
     */
    ICCPScope getScope();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scope</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPScope
     * @see #isSetScope()
     * @see #unsetScope()
     * @see #getScope()
     * @generated
     */
    void setScope( ICCPScope value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getScope <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScope()
     * @see #getScope()
     * @see #setScope(ICCPScope)
     * @generated
     */
    void unsetScope();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getScope <em>Scope</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scope</em>' attribute is set.
     * @see #unsetScope()
     * @see #getScope()
     * @see #setScope(ICCPScope)
     * @generated
     */
    boolean isSetScope();

    /**
     * Returns the value of the '<em><b>TASE2 Bilateral Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getICCPInformationMessage <em>ICCP Information Message</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>TASE2 Bilateral Table</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>TASE2 Bilateral Table</em>' reference list.
     * @see #isSetTASE2BilateralTable()
     * @see #unsetTASE2BilateralTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getICCPInformationMessage_TASE2BilateralTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getICCPInformationMessage
     * @model opposite="ICCPInformationMessage" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ICCPInformationMessage.TASE2BilateralTable' kind='element'"
     * @generated
     */
    EList< TASE2BilateralTable > getTASE2BilateralTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getTASE2BilateralTable <em>TASE2 Bilateral Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTASE2BilateralTable()
     * @see #getTASE2BilateralTable()
     * @generated
     */
    void unsetTASE2BilateralTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getTASE2BilateralTable <em>TASE2 Bilateral Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>TASE2 Bilateral Table</em>' reference list is set.
     * @see #unsetTASE2BilateralTable()
     * @see #getTASE2BilateralTable()
     * @generated
     */
    boolean isSetTASE2BilateralTable();

} // ICCPInformationMessage
