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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AuxiliaryEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BranchGroupTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquipmentFault;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MutualCoupling;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteInputSignal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvPowerFlow;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TieFlow;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TopologicalNode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getHasFirstMutualCoupling <em>Has First Mutual Coupling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getConverterDCSides <em>Converter DC Sides</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getHasSecondMutualCoupling <em>Has Second Mutual Coupling</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getBranchGroupTerminal <em>Branch Group Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getRegulatingControl <em>Regulating Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getRemoteInputSignal <em>Remote Input Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getSvPowerFlow <em>Sv Power Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getAuxiliaryEquipment <em>Auxiliary Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TerminalImpl#getEquipmentFaults <em>Equipment Faults</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminalImpl extends ACDCTerminalImpl implements Terminal {
    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;

    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phasesESet;

    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected TopologicalNode topologicalNode;

    /**
     * This is true if the Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean topologicalNodeESet;

    /**
     * The cached value of the '{@link #getHasFirstMutualCoupling() <em>Has First Mutual Coupling</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasFirstMutualCoupling()
     * @generated
     * @ordered
     */
    protected EList< MutualCoupling > hasFirstMutualCoupling;

    /**
     * The cached value of the '{@link #getConverterDCSides() <em>Converter DC Sides</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConverterDCSides()
     * @generated
     * @ordered
     */
    protected EList< ACDCConverter > converterDCSides;

    /**
     * The cached value of the '{@link #getHasSecondMutualCoupling() <em>Has Second Mutual Coupling</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHasSecondMutualCoupling()
     * @generated
     * @ordered
     */
    protected EList< MutualCoupling > hasSecondMutualCoupling;

    /**
     * The cached value of the '{@link #getBranchGroupTerminal() <em>Branch Group Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBranchGroupTerminal()
     * @generated
     * @ordered
     */
    protected EList< BranchGroupTerminal > branchGroupTerminal;

    /**
     * The cached value of the '{@link #getConductingEquipment() <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConductingEquipment()
     * @generated
     * @ordered
     */
    protected ConductingEquipment conductingEquipment;

    /**
     * This is true if the Conducting Equipment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conductingEquipmentESet;

    /**
     * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected ConnectivityNode connectivityNode;

    /**
     * This is true if the Connectivity Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeESet;

    /**
     * The cached value of the '{@link #getRegulatingControl() <em>Regulating Control</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRegulatingControl()
     * @generated
     * @ordered
     */
    protected EList< RegulatingControl > regulatingControl;

    /**
     * The cached value of the '{@link #getRemoteInputSignal() <em>Remote Input Signal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRemoteInputSignal()
     * @generated
     * @ordered
     */
    protected EList< RemoteInputSignal > remoteInputSignal;

    /**
     * The cached value of the '{@link #getSvPowerFlow() <em>Sv Power Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvPowerFlow()
     * @generated
     * @ordered
     */
    protected EList< SvPowerFlow > svPowerFlow;

    /**
     * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEnd()
     * @generated
     * @ordered
     */
    protected EList< TransformerEnd > transformerEnd;

    /**
     * The cached value of the '{@link #getAuxiliaryEquipment() <em>Auxiliary Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuxiliaryEquipment()
     * @generated
     * @ordered
     */
    protected EList< AuxiliaryEquipment > auxiliaryEquipment;

    /**
     * The cached value of the '{@link #getTieFlow() <em>Tie Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTieFlow()
     * @generated
     * @ordered
     */
    protected EList< TieFlow > tieFlow;

    /**
     * The cached value of the '{@link #getEquipmentFaults() <em>Equipment Faults</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipmentFaults()
     * @generated
     * @ordered
     */
    protected EList< EquipmentFault > equipmentFaults;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TerminalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTerminal();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhases( PhaseCode newPhases ) {
        PhaseCode oldPhases = phases;
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        boolean oldPhasesESet = phasesESet;
        phasesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TERMINAL__PHASES, oldPhases, phases, !oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhases() {
        PhaseCode oldPhases = phases;
        boolean oldPhasesESet = phasesESet;
        phases = PHASES_EDEFAULT;
        phasesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TERMINAL__PHASES, oldPhases, PHASES_EDEFAULT, oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalNode getTopologicalNode() {
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTopologicalNode( TopologicalNode newTopologicalNode, NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = newTopologicalNode;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TERMINAL__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode,
                    !oldTopologicalNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTopologicalNode( TopologicalNode newTopologicalNode ) {
        if( newTopologicalNode != topologicalNode ) {
            NotificationChain msgs = null;
            if( topologicalNode != null ) msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs );
            if( newTopologicalNode != null ) msgs = ( ( InternalEObject ) newTopologicalNode ).eInverseAdd( this,
                    CimPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs );
            msgs = basicSetTopologicalNode( newTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TERMINAL__TOPOLOGICAL_NODE,
                        newTopologicalNode, newTopologicalNode, !oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTopologicalNode( NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = null;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__TOPOLOGICAL_NODE, oldTopologicalNode, null, oldTopologicalNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this, CimPackage.TOPOLOGICAL_NODE__TERMINAL,
                    TopologicalNode.class, msgs );
            msgs = basicUnsetTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__TOPOLOGICAL_NODE, null, null, oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MutualCoupling > getHasFirstMutualCoupling() {
        if( hasFirstMutualCoupling == null ) {
            hasFirstMutualCoupling = new EObjectWithInverseResolvingEList.Unsettable< MutualCoupling >(
                    MutualCoupling.class, this, CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING,
                    CimPackage.MUTUAL_COUPLING__FIRST_TERMINAL );
        }
        return hasFirstMutualCoupling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHasFirstMutualCoupling() {
        if( hasFirstMutualCoupling != null ) ( ( InternalEList.Unsettable< ? > ) hasFirstMutualCoupling ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHasFirstMutualCoupling() {
        return hasFirstMutualCoupling != null && ( ( InternalEList.Unsettable< ? > ) hasFirstMutualCoupling ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ACDCConverter > getConverterDCSides() {
        if( converterDCSides == null ) {
            converterDCSides = new EObjectWithInverseResolvingEList.Unsettable< ACDCConverter >( ACDCConverter.class,
                    this, CimPackage.TERMINAL__CONVERTER_DC_SIDES, CimPackage.ACDC_CONVERTER__PCC_TERMINAL );
        }
        return converterDCSides;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConverterDCSides() {
        if( converterDCSides != null ) ( ( InternalEList.Unsettable< ? > ) converterDCSides ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConverterDCSides() {
        return converterDCSides != null && ( ( InternalEList.Unsettable< ? > ) converterDCSides ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< MutualCoupling > getHasSecondMutualCoupling() {
        if( hasSecondMutualCoupling == null ) {
            hasSecondMutualCoupling = new EObjectWithInverseResolvingEList.Unsettable< MutualCoupling >(
                    MutualCoupling.class, this, CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING,
                    CimPackage.MUTUAL_COUPLING__SECOND_TERMINAL );
        }
        return hasSecondMutualCoupling;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHasSecondMutualCoupling() {
        if( hasSecondMutualCoupling != null ) ( ( InternalEList.Unsettable< ? > ) hasSecondMutualCoupling ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHasSecondMutualCoupling() {
        return hasSecondMutualCoupling != null && ( ( InternalEList.Unsettable< ? > ) hasSecondMutualCoupling ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BranchGroupTerminal > getBranchGroupTerminal() {
        if( branchGroupTerminal == null ) {
            branchGroupTerminal = new EObjectWithInverseResolvingEList.Unsettable< BranchGroupTerminal >(
                    BranchGroupTerminal.class, this, CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL,
                    CimPackage.BRANCH_GROUP_TERMINAL__TERMINAL );
        }
        return branchGroupTerminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBranchGroupTerminal() {
        if( branchGroupTerminal != null ) ( ( InternalEList.Unsettable< ? > ) branchGroupTerminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBranchGroupTerminal() {
        return branchGroupTerminal != null && ( ( InternalEList.Unsettable< ? > ) branchGroupTerminal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConductingEquipment getConductingEquipment() {
        return conductingEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConductingEquipment( ConductingEquipment newConductingEquipment,
            NotificationChain msgs ) {
        ConductingEquipment oldConductingEquipment = conductingEquipment;
        conductingEquipment = newConductingEquipment;
        boolean oldConductingEquipmentESet = conductingEquipmentESet;
        conductingEquipmentESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, newConductingEquipment,
                    !oldConductingEquipmentESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConductingEquipment( ConductingEquipment newConductingEquipment ) {
        if( newConductingEquipment != conductingEquipment ) {
            NotificationChain msgs = null;
            if( conductingEquipment != null ) msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs );
            if( newConductingEquipment != null ) msgs = ( ( InternalEObject ) newConductingEquipment )
                    .eInverseAdd( this, CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs );
            msgs = basicSetConductingEquipment( newConductingEquipment, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConductingEquipmentESet = conductingEquipmentESet;
            conductingEquipmentESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TERMINAL__CONDUCTING_EQUIPMENT,
                        newConductingEquipment, newConductingEquipment, !oldConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConductingEquipment( NotificationChain msgs ) {
        ConductingEquipment oldConductingEquipment = conductingEquipment;
        conductingEquipment = null;
        boolean oldConductingEquipmentESet = conductingEquipmentESet;
        conductingEquipmentESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__CONDUCTING_EQUIPMENT, oldConductingEquipment, null,
                    oldConductingEquipmentESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConductingEquipment() {
        if( conductingEquipment != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs );
            msgs = basicUnsetConductingEquipment( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConductingEquipmentESet = conductingEquipmentESet;
            conductingEquipmentESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__CONDUCTING_EQUIPMENT, null, null, oldConductingEquipmentESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConductingEquipment() {
        return conductingEquipmentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode getConnectivityNode() {
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectivityNode( ConnectivityNode newConnectivityNode, NotificationChain msgs ) {
        ConnectivityNode oldConnectivityNode = connectivityNode;
        connectivityNode = newConnectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode,
                    !oldConnectivityNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectivityNode( ConnectivityNode newConnectivityNode ) {
        if( newConnectivityNode != connectivityNode ) {
            NotificationChain msgs = null;
            if( connectivityNode != null ) msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs );
            if( newConnectivityNode != null ) msgs = ( ( InternalEObject ) newConnectivityNode ).eInverseAdd( this,
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs );
            msgs = basicSetConnectivityNode( newConnectivityNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeESet = connectivityNodeESet;
            connectivityNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TERMINAL__CONNECTIVITY_NODE,
                        newConnectivityNode, newConnectivityNode, !oldConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConnectivityNode( NotificationChain msgs ) {
        ConnectivityNode oldConnectivityNode = connectivityNode;
        connectivityNode = null;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__CONNECTIVITY_NODE, oldConnectivityNode, null, oldConnectivityNodeESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNode() {
        if( connectivityNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs );
            msgs = basicUnsetConnectivityNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeESet = connectivityNodeESet;
            connectivityNodeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TERMINAL__CONNECTIVITY_NODE, null, null, oldConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNode() {
        return connectivityNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RegulatingControl > getRegulatingControl() {
        if( regulatingControl == null ) {
            regulatingControl = new EObjectWithInverseResolvingEList.Unsettable< RegulatingControl >(
                    RegulatingControl.class, this, CimPackage.TERMINAL__REGULATING_CONTROL,
                    CimPackage.REGULATING_CONTROL__TERMINAL );
        }
        return regulatingControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRegulatingControl() {
        if( regulatingControl != null ) ( ( InternalEList.Unsettable< ? > ) regulatingControl ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRegulatingControl() {
        return regulatingControl != null && ( ( InternalEList.Unsettable< ? > ) regulatingControl ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RemoteInputSignal > getRemoteInputSignal() {
        if( remoteInputSignal == null ) {
            remoteInputSignal = new EObjectWithInverseResolvingEList.Unsettable< RemoteInputSignal >(
                    RemoteInputSignal.class, this, CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL,
                    CimPackage.REMOTE_INPUT_SIGNAL__TERMINAL );
        }
        return remoteInputSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRemoteInputSignal() {
        if( remoteInputSignal != null ) ( ( InternalEList.Unsettable< ? > ) remoteInputSignal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRemoteInputSignal() {
        return remoteInputSignal != null && ( ( InternalEList.Unsettable< ? > ) remoteInputSignal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SvPowerFlow > getSvPowerFlow() {
        if( svPowerFlow == null ) {
            svPowerFlow = new EObjectWithInverseResolvingEList.Unsettable< SvPowerFlow >( SvPowerFlow.class, this,
                    CimPackage.TERMINAL__SV_POWER_FLOW, CimPackage.SV_POWER_FLOW__TERMINAL );
        }
        return svPowerFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvPowerFlow() {
        if( svPowerFlow != null ) ( ( InternalEList.Unsettable< ? > ) svPowerFlow ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvPowerFlow() {
        return svPowerFlow != null && ( ( InternalEList.Unsettable< ? > ) svPowerFlow ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEnd > getTransformerEnd() {
        if( transformerEnd == null ) {
            transformerEnd = new EObjectWithInverseResolvingEList.Unsettable< TransformerEnd >( TransformerEnd.class,
                    this, CimPackage.TERMINAL__TRANSFORMER_END, CimPackage.TRANSFORMER_END__TERMINAL );
        }
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerEnd() {
        if( transformerEnd != null ) ( ( InternalEList.Unsettable< ? > ) transformerEnd ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEnd() {
        return transformerEnd != null && ( ( InternalEList.Unsettable< ? > ) transformerEnd ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AuxiliaryEquipment > getAuxiliaryEquipment() {
        if( auxiliaryEquipment == null ) {
            auxiliaryEquipment = new EObjectWithInverseResolvingEList.Unsettable< AuxiliaryEquipment >(
                    AuxiliaryEquipment.class, this, CimPackage.TERMINAL__AUXILIARY_EQUIPMENT,
                    CimPackage.AUXILIARY_EQUIPMENT__TERMINAL );
        }
        return auxiliaryEquipment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuxiliaryEquipment() {
        if( auxiliaryEquipment != null ) ( ( InternalEList.Unsettable< ? > ) auxiliaryEquipment ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuxiliaryEquipment() {
        return auxiliaryEquipment != null && ( ( InternalEList.Unsettable< ? > ) auxiliaryEquipment ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TieFlow > getTieFlow() {
        if( tieFlow == null ) {
            tieFlow = new EObjectWithInverseEList.Unsettable< TieFlow >( TieFlow.class, this,
                    CimPackage.TERMINAL__TIE_FLOW, CimPackage.TIE_FLOW__TERMINAL );
        }
        return tieFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTieFlow() {
        if( tieFlow != null ) ( ( InternalEList.Unsettable< ? > ) tieFlow ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTieFlow() {
        return tieFlow != null && ( ( InternalEList.Unsettable< ? > ) tieFlow ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EquipmentFault > getEquipmentFaults() {
        if( equipmentFaults == null ) {
            equipmentFaults = new EObjectWithInverseResolvingEList.Unsettable< EquipmentFault >( EquipmentFault.class,
                    this, CimPackage.TERMINAL__EQUIPMENT_FAULTS, CimPackage.EQUIPMENT_FAULT__TERMINAL );
        }
        return equipmentFaults;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquipmentFaults() {
        if( equipmentFaults != null ) ( ( InternalEList.Unsettable< ? > ) equipmentFaults ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipmentFaults() {
        return equipmentFaults != null && ( ( InternalEList.Unsettable< ? > ) equipmentFaults ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            if( topologicalNode != null ) msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__TERMINAL, TopologicalNode.class, msgs );
            return basicSetTopologicalNode( ( TopologicalNode ) otherEnd, msgs );
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHasFirstMutualCoupling() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConverterDCSides() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getHasSecondMutualCoupling() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBranchGroupTerminal() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            if( conductingEquipment != null ) msgs = ( ( InternalEObject ) conductingEquipment ).eInverseRemove( this,
                    CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, ConductingEquipment.class, msgs );
            return basicSetConductingEquipment( ( ConductingEquipment ) otherEnd, msgs );
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            if( connectivityNode != null ) msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, ConnectivityNode.class, msgs );
            return basicSetConnectivityNode( ( ConnectivityNode ) otherEnd, msgs );
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRegulatingControl() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRemoteInputSignal() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSvPowerFlow() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TERMINAL__TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerEnd() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAuxiliaryEquipment() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TERMINAL__TIE_FLOW:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTieFlow() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquipmentFaults() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            return basicUnsetTopologicalNode( msgs );
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            return ( ( InternalEList< ? > ) getHasFirstMutualCoupling() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            return ( ( InternalEList< ? > ) getConverterDCSides() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            return ( ( InternalEList< ? > ) getHasSecondMutualCoupling() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            return ( ( InternalEList< ? > ) getBranchGroupTerminal() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            return basicUnsetConductingEquipment( msgs );
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            return basicUnsetConnectivityNode( msgs );
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            return ( ( InternalEList< ? > ) getRegulatingControl() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            return ( ( InternalEList< ? > ) getRemoteInputSignal() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            return ( ( InternalEList< ? > ) getSvPowerFlow() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getTransformerEnd() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            return ( ( InternalEList< ? > ) getAuxiliaryEquipment() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__TIE_FLOW:
            return ( ( InternalEList< ? > ) getTieFlow() ).basicRemove( otherEnd, msgs );
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            return ( ( InternalEList< ? > ) getEquipmentFaults() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__PHASES:
            return getPhases();
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            return getTopologicalNode();
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            return getHasFirstMutualCoupling();
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            return getConverterDCSides();
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            return getHasSecondMutualCoupling();
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            return getBranchGroupTerminal();
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            return getConductingEquipment();
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            return getConnectivityNode();
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            return getRegulatingControl();
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            return getRemoteInputSignal();
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            return getSvPowerFlow();
        case CimPackage.TERMINAL__TRANSFORMER_END:
            return getTransformerEnd();
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            return getAuxiliaryEquipment();
        case CimPackage.TERMINAL__TIE_FLOW:
            return getTieFlow();
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            return getEquipmentFaults();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__PHASES:
            setPhases( ( PhaseCode ) newValue );
            return;
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            setTopologicalNode( ( TopologicalNode ) newValue );
            return;
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            getHasFirstMutualCoupling().clear();
            getHasFirstMutualCoupling().addAll( ( Collection< ? extends MutualCoupling > ) newValue );
            return;
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            getConverterDCSides().clear();
            getConverterDCSides().addAll( ( Collection< ? extends ACDCConverter > ) newValue );
            return;
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            getHasSecondMutualCoupling().clear();
            getHasSecondMutualCoupling().addAll( ( Collection< ? extends MutualCoupling > ) newValue );
            return;
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            getBranchGroupTerminal().clear();
            getBranchGroupTerminal().addAll( ( Collection< ? extends BranchGroupTerminal > ) newValue );
            return;
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            setConductingEquipment( ( ConductingEquipment ) newValue );
            return;
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            setConnectivityNode( ( ConnectivityNode ) newValue );
            return;
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            getRegulatingControl().clear();
            getRegulatingControl().addAll( ( Collection< ? extends RegulatingControl > ) newValue );
            return;
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            getRemoteInputSignal().clear();
            getRemoteInputSignal().addAll( ( Collection< ? extends RemoteInputSignal > ) newValue );
            return;
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            getSvPowerFlow().clear();
            getSvPowerFlow().addAll( ( Collection< ? extends SvPowerFlow > ) newValue );
            return;
        case CimPackage.TERMINAL__TRANSFORMER_END:
            getTransformerEnd().clear();
            getTransformerEnd().addAll( ( Collection< ? extends TransformerEnd > ) newValue );
            return;
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            getAuxiliaryEquipment().clear();
            getAuxiliaryEquipment().addAll( ( Collection< ? extends AuxiliaryEquipment > ) newValue );
            return;
        case CimPackage.TERMINAL__TIE_FLOW:
            getTieFlow().clear();
            getTieFlow().addAll( ( Collection< ? extends TieFlow > ) newValue );
            return;
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            getEquipmentFaults().clear();
            getEquipmentFaults().addAll( ( Collection< ? extends EquipmentFault > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__PHASES:
            unsetPhases();
            return;
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
            return;
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            unsetHasFirstMutualCoupling();
            return;
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            unsetConverterDCSides();
            return;
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            unsetHasSecondMutualCoupling();
            return;
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            unsetBranchGroupTerminal();
            return;
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            unsetConductingEquipment();
            return;
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            unsetConnectivityNode();
            return;
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            unsetRegulatingControl();
            return;
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            unsetRemoteInputSignal();
            return;
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            unsetSvPowerFlow();
            return;
        case CimPackage.TERMINAL__TRANSFORMER_END:
            unsetTransformerEnd();
            return;
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            unsetAuxiliaryEquipment();
            return;
        case CimPackage.TERMINAL__TIE_FLOW:
            unsetTieFlow();
            return;
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            unsetEquipmentFaults();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.TERMINAL__PHASES:
            return isSetPhases();
        case CimPackage.TERMINAL__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        case CimPackage.TERMINAL__HAS_FIRST_MUTUAL_COUPLING:
            return isSetHasFirstMutualCoupling();
        case CimPackage.TERMINAL__CONVERTER_DC_SIDES:
            return isSetConverterDCSides();
        case CimPackage.TERMINAL__HAS_SECOND_MUTUAL_COUPLING:
            return isSetHasSecondMutualCoupling();
        case CimPackage.TERMINAL__BRANCH_GROUP_TERMINAL:
            return isSetBranchGroupTerminal();
        case CimPackage.TERMINAL__CONDUCTING_EQUIPMENT:
            return isSetConductingEquipment();
        case CimPackage.TERMINAL__CONNECTIVITY_NODE:
            return isSetConnectivityNode();
        case CimPackage.TERMINAL__REGULATING_CONTROL:
            return isSetRegulatingControl();
        case CimPackage.TERMINAL__REMOTE_INPUT_SIGNAL:
            return isSetRemoteInputSignal();
        case CimPackage.TERMINAL__SV_POWER_FLOW:
            return isSetSvPowerFlow();
        case CimPackage.TERMINAL__TRANSFORMER_END:
            return isSetTransformerEnd();
        case CimPackage.TERMINAL__AUXILIARY_EQUIPMENT:
            return isSetAuxiliaryEquipment();
        case CimPackage.TERMINAL__TIE_FLOW:
            return isSetTieFlow();
        case CimPackage.TERMINAL__EQUIPMENT_FAULTS:
            return isSetEquipmentFaults();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (phases: " );
        if( phasesESet )
            result.append( phases );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TerminalImpl
