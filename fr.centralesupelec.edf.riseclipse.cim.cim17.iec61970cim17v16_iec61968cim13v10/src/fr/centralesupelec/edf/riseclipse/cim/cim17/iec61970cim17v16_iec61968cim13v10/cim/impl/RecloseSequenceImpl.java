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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RecloseSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reclose Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RecloseSequenceImpl#getRecloseDelay <em>Reclose Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RecloseSequenceImpl#getRecloseStep <em>Reclose Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RecloseSequenceImpl#getProtectedSwitch <em>Protected Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecloseSequenceImpl extends IdentifiedObjectImpl implements RecloseSequence {
    /**
     * The default value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecloseDelay()
     * @generated
     * @ordered
     */
    protected static final Float RECLOSE_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecloseDelay() <em>Reclose Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecloseDelay()
     * @generated
     * @ordered
     */
    protected Float recloseDelay = RECLOSE_DELAY_EDEFAULT;

    /**
     * This is true if the Reclose Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recloseDelayESet;

    /**
     * The default value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecloseStep()
     * @generated
     * @ordered
     */
    protected static final Integer RECLOSE_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRecloseStep() <em>Reclose Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRecloseStep()
     * @generated
     * @ordered
     */
    protected Integer recloseStep = RECLOSE_STEP_EDEFAULT;

    /**
     * This is true if the Reclose Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean recloseStepESet;

    /**
     * The cached value of the '{@link #getProtectedSwitch() <em>Protected Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtectedSwitch()
     * @generated
     * @ordered
     */
    protected ProtectedSwitch protectedSwitch;

    /**
     * This is true if the Protected Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean protectedSwitchESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RecloseSequenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRecloseSequence();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRecloseDelay() {
        return recloseDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecloseDelay( Float newRecloseDelay ) {
        Float oldRecloseDelay = recloseDelay;
        recloseDelay = newRecloseDelay;
        boolean oldRecloseDelayESet = recloseDelayESet;
        recloseDelayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY, oldRecloseDelay, recloseDelay, !oldRecloseDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecloseDelay() {
        Float oldRecloseDelay = recloseDelay;
        boolean oldRecloseDelayESet = recloseDelayESet;
        recloseDelay = RECLOSE_DELAY_EDEFAULT;
        recloseDelayESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY,
                    oldRecloseDelay, RECLOSE_DELAY_EDEFAULT, oldRecloseDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecloseDelay() {
        return recloseDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getRecloseStep() {
        return recloseStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRecloseStep( Integer newRecloseStep ) {
        Integer oldRecloseStep = recloseStep;
        recloseStep = newRecloseStep;
        boolean oldRecloseStepESet = recloseStepESet;
        recloseStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP, oldRecloseStep, recloseStep, !oldRecloseStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRecloseStep() {
        Integer oldRecloseStep = recloseStep;
        boolean oldRecloseStepESet = recloseStepESet;
        recloseStep = RECLOSE_STEP_EDEFAULT;
        recloseStepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP,
                    oldRecloseStep, RECLOSE_STEP_EDEFAULT, oldRecloseStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRecloseStep() {
        return recloseStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ProtectedSwitch getProtectedSwitch() {
        return protectedSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProtectedSwitch( ProtectedSwitch newProtectedSwitch, NotificationChain msgs ) {
        ProtectedSwitch oldProtectedSwitch = protectedSwitch;
        protectedSwitch = newProtectedSwitch;
        boolean oldProtectedSwitchESet = protectedSwitchESet;
        protectedSwitchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, oldProtectedSwitch, newProtectedSwitch,
                    !oldProtectedSwitchESet );
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
    public void setProtectedSwitch( ProtectedSwitch newProtectedSwitch ) {
        if( newProtectedSwitch != protectedSwitch ) {
            NotificationChain msgs = null;
            if( protectedSwitch != null ) msgs = ( ( InternalEObject ) protectedSwitch ).eInverseRemove( this,
                    CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs );
            if( newProtectedSwitch != null ) msgs = ( ( InternalEObject ) newProtectedSwitch ).eInverseAdd( this,
                    CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs );
            msgs = basicSetProtectedSwitch( newProtectedSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProtectedSwitchESet = protectedSwitchESet;
            protectedSwitchESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH,
                        newProtectedSwitch, newProtectedSwitch, !oldProtectedSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetProtectedSwitch( NotificationChain msgs ) {
        ProtectedSwitch oldProtectedSwitch = protectedSwitch;
        protectedSwitch = null;
        boolean oldProtectedSwitchESet = protectedSwitchESet;
        protectedSwitchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, oldProtectedSwitch, null, oldProtectedSwitchESet );
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
    public void unsetProtectedSwitch() {
        if( protectedSwitch != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) protectedSwitch ).eInverseRemove( this,
                    CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs );
            msgs = basicUnsetProtectedSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldProtectedSwitchESet = protectedSwitchESet;
            protectedSwitchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH, null, null, oldProtectedSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProtectedSwitch() {
        return protectedSwitchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            if( protectedSwitch != null ) msgs = ( ( InternalEObject ) protectedSwitch ).eInverseRemove( this,
                    CimPackage.PROTECTED_SWITCH__RECLOSE_SEQUENCES, ProtectedSwitch.class, msgs );
            return basicSetProtectedSwitch( ( ProtectedSwitch ) otherEnd, msgs );
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
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            return basicUnsetProtectedSwitch( msgs );
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
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
            return getRecloseDelay();
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
            return getRecloseStep();
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            return getProtectedSwitch();
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
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
            setRecloseDelay( ( Float ) newValue );
            return;
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
            setRecloseStep( ( Integer ) newValue );
            return;
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            setProtectedSwitch( ( ProtectedSwitch ) newValue );
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
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
            unsetRecloseDelay();
            return;
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
            unsetRecloseStep();
            return;
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            unsetProtectedSwitch();
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
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_DELAY:
            return isSetRecloseDelay();
        case CimPackage.RECLOSE_SEQUENCE__RECLOSE_STEP:
            return isSetRecloseStep();
        case CimPackage.RECLOSE_SEQUENCE__PROTECTED_SWITCH:
            return isSetProtectedSwitch();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (recloseDelay: " );
        if( recloseDelayESet )
            result.append( recloseDelay );
        else
            result.append( "<unset>" );
        result.append( ", recloseStep: " );
        if( recloseStepESet )
            result.append( recloseStep );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RecloseSequenceImpl
