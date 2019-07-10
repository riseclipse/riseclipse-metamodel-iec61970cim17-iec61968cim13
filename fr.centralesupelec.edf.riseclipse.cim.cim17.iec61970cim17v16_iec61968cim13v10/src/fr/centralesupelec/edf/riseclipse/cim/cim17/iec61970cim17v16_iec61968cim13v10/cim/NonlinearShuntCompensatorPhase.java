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
 * A representation of the model object '<em><b>Nonlinear Shunt Compensator Phase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase#getNonlinearShuntCompensatorPhasePoints <em>Nonlinear Shunt Compensator Phase Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhase()
 * @model
 * @generated
 */
public interface NonlinearShuntCompensatorPhase extends ShuntCompensatorPhase {
    /**
     * Returns the value of the '<em><b>Nonlinear Shunt Compensator Phase Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase <em>Nonlinear Shunt Compensator Phase</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nonlinear Shunt Compensator Phase Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nonlinear Shunt Compensator Phase Points</em>' reference list.
     * @see #isSetNonlinearShuntCompensatorPhasePoints()
     * @see #unsetNonlinearShuntCompensatorPhasePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getNonlinearShuntCompensatorPhase_NonlinearShuntCompensatorPhasePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhasePoint#getNonlinearShuntCompensatorPhase
     * @model opposite="NonlinearShuntCompensatorPhase" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='NonlinearShuntCompensatorPhase.NonlinearShuntCompensatorPhasePoints' kind='element'"
     * @generated
     */
    EList< NonlinearShuntCompensatorPhasePoint > getNonlinearShuntCompensatorPhasePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase#getNonlinearShuntCompensatorPhasePoints <em>Nonlinear Shunt Compensator Phase Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNonlinearShuntCompensatorPhasePoints()
     * @see #getNonlinearShuntCompensatorPhasePoints()
     * @generated
     */
    void unsetNonlinearShuntCompensatorPhasePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonlinearShuntCompensatorPhase#getNonlinearShuntCompensatorPhasePoints <em>Nonlinear Shunt Compensator Phase Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nonlinear Shunt Compensator Phase Points</em>' reference list is set.
     * @see #unsetNonlinearShuntCompensatorPhasePoints()
     * @see #getNonlinearShuntCompensatorPhasePoints()
     * @generated
     */
    boolean isSetNonlinearShuntCompensatorPhasePoints();

} // NonlinearShuntCompensatorPhase
