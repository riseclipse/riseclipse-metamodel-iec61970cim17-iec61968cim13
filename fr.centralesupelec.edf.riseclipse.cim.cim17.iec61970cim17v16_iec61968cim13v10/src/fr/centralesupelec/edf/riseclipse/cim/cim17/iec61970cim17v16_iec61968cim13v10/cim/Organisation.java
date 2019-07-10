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
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone1 <em>Phone1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone2 <em>Phone2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPostalAddress <em>Postal Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getRoles <em>Roles</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getParentOrganisation <em>Parent Organisation</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends IdentifiedObject {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_ElectronicAddress()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.electronicAddress' kind='element'"
     * @generated
     */
    ElectronicAddress getElectronicAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getElectronicAddress <em>Electronic Address</em>}' containment reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getElectronicAddress <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetElectronicAddress()
     * @see #getElectronicAddress()
     * @see #setElectronicAddress(ElectronicAddress)
     * @generated
     */
    void unsetElectronicAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getElectronicAddress <em>Electronic Address</em>}' containment reference is set.
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
     * Returns the value of the '<em><b>Phone1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phone1</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phone1</em>' containment reference.
     * @see #isSetPhone1()
     * @see #unsetPhone1()
     * @see #setPhone1(TelephoneNumber)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_Phone1()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.phone1' kind='element'"
     * @generated
     */
    TelephoneNumber getPhone1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone1 <em>Phone1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phone1</em>' containment reference.
     * @see #isSetPhone1()
     * @see #unsetPhone1()
     * @see #getPhone1()
     * @generated
     */
    void setPhone1( TelephoneNumber value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone1 <em>Phone1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhone1()
     * @see #getPhone1()
     * @see #setPhone1(TelephoneNumber)
     * @generated
     */
    void unsetPhone1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone1 <em>Phone1</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phone1</em>' containment reference is set.
     * @see #unsetPhone1()
     * @see #getPhone1()
     * @see #setPhone1(TelephoneNumber)
     * @generated
     */
    boolean isSetPhone1();

    /**
     * Returns the value of the '<em><b>Phone2</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phone2</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phone2</em>' containment reference.
     * @see #isSetPhone2()
     * @see #unsetPhone2()
     * @see #setPhone2(TelephoneNumber)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_Phone2()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.phone2' kind='element'"
     * @generated
     */
    TelephoneNumber getPhone2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone2 <em>Phone2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phone2</em>' containment reference.
     * @see #isSetPhone2()
     * @see #unsetPhone2()
     * @see #getPhone2()
     * @generated
     */
    void setPhone2( TelephoneNumber value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone2 <em>Phone2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhone2()
     * @see #getPhone2()
     * @see #setPhone2(TelephoneNumber)
     * @generated
     */
    void unsetPhone2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPhone2 <em>Phone2</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phone2</em>' containment reference is set.
     * @see #unsetPhone2()
     * @see #getPhone2()
     * @see #setPhone2(TelephoneNumber)
     * @generated
     */
    boolean isSetPhone2();

    /**
     * Returns the value of the '<em><b>Postal Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Postal Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Postal Address</em>' containment reference.
     * @see #isSetPostalAddress()
     * @see #unsetPostalAddress()
     * @see #setPostalAddress(StreetAddress)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_PostalAddress()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.postalAddress' kind='element'"
     * @generated
     */
    StreetAddress getPostalAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPostalAddress <em>Postal Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Postal Address</em>' containment reference.
     * @see #isSetPostalAddress()
     * @see #unsetPostalAddress()
     * @see #getPostalAddress()
     * @generated
     */
    void setPostalAddress( StreetAddress value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPostalAddress <em>Postal Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPostalAddress()
     * @see #getPostalAddress()
     * @see #setPostalAddress(StreetAddress)
     * @generated
     */
    void unsetPostalAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getPostalAddress <em>Postal Address</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Postal Address</em>' containment reference is set.
     * @see #unsetPostalAddress()
     * @see #getPostalAddress()
     * @see #setPostalAddress(StreetAddress)
     * @generated
     */
    boolean isSetPostalAddress();

    /**
     * Returns the value of the '<em><b>Street Address</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Street Address</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Street Address</em>' containment reference.
     * @see #isSetStreetAddress()
     * @see #unsetStreetAddress()
     * @see #setStreetAddress(StreetAddress)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_StreetAddress()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.streetAddress' kind='element'"
     * @generated
     */
    StreetAddress getStreetAddress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getStreetAddress <em>Street Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Street Address</em>' containment reference.
     * @see #isSetStreetAddress()
     * @see #unsetStreetAddress()
     * @see #getStreetAddress()
     * @generated
     */
    void setStreetAddress( StreetAddress value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getStreetAddress <em>Street Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStreetAddress()
     * @see #getStreetAddress()
     * @see #setStreetAddress(StreetAddress)
     * @generated
     */
    void unsetStreetAddress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getStreetAddress <em>Street Address</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Street Address</em>' containment reference is set.
     * @see #unsetStreetAddress()
     * @see #getStreetAddress()
     * @see #setStreetAddress(StreetAddress)
     * @generated
     */
    boolean isSetStreetAddress();

    /**
     * Returns the value of the '<em><b>Roles</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole#getOrganisation <em>Organisation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Roles</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Roles</em>' reference list.
     * @see #isSetRoles()
     * @see #unsetRoles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_Roles()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OrganisationRole#getOrganisation
     * @model opposite="Organisation" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.Roles' kind='element'"
     * @generated
     */
    EList< OrganisationRole > getRoles();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getRoles <em>Roles</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRoles()
     * @see #getRoles()
     * @generated
     */
    void unsetRoles();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getRoles <em>Roles</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Roles</em>' reference list is set.
     * @see #unsetRoles()
     * @see #getRoles()
     * @generated
     */
    boolean isSetRoles();

    /**
     * Returns the value of the '<em><b>Parent Organisation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ParentOrganization#getOrganisation <em>Organisation</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent Organisation</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent Organisation</em>' reference.
     * @see #isSetParentOrganisation()
     * @see #unsetParentOrganisation()
     * @see #setParentOrganisation(ParentOrganization)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOrganisation_ParentOrganisation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ParentOrganization#getOrganisation
     * @model opposite="Organisation" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Organisation.ParentOrganisation' kind='element'"
     * @generated
     */
    ParentOrganization getParentOrganisation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getParentOrganisation <em>Parent Organisation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent Organisation</em>' reference.
     * @see #isSetParentOrganisation()
     * @see #unsetParentOrganisation()
     * @see #getParentOrganisation()
     * @generated
     */
    void setParentOrganisation( ParentOrganization value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getParentOrganisation <em>Parent Organisation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetParentOrganisation()
     * @see #getParentOrganisation()
     * @see #setParentOrganisation(ParentOrganization)
     * @generated
     */
    void unsetParentOrganisation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Organisation#getParentOrganisation <em>Parent Organisation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Parent Organisation</em>' reference is set.
     * @see #unsetParentOrganisation()
     * @see #getParentOrganisation()
     * @see #setParentOrganisation(ParentOrganization)
     * @generated
     */
    boolean isSetParentOrganisation();

} // Organisation
