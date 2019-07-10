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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShuntCompensatorInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorInfoImpl#getMaxPowerLoss <em>Max Power Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorInfoImpl#getRatedReactivePower <em>Rated Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShuntCompensatorInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorInfoImpl extends AssetInfoImpl implements ShuntCompensatorInfo {
    /**
     * The default value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxPowerLoss()
     * @generated
     * @ordered
     */
    protected static final Float MAX_POWER_LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxPowerLoss() <em>Max Power Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxPowerLoss()
     * @generated
     * @ordered
     */
    protected Float maxPowerLoss = MAX_POWER_LOSS_EDEFAULT;

    /**
     * This is true if the Max Power Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxPowerLossESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRatedReactivePower() <em>Rated Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float RATED_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedReactivePower() <em>Rated Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedReactivePower()
     * @generated
     * @ordered
     */
    protected Float ratedReactivePower = RATED_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Rated Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedReactivePowerESet;

    /**
     * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedVoltageESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShuntCompensatorInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShuntCompensatorInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxPowerLoss() {
        return maxPowerLoss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxPowerLoss( Float newMaxPowerLoss ) {
        Float oldMaxPowerLoss = maxPowerLoss;
        maxPowerLoss = newMaxPowerLoss;
        boolean oldMaxPowerLossESet = maxPowerLossESet;
        maxPowerLossESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS,
                    oldMaxPowerLoss, maxPowerLoss, !oldMaxPowerLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxPowerLoss() {
        Float oldMaxPowerLoss = maxPowerLoss;
        boolean oldMaxPowerLossESet = maxPowerLossESet;
        maxPowerLoss = MAX_POWER_LOSS_EDEFAULT;
        maxPowerLossESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS,
                    oldMaxPowerLoss, MAX_POWER_LOSS_EDEFAULT, oldMaxPowerLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxPowerLoss() {
        return maxPowerLossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT,
                    oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT,
                    oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedReactivePower() {
        return ratedReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedReactivePower( Float newRatedReactivePower ) {
        Float oldRatedReactivePower = ratedReactivePower;
        ratedReactivePower = newRatedReactivePower;
        boolean oldRatedReactivePowerESet = ratedReactivePowerESet;
        ratedReactivePowerESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER,
                        oldRatedReactivePower, ratedReactivePower, !oldRatedReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedReactivePower() {
        Float oldRatedReactivePower = ratedReactivePower;
        boolean oldRatedReactivePowerESet = ratedReactivePowerESet;
        ratedReactivePower = RATED_REACTIVE_POWER_EDEFAULT;
        ratedReactivePowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER, oldRatedReactivePower,
                RATED_REACTIVE_POWER_EDEFAULT, oldRatedReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedReactivePower() {
        return ratedReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedVoltage( Float newRatedVoltage ) {
        Float oldRatedVoltage = ratedVoltage;
        ratedVoltage = newRatedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE,
                    oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedVoltage() {
        Float oldRatedVoltage = ratedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltage = RATED_VOLTAGE_EDEFAULT;
        ratedVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE,
                    oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedVoltage() {
        return ratedVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
            return getMaxPowerLoss();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER:
            return getRatedReactivePower();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE:
            return getRatedVoltage();
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
        case CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
            setMaxPowerLoss( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER:
            setRatedReactivePower( ( Float ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
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
        case CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
            unsetMaxPowerLoss();
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER:
            unsetRatedReactivePower();
            return;
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE:
            unsetRatedVoltage();
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
        case CimPackage.SHUNT_COMPENSATOR_INFO__MAX_POWER_LOSS:
            return isSetMaxPowerLoss();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_REACTIVE_POWER:
            return isSetRatedReactivePower();
        case CimPackage.SHUNT_COMPENSATOR_INFO__RATED_VOLTAGE:
            return isSetRatedVoltage();
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
        result.append( " (maxPowerLoss: " );
        if( maxPowerLossESet )
            result.append( maxPowerLoss );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedReactivePower: " );
        if( ratedReactivePowerESet )
            result.append( ratedReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", ratedVoltage: " );
        if( ratedVoltageESet )
            result.append( ratedVoltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShuntCompensatorInfoImpl
