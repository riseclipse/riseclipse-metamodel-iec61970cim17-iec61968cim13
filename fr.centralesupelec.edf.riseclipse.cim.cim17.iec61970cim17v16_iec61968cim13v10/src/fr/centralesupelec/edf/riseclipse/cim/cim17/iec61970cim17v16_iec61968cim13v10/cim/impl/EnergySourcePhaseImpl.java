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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EnergySourcePhase;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SinglePhaseKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Source Phase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergySourcePhaseImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EnergySourcePhaseImpl#getEnergySource <em>Energy Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergySourcePhaseImpl extends PowerSystemResourceImpl implements EnergySourcePhase {
    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final SinglePhaseKind PHASE_EDEFAULT = SinglePhaseKind.A;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected SinglePhaseKind phase = PHASE_EDEFAULT;

    /**
     * This is true if the Phase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseESet;

    /**
     * The cached value of the '{@link #getEnergySource() <em>Energy Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySource()
     * @generated
     * @ordered
     */
    protected EnergySource energySource;

    /**
     * This is true if the Energy Source reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energySourceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergySourcePhaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergySourcePhase();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SinglePhaseKind getPhase() {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhase( SinglePhaseKind newPhase ) {
        SinglePhaseKind oldPhase = phase;
        phase = newPhase == null ? PHASE_EDEFAULT : newPhase;
        boolean oldPhaseESet = phaseESet;
        phaseESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ENERGY_SOURCE_PHASE__PHASE, oldPhase, phase, !oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhase() {
        SinglePhaseKind oldPhase = phase;
        boolean oldPhaseESet = phaseESet;
        phase = PHASE_EDEFAULT;
        phaseESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ENERGY_SOURCE_PHASE__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhase() {
        return phaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySource getEnergySource() {
        return energySource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergySource( EnergySource newEnergySource, NotificationChain msgs ) {
        EnergySource oldEnergySource = energySource;
        energySource = newEnergySource;
        boolean oldEnergySourceESet = energySourceESet;
        energySourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE, oldEnergySource, newEnergySource,
                    !oldEnergySourceESet );
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
    public void setEnergySource( EnergySource newEnergySource ) {
        if( newEnergySource != energySource ) {
            NotificationChain msgs = null;
            if( energySource != null ) msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_PHASE, EnergySource.class, msgs );
            if( newEnergySource != null ) msgs = ( ( InternalEObject ) newEnergySource ).eInverseAdd( this,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_PHASE, EnergySource.class, msgs );
            msgs = basicSetEnergySource( newEnergySource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceESet = energySourceESet;
            energySourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE,
                        newEnergySource, newEnergySource, !oldEnergySourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergySource( NotificationChain msgs ) {
        EnergySource oldEnergySource = energySource;
        energySource = null;
        boolean oldEnergySourceESet = energySourceESet;
        energySourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE, oldEnergySource, null, oldEnergySourceESet );
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
    public void unsetEnergySource() {
        if( energySource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_PHASE, EnergySource.class, msgs );
            msgs = basicUnsetEnergySource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySourceESet = energySourceESet;
            energySourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE, null, null, oldEnergySourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySource() {
        return energySourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            if( energySource != null ) msgs = ( ( InternalEObject ) energySource ).eInverseRemove( this,
                    CimPackage.ENERGY_SOURCE__ENERGY_SOURCE_PHASE, EnergySource.class, msgs );
            return basicSetEnergySource( ( EnergySource ) otherEnd, msgs );
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
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            return basicUnsetEnergySource( msgs );
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
        case CimPackage.ENERGY_SOURCE_PHASE__PHASE:
            return getPhase();
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            return getEnergySource();
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
        case CimPackage.ENERGY_SOURCE_PHASE__PHASE:
            setPhase( ( SinglePhaseKind ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            setEnergySource( ( EnergySource ) newValue );
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
        case CimPackage.ENERGY_SOURCE_PHASE__PHASE:
            unsetPhase();
            return;
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            unsetEnergySource();
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
        case CimPackage.ENERGY_SOURCE_PHASE__PHASE:
            return isSetPhase();
        case CimPackage.ENERGY_SOURCE_PHASE__ENERGY_SOURCE:
            return isSetEnergySource();
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
        result.append( " (phase: " );
        if( phaseESet )
            result.append( phase );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EnergySourcePhaseImpl
