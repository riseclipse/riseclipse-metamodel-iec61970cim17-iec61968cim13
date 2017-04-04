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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachineDynamics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotating Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getDamping <em>Damping</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getInertia <em>Inertia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getSaturationFactor <em>Saturation Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getSaturationFactor120 <em>Saturation Factor120</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getStatorLeakageReactance <em>Stator Leakage Reactance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.RotatingMachineDynamicsImpl#getStatorResistance <em>Stator Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotatingMachineDynamicsImpl extends DynamicsFunctionBlockImpl implements RotatingMachineDynamics {
    /**
     * The default value of the '{@link #getDamping() <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamping()
     * @generated
     * @ordered
     */
    protected static final Float DAMPING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDamping() <em>Damping</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDamping()
     * @generated
     * @ordered
     */
    protected Float damping = DAMPING_EDEFAULT;

    /**
     * This is true if the Damping attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dampingESet;

    /**
     * The default value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInertia()
     * @generated
     * @ordered
     */
    protected static final Float INERTIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInertia() <em>Inertia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInertia()
     * @generated
     * @ordered
     */
    protected Float inertia = INERTIA_EDEFAULT;

    /**
     * This is true if the Inertia attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inertiaESet;

    /**
     * The default value of the '{@link #getSaturationFactor() <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor()
     * @generated
     * @ordered
     */
    protected static final Float SATURATION_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSaturationFactor() <em>Saturation Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor()
     * @generated
     * @ordered
     */
    protected Float saturationFactor = SATURATION_FACTOR_EDEFAULT;

    /**
     * This is true if the Saturation Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean saturationFactorESet;

    /**
     * The default value of the '{@link #getSaturationFactor120() <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor120()
     * @generated
     * @ordered
     */
    protected static final Float SATURATION_FACTOR120_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSaturationFactor120() <em>Saturation Factor120</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSaturationFactor120()
     * @generated
     * @ordered
     */
    protected Float saturationFactor120 = SATURATION_FACTOR120_EDEFAULT;

    /**
     * This is true if the Saturation Factor120 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean saturationFactor120ESet;

    /**
     * The default value of the '{@link #getStatorLeakageReactance() <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatorLeakageReactance()
     * @generated
     * @ordered
     */
    protected static final Float STATOR_LEAKAGE_REACTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatorLeakageReactance() <em>Stator Leakage Reactance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatorLeakageReactance()
     * @generated
     * @ordered
     */
    protected Float statorLeakageReactance = STATOR_LEAKAGE_REACTANCE_EDEFAULT;

    /**
     * This is true if the Stator Leakage Reactance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statorLeakageReactanceESet;

    /**
     * The default value of the '{@link #getStatorResistance() <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatorResistance()
     * @generated
     * @ordered
     */
    protected static final Float STATOR_RESISTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStatorResistance() <em>Stator Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatorResistance()
     * @generated
     * @ordered
     */
    protected Float statorResistance = STATOR_RESISTANCE_EDEFAULT;

    /**
     * This is true if the Stator Resistance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statorResistanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RotatingMachineDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRotatingMachineDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDamping() {
        return damping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDamping( Float newDamping ) {
        Float oldDamping = damping;
        damping = newDamping;
        boolean oldDampingESet = dampingESet;
        dampingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING, oldDamping, damping, !oldDampingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDamping() {
        Float oldDamping = damping;
        boolean oldDampingESet = dampingESet;
        damping = DAMPING_EDEFAULT;
        dampingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING, oldDamping, DAMPING_EDEFAULT, oldDampingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDamping() {
        return dampingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInertia() {
        return inertia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInertia( Float newInertia ) {
        Float oldInertia = inertia;
        inertia = newInertia;
        boolean oldInertiaESet = inertiaESet;
        inertiaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA, oldInertia, inertia, !oldInertiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInertia() {
        Float oldInertia = inertia;
        boolean oldInertiaESet = inertiaESet;
        inertia = INERTIA_EDEFAULT;
        inertiaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA, oldInertia, INERTIA_EDEFAULT, oldInertiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInertia() {
        return inertiaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSaturationFactor() {
        return saturationFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSaturationFactor( Float newSaturationFactor ) {
        Float oldSaturationFactor = saturationFactor;
        saturationFactor = newSaturationFactor;
        boolean oldSaturationFactorESet = saturationFactorESet;
        saturationFactorESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR,
                        oldSaturationFactor, saturationFactor, !oldSaturationFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSaturationFactor() {
        Float oldSaturationFactor = saturationFactor;
        boolean oldSaturationFactorESet = saturationFactorESet;
        saturationFactor = SATURATION_FACTOR_EDEFAULT;
        saturationFactorESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR, oldSaturationFactor,
                SATURATION_FACTOR_EDEFAULT, oldSaturationFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSaturationFactor() {
        return saturationFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSaturationFactor120() {
        return saturationFactor120;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSaturationFactor120( Float newSaturationFactor120 ) {
        Float oldSaturationFactor120 = saturationFactor120;
        saturationFactor120 = newSaturationFactor120;
        boolean oldSaturationFactor120ESet = saturationFactor120ESet;
        saturationFactor120ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120, oldSaturationFactor120, saturationFactor120,
                !oldSaturationFactor120ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSaturationFactor120() {
        Float oldSaturationFactor120 = saturationFactor120;
        boolean oldSaturationFactor120ESet = saturationFactor120ESet;
        saturationFactor120 = SATURATION_FACTOR120_EDEFAULT;
        saturationFactor120ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120, oldSaturationFactor120,
                SATURATION_FACTOR120_EDEFAULT, oldSaturationFactor120ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSaturationFactor120() {
        return saturationFactor120ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStatorLeakageReactance() {
        return statorLeakageReactance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatorLeakageReactance( Float newStatorLeakageReactance ) {
        Float oldStatorLeakageReactance = statorLeakageReactance;
        statorLeakageReactance = newStatorLeakageReactance;
        boolean oldStatorLeakageReactanceESet = statorLeakageReactanceESet;
        statorLeakageReactanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE, oldStatorLeakageReactance,
                statorLeakageReactance, !oldStatorLeakageReactanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatorLeakageReactance() {
        Float oldStatorLeakageReactance = statorLeakageReactance;
        boolean oldStatorLeakageReactanceESet = statorLeakageReactanceESet;
        statorLeakageReactance = STATOR_LEAKAGE_REACTANCE_EDEFAULT;
        statorLeakageReactanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE, oldStatorLeakageReactance,
                STATOR_LEAKAGE_REACTANCE_EDEFAULT, oldStatorLeakageReactanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatorLeakageReactance() {
        return statorLeakageReactanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStatorResistance() {
        return statorResistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStatorResistance( Float newStatorResistance ) {
        Float oldStatorResistance = statorResistance;
        statorResistance = newStatorResistance;
        boolean oldStatorResistanceESet = statorResistanceESet;
        statorResistanceESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE,
                        oldStatorResistance, statorResistance, !oldStatorResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStatorResistance() {
        Float oldStatorResistance = statorResistance;
        boolean oldStatorResistanceESet = statorResistanceESet;
        statorResistance = STATOR_RESISTANCE_EDEFAULT;
        statorResistanceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE, oldStatorResistance,
                STATOR_RESISTANCE_EDEFAULT, oldStatorResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatorResistance() {
        return statorResistanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING:
            return getDamping();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA:
            return getInertia();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR:
            return getSaturationFactor();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120:
            return getSaturationFactor120();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE:
            return getStatorLeakageReactance();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE:
            return getStatorResistance();
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
        case CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING:
            setDamping( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA:
            setInertia( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR:
            setSaturationFactor( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120:
            setSaturationFactor120( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE:
            setStatorLeakageReactance( ( Float ) newValue );
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE:
            setStatorResistance( ( Float ) newValue );
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
        case CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING:
            unsetDamping();
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA:
            unsetInertia();
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR:
            unsetSaturationFactor();
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120:
            unsetSaturationFactor120();
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE:
            unsetStatorLeakageReactance();
            return;
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE:
            unsetStatorResistance();
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
        case CimPackage.ROTATING_MACHINE_DYNAMICS__DAMPING:
            return isSetDamping();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__INERTIA:
            return isSetInertia();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR:
            return isSetSaturationFactor();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__SATURATION_FACTOR120:
            return isSetSaturationFactor120();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_LEAKAGE_REACTANCE:
            return isSetStatorLeakageReactance();
        case CimPackage.ROTATING_MACHINE_DYNAMICS__STATOR_RESISTANCE:
            return isSetStatorResistance();
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
        result.append( " (damping: " );
        if( dampingESet )
            result.append( damping );
        else
            result.append( "<unset>" );
        result.append( ", inertia: " );
        if( inertiaESet )
            result.append( inertia );
        else
            result.append( "<unset>" );
        result.append( ", saturationFactor: " );
        if( saturationFactorESet )
            result.append( saturationFactor );
        else
            result.append( "<unset>" );
        result.append( ", saturationFactor120: " );
        if( saturationFactor120ESet )
            result.append( saturationFactor120 );
        else
            result.append( "<unset>" );
        result.append( ", statorLeakageReactance: " );
        if( statorLeakageReactanceESet )
            result.append( statorLeakageReactance );
        else
            result.append( "<unset>" );
        result.append( ", statorResistance: " );
        if( statorResistanceESet )
            result.append( statorResistance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RotatingMachineDynamicsImpl
