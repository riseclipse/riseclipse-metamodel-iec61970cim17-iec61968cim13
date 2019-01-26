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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchAction;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchActionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchingStepGroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchActionImpl#getOperatedSwitch <em>Operated Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchActionImpl#getSwitchingStepGroup <em>Switching Step Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchActionImpl#getPlannedOutage <em>Planned Outage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchActionImpl extends SwitchingStepImpl implements SwitchAction {
    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final SwitchActionKind KIND_EDEFAULT = SwitchActionKind.OPEN;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected SwitchActionKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The cached value of the '{@link #getOperatedSwitch() <em>Operated Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatedSwitch()
     * @generated
     * @ordered
     */
    protected Switch operatedSwitch;

    /**
     * This is true if the Operated Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatedSwitchESet;

    /**
     * The cached value of the '{@link #getSwitchingStepGroup() <em>Switching Step Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchingStepGroup()
     * @generated
     * @ordered
     */
    protected SwitchingStepGroup switchingStepGroup;

    /**
     * This is true if the Switching Step Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchingStepGroupESet;

    /**
     * The cached value of the '{@link #getPlannedOutage() <em>Planned Outage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlannedOutage()
     * @generated
     * @ordered
     */
    protected Outage plannedOutage;

    /**
     * This is true if the Planned Outage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean plannedOutageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchAction();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchActionKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( SwitchActionKind newKind ) {
        SwitchActionKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_ACTION__KIND, oldKind, kind, !oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        SwitchActionKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_ACTION__KIND, oldKind, KIND_EDEFAULT, oldKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch getOperatedSwitch() {
        return operatedSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperatedSwitch( Switch newOperatedSwitch, NotificationChain msgs ) {
        Switch oldOperatedSwitch = operatedSwitch;
        operatedSwitch = newOperatedSwitch;
        boolean oldOperatedSwitchESet = operatedSwitchESet;
        operatedSwitchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, oldOperatedSwitch, newOperatedSwitch,
                    !oldOperatedSwitchESet );
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
    public void setOperatedSwitch( Switch newOperatedSwitch ) {
        if( newOperatedSwitch != operatedSwitch ) {
            NotificationChain msgs = null;
            if( operatedSwitch != null ) msgs = ( ( InternalEObject ) operatedSwitch ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_ACTION, Switch.class, msgs );
            if( newOperatedSwitch != null ) msgs = ( ( InternalEObject ) newOperatedSwitch ).eInverseAdd( this,
                    CimPackage.SWITCH__SWITCH_ACTION, Switch.class, msgs );
            msgs = basicSetOperatedSwitch( newOperatedSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatedSwitchESet = operatedSwitchESet;
            operatedSwitchESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_ACTION__OPERATED_SWITCH,
                        newOperatedSwitch, newOperatedSwitch, !oldOperatedSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOperatedSwitch( NotificationChain msgs ) {
        Switch oldOperatedSwitch = operatedSwitch;
        operatedSwitch = null;
        boolean oldOperatedSwitchESet = operatedSwitchESet;
        operatedSwitchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, oldOperatedSwitch, null, oldOperatedSwitchESet );
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
    public void unsetOperatedSwitch() {
        if( operatedSwitch != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) operatedSwitch ).eInverseRemove( this, CimPackage.SWITCH__SWITCH_ACTION,
                    Switch.class, msgs );
            msgs = basicUnsetOperatedSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOperatedSwitchESet = operatedSwitchESet;
            operatedSwitchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__OPERATED_SWITCH, null, null, oldOperatedSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatedSwitch() {
        return operatedSwitchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SwitchingStepGroup getSwitchingStepGroup() {
        return switchingStepGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup,
            NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = newSwitchingStepGroup;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, newSwitchingStepGroup,
                    !oldSwitchingStepGroupESet );
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
    public void setSwitchingStepGroup( SwitchingStepGroup newSwitchingStepGroup ) {
        if( newSwitchingStepGroup != switchingStepGroup ) {
            NotificationChain msgs = null;
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS, SwitchingStepGroup.class, msgs );
            if( newSwitchingStepGroup != null ) msgs = ( ( InternalEObject ) newSwitchingStepGroup ).eInverseAdd( this,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicSetSwitchingStepGroup( newSwitchingStepGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP,
                        newSwitchingStepGroup, newSwitchingStepGroup, !oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitchingStepGroup( NotificationChain msgs ) {
        SwitchingStepGroup oldSwitchingStepGroup = switchingStepGroup;
        switchingStepGroup = null;
        boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
        switchingStepGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP, oldSwitchingStepGroup, null,
                    oldSwitchingStepGroupESet );
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
    public void unsetSwitchingStepGroup() {
        if( switchingStepGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS, SwitchingStepGroup.class, msgs );
            msgs = basicUnsetSwitchingStepGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchingStepGroupESet = switchingStepGroupESet;
            switchingStepGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP, null, null, oldSwitchingStepGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchingStepGroup() {
        return switchingStepGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Outage getPlannedOutage() {
        return plannedOutage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlannedOutage( Outage newPlannedOutage, NotificationChain msgs ) {
        Outage oldPlannedOutage = plannedOutage;
        plannedOutage = newPlannedOutage;
        boolean oldPlannedOutageESet = plannedOutageESet;
        plannedOutageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_ACTION__PLANNED_OUTAGE, oldPlannedOutage, newPlannedOutage,
                    !oldPlannedOutageESet );
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
    public void setPlannedOutage( Outage newPlannedOutage ) {
        if( newPlannedOutage != plannedOutage ) {
            NotificationChain msgs = null;
            if( plannedOutage != null ) msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this,
                    CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, Outage.class, msgs );
            if( newPlannedOutage != null ) msgs = ( ( InternalEObject ) newPlannedOutage ).eInverseAdd( this,
                    CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, Outage.class, msgs );
            msgs = basicSetPlannedOutage( newPlannedOutage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPlannedOutageESet = plannedOutageESet;
            plannedOutageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH_ACTION__PLANNED_OUTAGE,
                        newPlannedOutage, newPlannedOutage, !oldPlannedOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPlannedOutage( NotificationChain msgs ) {
        Outage oldPlannedOutage = plannedOutage;
        plannedOutage = null;
        boolean oldPlannedOutageESet = plannedOutageESet;
        plannedOutageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__PLANNED_OUTAGE, oldPlannedOutage, null, oldPlannedOutageESet );
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
    public void unsetPlannedOutage() {
        if( plannedOutage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this,
                    CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, Outage.class, msgs );
            msgs = basicUnsetPlannedOutage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPlannedOutageESet = plannedOutageESet;
            plannedOutageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_ACTION__PLANNED_OUTAGE, null, null, oldPlannedOutageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPlannedOutage() {
        return plannedOutageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            if( operatedSwitch != null ) msgs = ( ( InternalEObject ) operatedSwitch ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_ACTION, Switch.class, msgs );
            return basicSetOperatedSwitch( ( Switch ) otherEnd, msgs );
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            if( switchingStepGroup != null ) msgs = ( ( InternalEObject ) switchingStepGroup ).eInverseRemove( this,
                    CimPackage.SWITCHING_STEP_GROUP__SWITCH_ACTIONS, SwitchingStepGroup.class, msgs );
            return basicSetSwitchingStepGroup( ( SwitchingStepGroup ) otherEnd, msgs );
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            if( plannedOutage != null ) msgs = ( ( InternalEObject ) plannedOutage ).eInverseRemove( this,
                    CimPackage.OUTAGE__PLANNED_SWITCH_ACTIONS, Outage.class, msgs );
            return basicSetPlannedOutage( ( Outage ) otherEnd, msgs );
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
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            return basicUnsetOperatedSwitch( msgs );
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            return basicUnsetSwitchingStepGroup( msgs );
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            return basicUnsetPlannedOutage( msgs );
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
        case CimPackage.SWITCH_ACTION__KIND:
            return getKind();
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            return getOperatedSwitch();
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            return getSwitchingStepGroup();
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            return getPlannedOutage();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.SWITCH_ACTION__KIND:
            setKind( ( SwitchActionKind ) newValue );
            return;
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            setOperatedSwitch( ( Switch ) newValue );
            return;
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            setSwitchingStepGroup( ( SwitchingStepGroup ) newValue );
            return;
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            setPlannedOutage( ( Outage ) newValue );
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
        case CimPackage.SWITCH_ACTION__KIND:
            unsetKind();
            return;
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            unsetOperatedSwitch();
            return;
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            unsetSwitchingStepGroup();
            return;
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            unsetPlannedOutage();
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
        case CimPackage.SWITCH_ACTION__KIND:
            return isSetKind();
        case CimPackage.SWITCH_ACTION__OPERATED_SWITCH:
            return isSetOperatedSwitch();
        case CimPackage.SWITCH_ACTION__SWITCHING_STEP_GROUP:
            return isSetSwitchingStepGroup();
        case CimPackage.SWITCH_ACTION__PLANNED_OUTAGE:
            return isSetPlannedOutage();
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
        result.append( " (kind: " );
        if( kindESet )
            result.append( kind );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchActionImpl
