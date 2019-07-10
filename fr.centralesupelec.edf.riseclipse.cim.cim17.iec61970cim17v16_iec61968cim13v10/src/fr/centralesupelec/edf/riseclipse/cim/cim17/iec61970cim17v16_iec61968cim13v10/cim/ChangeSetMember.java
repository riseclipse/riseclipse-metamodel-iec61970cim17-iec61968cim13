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
 * A representation of the model object '<em><b>Change Set Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSetMember#getChangeset <em>Changeset</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChangeSetMember()
 * @model
 * @generated
 */
public interface ChangeSetMember extends DataSetMember {
    /**
     * Returns the value of the '<em><b>Changeset</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSet#getChangeSetMember <em>Change Set Member</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Changeset</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Changeset</em>' reference.
     * @see #isSetChangeset()
     * @see #unsetChangeset()
     * @see #setChangeset(ChangeSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getChangeSetMember_Changeset()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSet#getChangeSetMember
     * @model opposite="ChangeSetMember" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ChangeSetMember.Changeset' kind='element'"
     * @generated
     */
    ChangeSet getChangeset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSetMember#getChangeset <em>Changeset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Changeset</em>' reference.
     * @see #isSetChangeset()
     * @see #unsetChangeset()
     * @see #getChangeset()
     * @generated
     */
    void setChangeset( ChangeSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSetMember#getChangeset <em>Changeset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetChangeset()
     * @see #getChangeset()
     * @see #setChangeset(ChangeSet)
     * @generated
     */
    void unsetChangeset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ChangeSetMember#getChangeset <em>Changeset</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Changeset</em>' reference is set.
     * @see #unsetChangeset()
     * @see #getChangeset()
     * @see #setChangeset(ChangeSet)
     * @generated
     */
    boolean isSetChangeset();

} // ChangeSetMember
