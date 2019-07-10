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
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConverterDCSides <em>Converter DC Sides</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getEquipmentFaults <em>Equipment Faults</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends ACDCTerminal {
    /**
     * Returns the value of the '<em><b>Phases</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phases</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #setPhases(PhaseCode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_Phases()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.phases' kind='element'"
     * @generated
     */
    PhaseCode getPhases();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phases</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetPhases()
     * @see #unsetPhases()
     * @see #getPhases()
     * @generated
     */
    void setPhases( PhaseCode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getPhases <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    void unsetPhases();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getPhases <em>Phases</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phases</em>' attribute is set.
     * @see #unsetPhases()
     * @see #getPhases()
     * @see #setPhases(PhaseCode)
     * @generated
     */
    boolean isSetPhases();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Topological Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.TopologicalNode' kind='element'"
     * @generated
     */
    TopologicalNode getTopologicalNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Topological Node</em>' reference.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void setTopologicalNode( TopologicalNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTopologicalNode <em>Topological Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @see #setTopologicalNode(TopologicalNode)
     * @generated
     */
    boolean isSetTopologicalNode();

    /**
     * Returns the value of the '<em><b>Has First Mutual Coupling</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal <em>First Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has First Mutual Coupling</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has First Mutual Coupling</em>' reference list.
     * @see #isSetHasFirstMutualCoupling()
     * @see #unsetHasFirstMutualCoupling()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_HasFirstMutualCoupling()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getFirst_Terminal
     * @model opposite="First_Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.HasFirstMutualCoupling' kind='element'"
     * @generated
     */
    EList< MutualCoupling > getHasFirstMutualCoupling();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHasFirstMutualCoupling()
     * @see #getHasFirstMutualCoupling()
     * @generated
     */
    void unsetHasFirstMutualCoupling();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Has First Mutual Coupling</em>' reference list is set.
     * @see #unsetHasFirstMutualCoupling()
     * @see #getHasFirstMutualCoupling()
     * @generated
     */
    boolean isSetHasFirstMutualCoupling();

    /**
     * Returns the value of the '<em><b>Converter DC Sides</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter#getPccTerminal <em>Pcc Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Converter DC Sides</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Converter DC Sides</em>' reference list.
     * @see #isSetConverterDCSides()
     * @see #unsetConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_ConverterDCSides()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter#getPccTerminal
     * @model opposite="PccTerminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.ConverterDCSides' kind='element'"
     * @generated
     */
    EList< ACDCConverter > getConverterDCSides();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConverterDCSides <em>Converter DC Sides</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConverterDCSides()
     * @see #getConverterDCSides()
     * @generated
     */
    void unsetConverterDCSides();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConverterDCSides <em>Converter DC Sides</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Converter DC Sides</em>' reference list is set.
     * @see #unsetConverterDCSides()
     * @see #getConverterDCSides()
     * @generated
     */
    boolean isSetConverterDCSides();

    /**
     * Returns the value of the '<em><b>Has Second Mutual Coupling</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal <em>Second Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Has Second Mutual Coupling</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Has Second Mutual Coupling</em>' reference list.
     * @see #isSetHasSecondMutualCoupling()
     * @see #unsetHasSecondMutualCoupling()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_HasSecondMutualCoupling()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling#getSecond_Terminal
     * @model opposite="Second_Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.HasSecondMutualCoupling' kind='element'"
     * @generated
     */
    EList< MutualCoupling > getHasSecondMutualCoupling();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHasSecondMutualCoupling()
     * @see #getHasSecondMutualCoupling()
     * @generated
     */
    void unsetHasSecondMutualCoupling();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Has Second Mutual Coupling</em>' reference list is set.
     * @see #unsetHasSecondMutualCoupling()
     * @see #getHasSecondMutualCoupling()
     * @generated
     */
    boolean isSetHasSecondMutualCoupling();

    /**
     * Returns the value of the '<em><b>Branch Group Terminal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Branch Group Terminal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Branch Group Terminal</em>' reference list.
     * @see #isSetBranchGroupTerminal()
     * @see #unsetBranchGroupTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_BranchGroupTerminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.BranchGroupTerminal' kind='element'"
     * @generated
     */
    EList< BranchGroupTerminal > getBranchGroupTerminal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBranchGroupTerminal()
     * @see #getBranchGroupTerminal()
     * @generated
     */
    void unsetBranchGroupTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getBranchGroupTerminal <em>Branch Group Terminal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Branch Group Terminal</em>' reference list is set.
     * @see #unsetBranchGroupTerminal()
     * @see #getBranchGroupTerminal()
     * @generated
     */
    boolean isSetBranchGroupTerminal();

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getTerminals <em>Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipment</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' reference.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getTerminals
     * @model opposite="Terminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.ConductingEquipment' kind='element'"
     * @generated
     */
    ConductingEquipment getConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conducting Equipment</em>' reference.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void setConductingEquipment( ConductingEquipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConductingEquipment <em>Conducting Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' reference is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode#getTerminals <em>Terminals</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connectivity Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connectivity Node</em>' reference.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_ConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode#getTerminals
     * @model opposite="Terminals" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.ConnectivityNode' kind='element'"
     * @generated
     */
    ConnectivityNode getConnectivityNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node</em>' reference.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    void setConnectivityNode( ConnectivityNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @generated
     */
    void unsetConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getConnectivityNode <em>Connectivity Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node</em>' reference is set.
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @generated
     */
    boolean isSetConnectivityNode();

    /**
     * Returns the value of the '<em><b>Regulating Control</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulating Control</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulating Control</em>' reference list.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_RegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.RegulatingControl' kind='element'"
     * @generated
     */
    EList< RegulatingControl > getRegulatingControl();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRegulatingControl <em>Regulating Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    void unsetRegulatingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRegulatingControl <em>Regulating Control</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Control</em>' reference list is set.
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    boolean isSetRegulatingControl();

    /**
     * Returns the value of the '<em><b>Remote Input Signal</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Input Signal</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Input Signal</em>' reference list.
     * @see #isSetRemoteInputSignal()
     * @see #unsetRemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_RemoteInputSignal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.RemoteInputSignal' kind='element'"
     * @generated
     */
    EList< RemoteInputSignal > getRemoteInputSignal();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRemoteInputSignal <em>Remote Input Signal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @generated
     */
    void unsetRemoteInputSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRemoteInputSignal <em>Remote Input Signal</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Input Signal</em>' reference list is set.
     * @see #unsetRemoteInputSignal()
     * @see #getRemoteInputSignal()
     * @generated
     */
    boolean isSetRemoteInputSignal();

    /**
     * Returns the value of the '<em><b>Sv Power Flow</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvPowerFlow}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvPowerFlow#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sv Power Flow</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sv Power Flow</em>' reference list.
     * @see #isSetSvPowerFlow()
     * @see #unsetSvPowerFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_SvPowerFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvPowerFlow#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.SvPowerFlow' kind='element'"
     * @generated
     */
    EList< SvPowerFlow > getSvPowerFlow();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvPowerFlow()
     * @see #getSvPowerFlow()
     * @generated
     */
    void unsetSvPowerFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getSvPowerFlow <em>Sv Power Flow</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Power Flow</em>' reference list is set.
     * @see #unsetSvPowerFlow()
     * @see #getSvPowerFlow()
     * @generated
     */
    boolean isSetSvPowerFlow();

    /**
     * Returns the value of the '<em><b>Transformer End</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transformer End</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transformer End</em>' reference list.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_TransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.TransformerEnd' kind='element'"
     * @generated
     */
    EList< TransformerEnd > getTransformerEnd();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTransformerEnd <em>Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnd()
     * @see #getTransformerEnd()
     * @generated
     */
    void unsetTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTransformerEnd <em>Transformer End</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End</em>' reference list is set.
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @generated
     */
    boolean isSetTransformerEnd();

    /**
     * Returns the value of the '<em><b>Auxiliary Equipment</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryEquipment#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auxiliary Equipment</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auxiliary Equipment</em>' reference list.
     * @see #isSetAuxiliaryEquipment()
     * @see #unsetAuxiliaryEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_AuxiliaryEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryEquipment#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.AuxiliaryEquipment' kind='element'"
     * @generated
     */
    EList< AuxiliaryEquipment > getAuxiliaryEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAuxiliaryEquipment()
     * @see #getAuxiliaryEquipment()
     * @generated
     */
    void unsetAuxiliaryEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auxiliary Equipment</em>' reference list is set.
     * @see #unsetAuxiliaryEquipment()
     * @see #getAuxiliaryEquipment()
     * @generated
     */
    boolean isSetAuxiliaryEquipment();

    /**
     * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tie Flow</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tie Flow</em>' reference list.
     * @see #isSetTieFlow()
     * @see #unsetTieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_TieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" upper="2" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.TieFlow' kind='element'"
     * @generated
     */
    EList< TieFlow > getTieFlow();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTieFlow <em>Tie Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    void unsetTieFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getTieFlow <em>Tie Flow</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tie Flow</em>' reference list is set.
     * @see #unsetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    boolean isSetTieFlow();

    /**
     * Returns the value of the '<em><b>Equipment Faults</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentFault}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentFault#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equipment Faults</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equipment Faults</em>' reference list.
     * @see #isSetEquipmentFaults()
     * @see #unsetEquipmentFaults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTerminal_EquipmentFaults()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentFault#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Terminal.EquipmentFaults' kind='element'"
     * @generated
     */
    EList< EquipmentFault > getEquipmentFaults();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getEquipmentFaults <em>Equipment Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipmentFaults()
     * @see #getEquipmentFaults()
     * @generated
     */
    void unsetEquipmentFaults();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getEquipmentFaults <em>Equipment Faults</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipment Faults</em>' reference list is set.
     * @see #unsetEquipmentFaults()
     * @see #getEquipmentFaults()
     * @generated
     */
    boolean isSetEquipmentFaults();

} // Terminal
