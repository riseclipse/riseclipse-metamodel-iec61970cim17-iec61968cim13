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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ClearanceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CutAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourceAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenericAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GroundAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.JumperAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingPlan;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TagAction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switching Step Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getIsFreeSequence <em>Is Free Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getGenericActions <em>Generic Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getEnergySourceActions <em>Energy Source Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getGroundActions <em>Ground Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getSwitchingPlan <em>Switching Plan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getJumperActions <em>Jumper Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getTagActions <em>Tag Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getClearanceActions <em>Clearance Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getCutActions <em>Cut Actions</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchingStepGroupImpl#getSwitchActions <em>Switch Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchingStepGroupImpl extends DocumentImpl implements SwitchingStepGroup {
    /**
     * The default value of the '{@link #getIsFreeSequence() <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFreeSequence()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_FREE_SEQUENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsFreeSequence() <em>Is Free Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsFreeSequence()
     * @generated
     * @ordered
     */
    protected Boolean isFreeSequence = IS_FREE_SEQUENCE_EDEFAULT;

    /**
     * This is true if the Is Free Sequence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isFreeSequenceESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected Integer sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * The cached value of the '{@link #getGenericActions() <em>Generic Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericActions()
     * @generated
     * @ordered
     */
    protected EList< GenericAction > genericActions;

    /**
     * The cached value of the '{@link #getEnergySourceActions() <em>Energy Source Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySourceActions()
     * @generated
     * @ordered
     */
    protected EList< EnergySourceAction > energySourceActions;

    /**
     * The cached value of the '{@link #getGroundActions() <em>Ground Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundActions()
     * @generated
     * @ordered
     */
    protected EList< GroundAction > groundActions;

    /**
     * The cached value of the '{@link #getSwitchingPlan() <em>Switching Plan</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingPlan()
     * @generated
     * @ordered
     */
    protected SwitchingPlan switchingPlan;

    /**
     * This is true if the Switching Plan reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingPlanESet;

    /**
     * The cached value of the '{@link #getJumperActions() <em>Jumper Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJumperActions()
     * @generated
     * @ordered
     */
    protected EList< JumperAction > jumperActions;

    /**
     * The cached value of the '{@link #getTagActions() <em>Tag Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTagActions()
     * @generated
     * @ordered
     */
    protected EList< TagAction > tagActions;

    /**
     * The cached value of the '{@link #getClearanceActions() <em>Clearance Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClearanceActions()
     * @generated
     * @ordered
     */
    protected EList< ClearanceAction > clearanceActions;

    /**
     * The cached value of the '{@link #getCutActions() <em>Cut Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCutActions()
     * @generated
     * @ordered
     */
    protected EList< CutAction > cutActions;

    /**
     * The cached value of the '{@link #getSwitchActions() <em>Switch Actions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchActions()
     * @generated
     * @ordered
     */
    protected EList< SwitchAction > switchActions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchingStepGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchingStepGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsFreeSequence() {
        return isFreeSequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsFreeSequence( Boolean newIsFreeSequence ) {
        Boolean oldIsFreeSequence = isFreeSequence;
        isFreeSequence = newIsFreeSequence;
        boolean oldIsFreeSequenceESet = isFreeSequenceESet;
        isFreeSequenceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE,
                    oldIsFreeSequence, isFreeSequence, !oldIsFreeSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsFreeSequence() {
        Boolean oldIsFreeSequence = isFreeSequence;
        boolean oldIsFreeSequenceESet = isFreeSequenceESet;
        isFreeSequence = IS_FREE_SEQUENCE_EDEFAULT;
        isFreeSequenceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE,
                    oldIsFreeSequence, IS_FREE_SEQUENCE_EDEFAULT, oldIsFreeSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsFreeSequence() {
        return isFreeSequenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( Integer newSequenceNumber ) {
        Integer oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER,
                    oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        Integer oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GenericAction > getGenericActions() {
        if( genericActions == null ) {
            genericActions = new EObjectWithInverseResolvingEList.Unsettable< GenericAction >( GenericAction.class,
                    this, CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS,
                    CimPackage.GENERIC_ACTION__SWITCHING_STEP_GROUP );
        }
        return genericActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenericActions() {
        if( genericActions != null ) ( ( InternalEList.Unsettable< ? > ) genericActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenericActions() {
        return genericActions != null && ( ( InternalEList.Unsettable< ? > ) genericActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EnergySourceAction > getEnergySourceActions() {
        if( energySourceActions == null ) {
            energySourceActions = new EObjectWithInverseResolvingEList.Unsettable< EnergySourceAction >(
                    EnergySourceAction.class, this, CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS,
                    CimPackage.ENERGY_SOURCE_ACTION__SWITCHING_STEP_GROUP );
        }
        return energySourceActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergySourceActions() {
        if( energySourceActions != null ) ( ( InternalEList.Unsettable< ? > ) energySourceActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySourceActions() {
        return energySourceActions != null && ( ( InternalEList.Unsettable< ? > ) energySourceActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GroundAction > getGroundActions() {
        if( groundActions == null ) {
            groundActions = new EObjectWithInverseResolvingEList.Unsettable< GroundAction >( GroundAction.class, this,
                    CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS, CimPackage.GROUND_ACTION__SWITCHING_STEP_GROUP );
        }
        return groundActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGroundActions() {
        if( groundActions != null ) ( ( InternalEList.Unsettable< ? > ) groundActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundActions() {
        return groundActions != null && ( ( InternalEList.Unsettable< ? > ) groundActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingPlan getSwitchingPlan() {
        return switchingPlan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingPlan( SwitchingPlan newSwitchingPlan, NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = newSwitchingPlan;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN, oldSwitchingPlan, newSwitchingPlan,
                    !oldSwitchingPlanESet );
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
    public void setSwitchingPlan( SwitchingPlan newSwitchingPlan ) {
        if( newSwitchingPlan != switchingPlan ) {
            NotificationChain msgs = null;
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS, SwitchingPlan.class, msgs );
            if( newSwitchingPlan != null ) msgs = ( ( InternalEObject ) newSwitchingPlan ).eInverseAdd( this,
                    CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS, SwitchingPlan.class, msgs );
            msgs = basicSetSwitchingPlan( newSwitchingPlan, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN,
                        newSwitchingPlan, newSwitchingPlan, !oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingPlan( NotificationChain msgs ) {
        SwitchingPlan oldSwitchingPlan = switchingPlan;
        switchingPlan = null;
        boolean oldSwitchingPlanESet = switchingPlanESet;
        switchingPlanESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN, oldSwitchingPlan, null, oldSwitchingPlanESet );
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
    public void unsetSwitchingPlan() {
        if( switchingPlan != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS, SwitchingPlan.class, msgs );
            msgs = basicUnsetSwitchingPlan( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingPlanESet = switchingPlanESet;
            switchingPlanESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN, null, null, oldSwitchingPlanESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingPlan() {
        return switchingPlanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< JumperAction > getJumperActions() {
        if( jumperActions == null ) {
            jumperActions = new EObjectWithInverseResolvingEList.Unsettable< JumperAction >( JumperAction.class, this,
                    CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS, CimPackage.JUMPER_ACTION__SWITCHING_STEP_GROUP );
        }
        return jumperActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetJumperActions() {
        if( jumperActions != null ) ( ( InternalEList.Unsettable< ? > ) jumperActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJumperActions() {
        return jumperActions != null && ( ( InternalEList.Unsettable< ? > ) jumperActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TagAction > getTagActions() {
        if( tagActions == null ) {
            tagActions = new EObjectWithInverseResolvingEList.Unsettable< TagAction >( TagAction.class, this,
                    CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS, CimPackage.TAG_ACTION__SWITCHING_STEP_GROUP );
        }
        return tagActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTagActions() {
        if( tagActions != null ) ( ( InternalEList.Unsettable< ? > ) tagActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTagActions() {
        return tagActions != null && ( ( InternalEList.Unsettable< ? > ) tagActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ClearanceAction > getClearanceActions() {
        if( clearanceActions == null ) {
            clearanceActions = new EObjectWithInverseResolvingEList.Unsettable< ClearanceAction >(
                    ClearanceAction.class, this, CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS,
                    CimPackage.CLEARANCE_ACTION__SWITCHING_STEP_GROUP );
        }
        return clearanceActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClearanceActions() {
        if( clearanceActions != null ) ( ( InternalEList.Unsettable< ? > ) clearanceActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClearanceActions() {
        return clearanceActions != null && ( ( InternalEList.Unsettable< ? > ) clearanceActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CutAction > getCutActions() {
        if( cutActions == null ) {
            cutActions = new EObjectWithInverseResolvingEList.Unsettable< CutAction >( CutAction.class, this,
                    CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS, CimPackage.CUT_ACTION__SWITCHING_STEP_GROUP );
        }
        return cutActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCutActions() {
        if( cutActions != null ) ( ( InternalEList.Unsettable< ? > ) cutActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCutActions() {
        return cutActions != null && ( ( InternalEList.Unsettable< ? > ) cutActions ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchAction > getSwitchActions() {
        if( switchActions == null ) {
            switchActions = new EObjectWithInverseResolvingEList.Unsettable< SwitchAction >( SwitchAction.class, this,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS, CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP );
        }
        return switchActions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchActions() {
        if( switchActions != null ) ( ( InternalEList.Unsettable< ? > ) switchActions ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchActions() {
        return switchActions != null && ( ( InternalEList.Unsettable< ? > ) switchActions ).isSet();
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
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGenericActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEnergySourceActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGroundActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            if( switchingPlan != null ) msgs = ( ( InternalEObject ) switchingPlan ).eInverseRemove( this,
                    CimPackage.SWITCHING_PLAN__SWITCHING_STEP_GROUPS, SwitchingPlan.class, msgs );
            return basicSetSwitchingPlan( ( SwitchingPlan ) otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getJumperActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTagActions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getClearanceActions() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCutActions() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchActions() )
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
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            return ( ( InternalEList< ? > ) getGenericActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            return ( ( InternalEList< ? > ) getEnergySourceActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            return ( ( InternalEList< ? > ) getGroundActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            return basicUnsetSwitchingPlan( msgs );
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            return ( ( InternalEList< ? > ) getJumperActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            return ( ( InternalEList< ? > ) getTagActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            return ( ( InternalEList< ? > ) getClearanceActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            return ( ( InternalEList< ? > ) getCutActions() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            return ( ( InternalEList< ? > ) getSwitchActions() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE:
            return getIsFreeSequence();
        case CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER:
            return getSequenceNumber();
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            return getGenericActions();
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            return getEnergySourceActions();
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            return getGroundActions();
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            return getSwitchingPlan();
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            return getJumperActions();
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            return getTagActions();
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            return getClearanceActions();
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            return getCutActions();
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            return getSwitchActions();
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
        case CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE:
            setIsFreeSequence( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER:
            setSequenceNumber( ( Integer ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            getGenericActions().clear();
            getGenericActions().addAll( ( Collection< ? extends GenericAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            getEnergySourceActions().clear();
            getEnergySourceActions().addAll( ( Collection< ? extends EnergySourceAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            getGroundActions().clear();
            getGroundActions().addAll( ( Collection< ? extends GroundAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            setSwitchingPlan( ( SwitchingPlan ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            getJumperActions().clear();
            getJumperActions().addAll( ( Collection< ? extends JumperAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            getTagActions().clear();
            getTagActions().addAll( ( Collection< ? extends TagAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            getClearanceActions().clear();
            getClearanceActions().addAll( ( Collection< ? extends ClearanceAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            getCutActions().clear();
            getCutActions().addAll( ( Collection< ? extends CutAction > ) newValue );
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            getSwitchActions().clear();
            getSwitchActions().addAll( ( Collection< ? extends SwitchAction > ) newValue );
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
        case CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE:
            unsetIsFreeSequence();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER:
            unsetSequenceNumber();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            unsetGenericActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            unsetEnergySourceActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            unsetGroundActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            unsetSwitchingPlan();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            unsetJumperActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            unsetTagActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            unsetClearanceActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            unsetCutActions();
            return;
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            unsetSwitchActions();
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
        case CimPackage.SWITCHING_STEP_GROUP__IS_FREE_SEQUENCE:
            return isSetIsFreeSequence();
        case CimPackage.SWITCHING_STEP_GROUP__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
        case CimPackage.SWITCHING_STEP_GROUP__GENERIC_ACTIONS:
            return isSetGenericActions();
        case CimPackage.SWITCHING_STEP_GROUP__ENERGY_SOURCE_ACTIONS:
            return isSetEnergySourceActions();
        case CimPackage.SWITCHING_STEP_GROUP__GROUND_ACTIONS:
            return isSetGroundActions();
        case CimPackage.SWITCHING_STEP_GROUP__SWITCHING_PLAN:
            return isSetSwitchingPlan();
        case CimPackage.SWITCHING_STEP_GROUP__JUMPER_ACTIONS:
            return isSetJumperActions();
        case CimPackage.SWITCHING_STEP_GROUP__TAG_ACTIONS:
            return isSetTagActions();
        case CimPackage.SWITCHING_STEP_GROUP__CLEARANCE_ACTIONS:
            return isSetClearanceActions();
        case CimPackage.SWITCHING_STEP_GROUP__CUT_ACTIONS:
            return isSetCutActions();
        case CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS:
            return isSetSwitchActions();
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
        result.append( " (isFreeSequence: " );
        if( isFreeSequenceESet )
            result.append( isFreeSequence );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchingStepGroupImpl
