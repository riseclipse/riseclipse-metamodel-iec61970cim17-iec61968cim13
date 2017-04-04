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
 * A representation of the model object '<em><b>Crew Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getSwitchingSteps <em>Switching Steps</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getCrew <em>Crew</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCrewMember()
 * @model
 * @generated
 */
public interface CrewMember extends OperationPersonRole {
    /**
     * Returns the value of the '<em><b>Switching Steps</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep#getCrewMember <em>Crew Member</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switching Steps</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switching Steps</em>' reference list.
     * @see #isSetSwitchingSteps()
     * @see #unsetSwitchingSteps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCrewMember_SwitchingSteps()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStep#getCrewMember
     * @model opposite="CrewMember" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CrewMember.SwitchingSteps' kind='element'"
     * @generated
     */
    EList< SwitchingStep > getSwitchingSteps();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getSwitchingSteps <em>Switching Steps</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchingSteps()
     * @see #getSwitchingSteps()
     * @generated
     */
    void unsetSwitchingSteps();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getSwitchingSteps <em>Switching Steps</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switching Steps</em>' reference list is set.
     * @see #unsetSwitchingSteps()
     * @see #getSwitchingSteps()
     * @generated
     */
    boolean isSetSwitchingSteps();

    /**
     * Returns the value of the '<em><b>Crew</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew#getCrewMembers <em>Crew Members</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Crew</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Crew</em>' reference.
     * @see #isSetCrew()
     * @see #unsetCrew()
     * @see #setCrew(Crew)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCrewMember_Crew()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Crew#getCrewMembers
     * @model opposite="CrewMembers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CrewMember.Crew' kind='element'"
     * @generated
     */
    Crew getCrew();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getCrew <em>Crew</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Crew</em>' reference.
     * @see #isSetCrew()
     * @see #unsetCrew()
     * @see #getCrew()
     * @generated
     */
    void setCrew( Crew value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getCrew <em>Crew</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCrew()
     * @see #getCrew()
     * @see #setCrew(Crew)
     * @generated
     */
    void unsetCrew();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CrewMember#getCrew <em>Crew</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Crew</em>' reference is set.
     * @see #unsetCrew()
     * @see #getCrew()
     * @see #setCrew(Crew)
     * @generated
     */
    boolean isSetCrew();

} // CrewMember
