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
 * A representation of the model object '<em><b>Operations Safety Supervisor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getReleasedSafetyDocuments <em>Released Safety Documents</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationsSafetySupervisor()
 * @model
 * @generated
 */
public interface OperationsSafetySupervisor extends Operator {
    /**
     * Returns the value of the '<em><b>Issued Safety Documents</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor <em>Issued By Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issued Safety Documents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Issued Safety Documents</em>' reference list.
     * @see #isSetIssuedSafetyDocuments()
     * @see #unsetIssuedSafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationsSafetySupervisor_IssuedSafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getIssuedBySupervisor
     * @model opposite="IssuedBySupervisor" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationsSafetySupervisor.IssuedSafetyDocuments' kind='element'"
     * @generated
     */
    EList< SafetyDocument > getIssuedSafetyDocuments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIssuedSafetyDocuments()
     * @see #getIssuedSafetyDocuments()
     * @generated
     */
    void unsetIssuedSafetyDocuments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getIssuedSafetyDocuments <em>Issued Safety Documents</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Issued Safety Documents</em>' reference list is set.
     * @see #unsetIssuedSafetyDocuments()
     * @see #getIssuedSafetyDocuments()
     * @generated
     */
    boolean isSetIssuedSafetyDocuments();

    /**
     * Returns the value of the '<em><b>Released Safety Documents</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor <em>Released To Supervisor</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Released Safety Documents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Released Safety Documents</em>' reference list.
     * @see #isSetReleasedSafetyDocuments()
     * @see #unsetReleasedSafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getOperationsSafetySupervisor_ReleasedSafetyDocuments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SafetyDocument#getReleasedToSupervisor
     * @model opposite="ReleasedToSupervisor" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='OperationsSafetySupervisor.ReleasedSafetyDocuments' kind='element'"
     * @generated
     */
    EList< SafetyDocument > getReleasedSafetyDocuments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getReleasedSafetyDocuments <em>Released Safety Documents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReleasedSafetyDocuments()
     * @see #getReleasedSafetyDocuments()
     * @generated
     */
    void unsetReleasedSafetyDocuments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OperationsSafetySupervisor#getReleasedSafetyDocuments <em>Released Safety Documents</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Released Safety Documents</em>' reference list is set.
     * @see #unsetReleasedSafetyDocuments()
     * @see #getReleasedSafetyDocuments()
     * @generated
     */
    boolean isSetReleasedSafetyDocuments();

} // OperationsSafetySupervisor
