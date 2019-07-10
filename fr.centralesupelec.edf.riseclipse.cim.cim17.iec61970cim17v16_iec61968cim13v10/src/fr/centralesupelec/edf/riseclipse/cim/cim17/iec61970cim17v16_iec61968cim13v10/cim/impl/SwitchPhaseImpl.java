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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchPhase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchPhaseImpl#getClosed <em>Closed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchPhaseImpl#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchPhaseImpl#getPhaseSide1 <em>Phase Side1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchPhaseImpl#getPhaseSide2 <em>Phase Side2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchPhaseImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchPhaseImpl extends PowerSystemResourceImpl implements SwitchPhase {
    /**
     * The default value of the '{@link #getClosed() <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClosed()
     * @generated
     * @ordered
     */
    protected static final Boolean CLOSED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClosed() <em>Closed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClosed()
     * @generated
     * @ordered
     */
    protected Boolean closed = CLOSED_EDEFAULT;

    /**
     * This is true if the Closed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean closedESet;

    /**
     * The default value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean NORMAL_OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected Boolean normalOpen = NORMAL_OPEN_EDEFAULT;

    /**
     * This is true if the Normal Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalOpenESet;

    /**
     * The default value of the '{@link #getPhaseSide1() <em>Phase Side1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseSide1()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_SIDE1_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhaseSide1() <em>Phase Side1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseSide1()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phaseSide1 = PHASE_SIDE1_EDEFAULT;

    /**
     * This is true if the Phase Side1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseSide1ESet;

    /**
     * The default value of the '{@link #getPhaseSide2() <em>Phase Side2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseSide2()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_SIDE2_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhaseSide2() <em>Phase Side2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseSide2()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phaseSide2 = PHASE_SIDE2_EDEFAULT;

    /**
     * This is true if the Phase Side2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseSide2ESet;

    /**
     * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitch()
     * @generated
     * @ordered
     */
    protected Switch switch_;

    /**
     * This is true if the Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchPhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchPhase();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getClosed() {
        return closed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setClosed( Boolean newClosed ) {
        Boolean oldClosed = closed;
        closed = newClosed;
        boolean oldClosedESet = closedESet;
        closedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_PHASE__CLOSED, oldClosed, closed, !oldClosedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClosed() {
        Boolean oldClosed = closed;
        boolean oldClosedESet = closedESet;
        closed = CLOSED_EDEFAULT;
        closedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_PHASE__CLOSED, oldClosed, CLOSED_EDEFAULT, oldClosedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClosed() {
        return closedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNormalOpen() {
        return normalOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalOpen( Boolean newNormalOpen ) {
        Boolean oldNormalOpen = normalOpen;
        normalOpen = newNormalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpenESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_PHASE__NORMAL_OPEN, oldNormalOpen, normalOpen, !oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalOpen() {
        Boolean oldNormalOpen = normalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpen = NORMAL_OPEN_EDEFAULT;
        normalOpenESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_PHASE__NORMAL_OPEN, oldNormalOpen, NORMAL_OPEN_EDEFAULT, oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalOpen() {
        return normalOpenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhaseSide1() {
        return phaseSide1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseSide1( SinglePhaseKind newPhaseSide1 ) {
        SinglePhaseKind oldPhaseSide1 = phaseSide1;
        phaseSide1 = newPhaseSide1 == null ? PHASE_SIDE1_EDEFAULT : newPhaseSide1;
        boolean oldPhaseSide1ESet = phaseSide1ESet;
        phaseSide1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_PHASE__PHASE_SIDE1, oldPhaseSide1, phaseSide1, !oldPhaseSide1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseSide1() {
        SinglePhaseKind oldPhaseSide1 = phaseSide1;
        boolean oldPhaseSide1ESet = phaseSide1ESet;
        phaseSide1 = PHASE_SIDE1_EDEFAULT;
        phaseSide1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_PHASE__PHASE_SIDE1, oldPhaseSide1, PHASE_SIDE1_EDEFAULT, oldPhaseSide1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseSide1() {
        return phaseSide1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhaseSide2() {
        return phaseSide2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseSide2( SinglePhaseKind newPhaseSide2 ) {
        SinglePhaseKind oldPhaseSide2 = phaseSide2;
        phaseSide2 = newPhaseSide2 == null ? PHASE_SIDE2_EDEFAULT : newPhaseSide2;
        boolean oldPhaseSide2ESet = phaseSide2ESet;
        phaseSide2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SWITCH_PHASE__PHASE_SIDE2, oldPhaseSide2, phaseSide2, !oldPhaseSide2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseSide2() {
        SinglePhaseKind oldPhaseSide2 = phaseSide2;
        boolean oldPhaseSide2ESet = phaseSide2ESet;
        phaseSide2 = PHASE_SIDE2_EDEFAULT;
        phaseSide2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SWITCH_PHASE__PHASE_SIDE2, oldPhaseSide2, PHASE_SIDE2_EDEFAULT, oldPhaseSide2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseSide2() {
        return phaseSide2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch getSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitch( Switch newSwitch, NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = newSwitch;
        boolean oldSwitchESet = switchESet;
        switchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_PHASE__SWITCH, oldSwitch, newSwitch, !oldSwitchESet );
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
    public void setSwitch( Switch newSwitch ) {
        if( newSwitch != switch_ ) {
            NotificationChain msgs = null;
            if( switch_ != null ) msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_PHASE, Switch.class, msgs );
            if( newSwitch != null ) msgs = ( ( InternalEObject ) newSwitch ).eInverseAdd( this,
                    CimPackage.SWITCH__SWITCH_PHASE, Switch.class, msgs );
            msgs = basicSetSwitch( newSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_PHASE__SWITCH, newSwitch, newSwitch, !oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitch( NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = null;
        boolean oldSwitchESet = switchESet;
        switchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_PHASE__SWITCH, oldSwitch, null, oldSwitchESet );
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
    public void unsetSwitch() {
        if( switch_ != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this, CimPackage.SWITCH__SWITCH_PHASE, Switch.class,
                    msgs );
            msgs = basicUnsetSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_PHASE__SWITCH, null, null, oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitch() {
        return switchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SWITCH_PHASE__SWITCH:
            if( switch_ != null ) msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_PHASE, Switch.class, msgs );
            return basicSetSwitch( ( Switch ) otherEnd, msgs );
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
        case CimPackage.SWITCH_PHASE__SWITCH:
            return basicUnsetSwitch( msgs );
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
        case CimPackage.SWITCH_PHASE__CLOSED:
            return getClosed();
        case CimPackage.SWITCH_PHASE__NORMAL_OPEN:
            return getNormalOpen();
        case CimPackage.SWITCH_PHASE__PHASE_SIDE1:
            return getPhaseSide1();
        case CimPackage.SWITCH_PHASE__PHASE_SIDE2:
            return getPhaseSide2();
        case CimPackage.SWITCH_PHASE__SWITCH:
            return getSwitch();
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
        case CimPackage.SWITCH_PHASE__CLOSED:
            setClosed( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_PHASE__NORMAL_OPEN:
            setNormalOpen( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH_PHASE__PHASE_SIDE1:
            setPhaseSide1( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.SWITCH_PHASE__PHASE_SIDE2:
            setPhaseSide2( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.SWITCH_PHASE__SWITCH:
            setSwitch( ( Switch ) newValue );
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
        case CimPackage.SWITCH_PHASE__CLOSED:
            unsetClosed();
            return;
        case CimPackage.SWITCH_PHASE__NORMAL_OPEN:
            unsetNormalOpen();
            return;
        case CimPackage.SWITCH_PHASE__PHASE_SIDE1:
            unsetPhaseSide1();
            return;
        case CimPackage.SWITCH_PHASE__PHASE_SIDE2:
            unsetPhaseSide2();
            return;
        case CimPackage.SWITCH_PHASE__SWITCH:
            unsetSwitch();
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
        case CimPackage.SWITCH_PHASE__CLOSED:
            return isSetClosed();
        case CimPackage.SWITCH_PHASE__NORMAL_OPEN:
            return isSetNormalOpen();
        case CimPackage.SWITCH_PHASE__PHASE_SIDE1:
            return isSetPhaseSide1();
        case CimPackage.SWITCH_PHASE__PHASE_SIDE2:
            return isSetPhaseSide2();
        case CimPackage.SWITCH_PHASE__SWITCH:
            return isSetSwitch();
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
        result.append( " (closed: " );
        if( closedESet )
            result.append( closed );
        else
            result.append( "<unset>" );
        result.append( ", normalOpen: " );
        if( normalOpenESet )
            result.append( normalOpen );
        else
            result.append( "<unset>" );
        result.append( ", phaseSide1: " );
        if( phaseSide1ESet )
            result.append( phaseSide1 );
        else
            result.append( "<unset>" );
        result.append( ", phaseSide2: " );
        if( phaseSide2ESet )
            result.append( phaseSide2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchPhaseImpl
