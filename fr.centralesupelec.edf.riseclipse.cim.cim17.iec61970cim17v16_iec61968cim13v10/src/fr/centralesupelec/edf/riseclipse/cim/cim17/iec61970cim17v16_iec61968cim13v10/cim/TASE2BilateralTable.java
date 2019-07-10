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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TASE2 Bilateral Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableID <em>Bilateral Table ID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableVersion <em>Bilateral Table Version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getTase2version <em>Tase2version</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getICCPInformationMessage <em>ICCP Information Message</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTASE2BilateralTable()
 * @model
 * @generated
 */
public interface TASE2BilateralTable extends BilateralExchangeAgreement {
    /**
     * Returns the value of the '<em><b>Bilateral Table ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bilateral Table ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilateral Table ID</em>' attribute.
     * @see #isSetBilateralTableID()
     * @see #unsetBilateralTableID()
     * @see #setBilateralTableID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTASE2BilateralTable_BilateralTableID()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TASE2BilateralTable.bilateralTableID' kind='element'"
     * @generated
     */
    String getBilateralTableID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableID <em>Bilateral Table ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bilateral Table ID</em>' attribute.
     * @see #isSetBilateralTableID()
     * @see #unsetBilateralTableID()
     * @see #getBilateralTableID()
     * @generated
     */
    void setBilateralTableID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableID <em>Bilateral Table ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBilateralTableID()
     * @see #getBilateralTableID()
     * @see #setBilateralTableID(String)
     * @generated
     */
    void unsetBilateralTableID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableID <em>Bilateral Table ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bilateral Table ID</em>' attribute is set.
     * @see #unsetBilateralTableID()
     * @see #getBilateralTableID()
     * @see #setBilateralTableID(String)
     * @generated
     */
    boolean isSetBilateralTableID();

    /**
     * Returns the value of the '<em><b>Bilateral Table Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bilateral Table Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Bilateral Table Version</em>' attribute.
     * @see #isSetBilateralTableVersion()
     * @see #unsetBilateralTableVersion()
     * @see #setBilateralTableVersion(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTASE2BilateralTable_BilateralTableVersion()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TASE2BilateralTable.bilateralTableVersion' kind='element'"
     * @generated
     */
    String getBilateralTableVersion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableVersion <em>Bilateral Table Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bilateral Table Version</em>' attribute.
     * @see #isSetBilateralTableVersion()
     * @see #unsetBilateralTableVersion()
     * @see #getBilateralTableVersion()
     * @generated
     */
    void setBilateralTableVersion( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableVersion <em>Bilateral Table Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBilateralTableVersion()
     * @see #getBilateralTableVersion()
     * @see #setBilateralTableVersion(String)
     * @generated
     */
    void unsetBilateralTableVersion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getBilateralTableVersion <em>Bilateral Table Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bilateral Table Version</em>' attribute is set.
     * @see #unsetBilateralTableVersion()
     * @see #getBilateralTableVersion()
     * @see #setBilateralTableVersion(String)
     * @generated
     */
    boolean isSetBilateralTableVersion();

    /**
     * Returns the value of the '<em><b>Tase2version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tase2version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tase2version</em>' attribute.
     * @see #isSetTase2version()
     * @see #unsetTase2version()
     * @see #setTase2version(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTASE2BilateralTable_Tase2version()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TASE2BilateralTable.tase2version' kind='element'"
     * @generated
     */
    String getTase2version();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getTase2version <em>Tase2version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tase2version</em>' attribute.
     * @see #isSetTase2version()
     * @see #unsetTase2version()
     * @see #getTase2version()
     * @generated
     */
    void setTase2version( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getTase2version <em>Tase2version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTase2version()
     * @see #getTase2version()
     * @see #setTase2version(String)
     * @generated
     */
    void unsetTase2version();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getTase2version <em>Tase2version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tase2version</em>' attribute is set.
     * @see #unsetTase2version()
     * @see #getTase2version()
     * @see #setTase2version(String)
     * @generated
     */
    boolean isSetTase2version();

    /**
     * Returns the value of the '<em><b>ICCP Information Message</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getTASE2BilateralTable <em>TASE2 Bilateral Table</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>ICCP Information Message</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>ICCP Information Message</em>' reference list.
     * @see #isSetICCPInformationMessage()
     * @see #unsetICCPInformationMessage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTASE2BilateralTable_ICCPInformationMessage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ICCPInformationMessage#getTASE2BilateralTable
     * @model opposite="TASE2BilateralTable" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TASE2BilateralTable.ICCPInformationMessage' kind='element'"
     * @generated
     */
    EList< ICCPInformationMessage > getICCPInformationMessage();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getICCPInformationMessage <em>ICCP Information Message</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetICCPInformationMessage()
     * @see #getICCPInformationMessage()
     * @generated
     */
    void unsetICCPInformationMessage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TASE2BilateralTable#getICCPInformationMessage <em>ICCP Information Message</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ICCP Information Message</em>' reference list is set.
     * @see #unsetICCPInformationMessage()
     * @see #getICCPInformationMessage()
     * @generated
     */
    boolean isSetICCPInformationMessage();

} // TASE2BilateralTable
