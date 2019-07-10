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
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMName <em>MName</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSpecialNeed <em>Special Need</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSuffix <em>Suffix</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLandlinePhone <em>Landline Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMobilePhone <em>Mobile Phone</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Name</em>' attribute.
     * @see #isSetFirstName()
     * @see #unsetFirstName()
     * @see #setFirstName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_FirstName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.firstName' kind='element'"
     * @generated
     */
    String getFirstName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Name</em>' attribute.
     * @see #isSetFirstName()
     * @see #unsetFirstName()
     * @see #getFirstName()
     * @generated
     */
    void setFirstName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFirstName()
     * @see #getFirstName()
     * @see #setFirstName(String)
     * @generated
     */
    void unsetFirstName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getFirstName <em>First Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>First Name</em>' attribute is set.
     * @see #unsetFirstName()
     * @see #getFirstName()
     * @see #setFirstName(String)
     * @generated
     */
    boolean isSetFirstName();

    /**
     * Returns the value of the '<em><b>Last Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Last Name</em>' attribute.
     * @see #isSetLastName()
     * @see #unsetLastName()
     * @see #setLastName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_LastName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.lastName' kind='element'"
     * @generated
     */
    String getLastName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLastName <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Last Name</em>' attribute.
     * @see #isSetLastName()
     * @see #unsetLastName()
     * @see #getLastName()
     * @generated
     */
    void setLastName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLastName <em>Last Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLastName()
     * @see #getLastName()
     * @see #setLastName(String)
     * @generated
     */
    void unsetLastName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLastName <em>Last Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Last Name</em>' attribute is set.
     * @see #unsetLastName()
     * @see #getLastName()
     * @see #setLastName(String)
     * @generated
     */
    boolean isSetLastName();

    /**
     * Returns the value of the '<em><b>MName</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>MName</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>MName</em>' attribute.
     * @see #isSetMName()
     * @see #unsetMName()
     * @see #setMName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_MName()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.mName' kind='element'"
     * @generated
     */
    String getMName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMName <em>MName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MName</em>' attribute.
     * @see #isSetMName()
     * @see #unsetMName()
     * @see #getMName()
     * @generated
     */
    void setMName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMName <em>MName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMName()
     * @see #getMName()
     * @see #setMName(String)
     * @generated
     */
    void unsetMName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMName <em>MName</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MName</em>' attribute is set.
     * @see #unsetMName()
     * @see #getMName()
     * @see #setMName(String)
     * @generated
     */
    boolean isSetMName();

    /**
     * Returns the value of the '<em><b>Prefix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #setPrefix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_Prefix()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.prefix' kind='element'"
     * @generated
     */
    String getPrefix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefix</em>' attribute.
     * @see #isSetPrefix()
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @generated
     */
    void setPrefix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getPrefix <em>Prefix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    void unsetPrefix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getPrefix <em>Prefix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefix</em>' attribute is set.
     * @see #unsetPrefix()
     * @see #getPrefix()
     * @see #setPrefix(String)
     * @generated
     */
    boolean isSetPrefix();

    /**
     * Returns the value of the '<em><b>Special Need</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Special Need</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Special Need</em>' attribute.
     * @see #isSetSpecialNeed()
     * @see #unsetSpecialNeed()
     * @see #setSpecialNeed(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_SpecialNeed()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.specialNeed' kind='element'"
     * @generated
     */
    String getSpecialNeed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSpecialNeed <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Special Need</em>' attribute.
     * @see #isSetSpecialNeed()
     * @see #unsetSpecialNeed()
     * @see #getSpecialNeed()
     * @generated
     */
    void setSpecialNeed( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSpecialNeed <em>Special Need</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpecialNeed()
     * @see #getSpecialNeed()
     * @see #setSpecialNeed(String)
     * @generated
     */
    void unsetSpecialNeed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSpecialNeed <em>Special Need</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Special Need</em>' attribute is set.
     * @see #unsetSpecialNeed()
     * @see #getSpecialNeed()
     * @see #setSpecialNeed(String)
     * @generated
     */
    boolean isSetSpecialNeed();

    /**
     * Returns the value of the '<em><b>Suffix</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #setSuffix(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_Suffix()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.suffix' kind='element'"
     * @generated
     */
    String getSuffix();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Suffix</em>' attribute.
     * @see #isSetSuffix()
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @generated
     */
    void setSuffix( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSuffix <em>Suffix</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    void unsetSuffix();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getSuffix <em>Suffix</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Suffix</em>' attribute is set.
     * @see #unsetSuffix()
     * @see #getSuffix()
     * @see #setSuffix(String)
     * @generated
     */
    boolean isSetSuffix();

    /**
     * Returns the value of the '<em><b>Electronic Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Electronic Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Electronic Address</em>' containment reference.
     * @see #isSetElectronicAddress()
     * @see #unsetElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_ElectronicAddress()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.electronicAddress' kind='element'"
     * @generated
     */
    ElectronicAddress getElectronicAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getElectronicAddress <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Electronic Address</em>' containment reference.
     * @see #isSetElectronicAddress()
     * @see #unsetElectronicAddress()
     * @see #getElectronicAddress()
     * @generated
     */
    void setElectronicAddress( ElectronicAddress value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getElectronicAddress <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetElectronicAddress()
     * @see #getElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @generated
     */
    void unsetElectronicAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getElectronicAddress <em>Electronic Address</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Electronic Address</em>' containment reference is set.
     * @see #unsetElectronicAddress()
     * @see #getElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @generated
     */
    boolean isSetElectronicAddress();

    /**
     * Returns the value of the '<em><b>Landline Phone</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Landline Phone</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Landline Phone</em>' containment reference.
     * @see #isSetLandlinePhone()
     * @see #unsetLandlinePhone()
     * @see #setLandlinePhone(TelephoneNumber)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_LandlinePhone()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.landlinePhone' kind='element'"
     * @generated
     */
    TelephoneNumber getLandlinePhone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLandlinePhone <em>Landline Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Landline Phone</em>' containment reference.
     * @see #isSetLandlinePhone()
     * @see #unsetLandlinePhone()
     * @see #getLandlinePhone()
     * @generated
     */
    void setLandlinePhone( TelephoneNumber value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLandlinePhone <em>Landline Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLandlinePhone()
     * @see #getLandlinePhone()
     * @see #setLandlinePhone(TelephoneNumber)
     * @generated
     */
    void unsetLandlinePhone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getLandlinePhone <em>Landline Phone</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Landline Phone</em>' containment reference is set.
     * @see #unsetLandlinePhone()
     * @see #getLandlinePhone()
     * @see #setLandlinePhone(TelephoneNumber)
     * @generated
     */
    boolean isSetLandlinePhone();

    /**
     * Returns the value of the '<em><b>Mobile Phone</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mobile Phone</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mobile Phone</em>' containment reference.
     * @see #isSetMobilePhone()
     * @see #unsetMobilePhone()
     * @see #setMobilePhone(TelephoneNumber)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_MobilePhone()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.mobilePhone' kind='element'"
     * @generated
     */
    TelephoneNumber getMobilePhone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMobilePhone <em>Mobile Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mobile Phone</em>' containment reference.
     * @see #isSetMobilePhone()
     * @see #unsetMobilePhone()
     * @see #getMobilePhone()
     * @generated
     */
    void setMobilePhone( TelephoneNumber value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMobilePhone <em>Mobile Phone</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMobilePhone()
     * @see #getMobilePhone()
     * @see #setMobilePhone(TelephoneNumber)
     * @generated
     */
    void unsetMobilePhone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getMobilePhone <em>Mobile Phone</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mobile Phone</em>' containment reference is set.
     * @see #unsetMobilePhone()
     * @see #getMobilePhone()
     * @see #setMobilePhone(TelephoneNumber)
     * @generated
     */
    boolean isSetMobilePhone();

    /**
     * Returns the value of the '<em><b>Roles</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson <em>Person</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roles</em>' reference list.
     * @see #isSetRoles()
     * @see #unsetRoles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPerson_Roles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson
     * @model opposite="Person" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Person.Roles' kind='element'"
     * @generated
     */
    EList< PersonRole > getRoles();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getRoles <em>Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRoles()
     * @see #getRoles()
     * @generated
     */
    void unsetRoles();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getRoles <em>Roles</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Roles</em>' reference list is set.
     * @see #unsetRoles()
     * @see #getRoles()
     * @generated
     */
    boolean isSetRoles();

} // Person
