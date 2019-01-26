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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EquivalentInjection;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReactiveCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachine;

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
 * An implementation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReactiveCapabilityCurveImpl#getCoolantTemperature <em>Coolant Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReactiveCapabilityCurveImpl#getHydrogenPressure <em>Hydrogen Pressure</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReactiveCapabilityCurveImpl#getEquivalentInjection <em>Equivalent Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReactiveCapabilityCurveImpl#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReactiveCapabilityCurveImpl#getSynchronousMachines <em>Synchronous Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactiveCapabilityCurveImpl extends CurveImpl implements ReactiveCapabilityCurve {
    /**
     * The default value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantTemperature()
     * @generated
     * @ordered
     */
    protected static final Float COOLANT_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoolantTemperature() <em>Coolant Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoolantTemperature()
     * @generated
     * @ordered
     */
    protected Float coolantTemperature = COOLANT_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Coolant Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coolantTemperatureESet;

    /**
     * The default value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydrogenPressure()
     * @generated
     * @ordered
     */
    protected static final Float HYDROGEN_PRESSURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHydrogenPressure() <em>Hydrogen Pressure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydrogenPressure()
     * @generated
     * @ordered
     */
    protected Float hydrogenPressure = HYDROGEN_PRESSURE_EDEFAULT;

    /**
     * This is true if the Hydrogen Pressure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydrogenPressureESet;

    /**
     * The cached value of the '{@link #getEquivalentInjection() <em>Equivalent Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquivalentInjection()
     * @generated
     * @ordered
     */
    protected EList< EquivalentInjection > equivalentInjection;

    /**
     * The cached value of the '{@link #getInitiallyUsedBySynchronousMachines() <em>Initially Used By Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     * @ordered
     */
    protected EList< SynchronousMachine > initiallyUsedBySynchronousMachines;

    /**
     * The cached value of the '{@link #getSynchronousMachines() <em>Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachines()
     * @generated
     * @ordered
     */
    protected EList< SynchronousMachine > synchronousMachines;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReactiveCapabilityCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReactiveCapabilityCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoolantTemperature() {
        return coolantTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoolantTemperature( Float newCoolantTemperature ) {
        Float oldCoolantTemperature = coolantTemperature;
        coolantTemperature = newCoolantTemperature;
        boolean oldCoolantTemperatureESet = coolantTemperatureESet;
        coolantTemperatureESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE, oldCoolantTemperature, coolantTemperature,
                !oldCoolantTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoolantTemperature() {
        Float oldCoolantTemperature = coolantTemperature;
        boolean oldCoolantTemperatureESet = coolantTemperatureESet;
        coolantTemperature = COOLANT_TEMPERATURE_EDEFAULT;
        coolantTemperatureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE, oldCoolantTemperature,
                COOLANT_TEMPERATURE_EDEFAULT, oldCoolantTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoolantTemperature() {
        return coolantTemperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHydrogenPressure() {
        return hydrogenPressure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHydrogenPressure( Float newHydrogenPressure ) {
        Float oldHydrogenPressure = hydrogenPressure;
        hydrogenPressure = newHydrogenPressure;
        boolean oldHydrogenPressureESet = hydrogenPressureESet;
        hydrogenPressureESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE,
                        oldHydrogenPressure, hydrogenPressure, !oldHydrogenPressureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHydrogenPressure() {
        Float oldHydrogenPressure = hydrogenPressure;
        boolean oldHydrogenPressureESet = hydrogenPressureESet;
        hydrogenPressure = HYDROGEN_PRESSURE_EDEFAULT;
        hydrogenPressureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE, oldHydrogenPressure,
                HYDROGEN_PRESSURE_EDEFAULT, oldHydrogenPressureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydrogenPressure() {
        return hydrogenPressureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EquivalentInjection > getEquivalentInjection() {
        if( equivalentInjection == null ) {
            equivalentInjection = new EObjectWithInverseResolvingEList.Unsettable< EquivalentInjection >(
                    EquivalentInjection.class, this, CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE );
        }
        return equivalentInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquivalentInjection() {
        if( equivalentInjection != null ) ( ( InternalEList.Unsettable< ? > ) equivalentInjection ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquivalentInjection() {
        return equivalentInjection != null && ( ( InternalEList.Unsettable< ? > ) equivalentInjection ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SynchronousMachine > getInitiallyUsedBySynchronousMachines() {
        if( initiallyUsedBySynchronousMachines == null ) {
            initiallyUsedBySynchronousMachines = new EObjectWithInverseResolvingEList.Unsettable< SynchronousMachine >(
                    SynchronousMachine.class, this,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE );
        }
        return initiallyUsedBySynchronousMachines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitiallyUsedBySynchronousMachines() {
        if( initiallyUsedBySynchronousMachines != null )
            ( ( InternalEList.Unsettable< ? > ) initiallyUsedBySynchronousMachines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitiallyUsedBySynchronousMachines() {
        return initiallyUsedBySynchronousMachines != null
                && ( ( InternalEList.Unsettable< ? > ) initiallyUsedBySynchronousMachines ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SynchronousMachine > getSynchronousMachines() {
        if( synchronousMachines == null ) {
            synchronousMachines = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< SynchronousMachine >(
                    SynchronousMachine.class, this, CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES,
                    CimPackage.SYNCHRONOUS_MACHINE__REACTIVE_CAPABILITY_CURVES );
        }
        return synchronousMachines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSynchronousMachines() {
        if( synchronousMachines != null ) ( ( InternalEList.Unsettable< ? > ) synchronousMachines ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachines() {
        return synchronousMachines != null && ( ( InternalEList.Unsettable< ? > ) synchronousMachines ).isSet();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquivalentInjection() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInitiallyUsedBySynchronousMachines() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSynchronousMachines() )
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return ( ( InternalEList< ? > ) getEquivalentInjection() ).basicRemove( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< ? > ) getInitiallyUsedBySynchronousMachines() ).basicRemove( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< ? > ) getSynchronousMachines() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
            return getCoolantTemperature();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
            return getHydrogenPressure();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return getEquivalentInjection();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return getInitiallyUsedBySynchronousMachines();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            return getSynchronousMachines();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
            setCoolantTemperature( ( Float ) newValue );
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
            setHydrogenPressure( ( Float ) newValue );
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            getEquivalentInjection().clear();
            getEquivalentInjection().addAll( ( Collection< ? extends EquivalentInjection > ) newValue );
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            getInitiallyUsedBySynchronousMachines().clear();
            getInitiallyUsedBySynchronousMachines().addAll( ( Collection< ? extends SynchronousMachine > ) newValue );
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            getSynchronousMachines().clear();
            getSynchronousMachines().addAll( ( Collection< ? extends SynchronousMachine > ) newValue );
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
            unsetCoolantTemperature();
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
            unsetHydrogenPressure();
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            unsetEquivalentInjection();
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            unsetInitiallyUsedBySynchronousMachines();
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            unsetSynchronousMachines();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__COOLANT_TEMPERATURE:
            return isSetCoolantTemperature();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__HYDROGEN_PRESSURE:
            return isSetHydrogenPressure();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return isSetEquivalentInjection();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return isSetInitiallyUsedBySynchronousMachines();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__SYNCHRONOUS_MACHINES:
            return isSetSynchronousMachines();
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
        result.append( " (coolantTemperature: " );
        if( coolantTemperatureESet )
            result.append( coolantTemperature );
        else
            result.append( "<unset>" );
        result.append( ", hydrogenPressure: " );
        if( hydrogenPressureESet )
            result.append( hydrogenPressure );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReactiveCapabilityCurveImpl
