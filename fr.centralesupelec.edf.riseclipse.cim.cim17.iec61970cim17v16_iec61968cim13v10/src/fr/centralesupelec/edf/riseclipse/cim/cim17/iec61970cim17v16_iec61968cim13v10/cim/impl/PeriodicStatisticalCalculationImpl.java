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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationIntervalUnitKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PeriodicStatisticalCalculation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodic Statistical Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PeriodicStatisticalCalculationImpl#getCalculationIntervalMagnitude <em>Calculation Interval Magnitude</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PeriodicStatisticalCalculationImpl#getCalculationIntervalUnit <em>Calculation Interval Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodicStatisticalCalculationImpl extends StatisticalCalculationImpl
        implements PeriodicStatisticalCalculation {
    /**
     * The default value of the '{@link #getCalculationIntervalMagnitude() <em>Calculation Interval Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationIntervalMagnitude()
     * @generated
     * @ordered
     */
    protected static final Integer CALCULATION_INTERVAL_MAGNITUDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCalculationIntervalMagnitude() <em>Calculation Interval Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationIntervalMagnitude()
     * @generated
     * @ordered
     */
    protected Integer calculationIntervalMagnitude = CALCULATION_INTERVAL_MAGNITUDE_EDEFAULT;

    /**
     * This is true if the Calculation Interval Magnitude attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationIntervalMagnitudeESet;

    /**
     * The default value of the '{@link #getCalculationIntervalUnit() <em>Calculation Interval Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationIntervalUnit()
     * @generated
     * @ordered
     */
    protected static final CalculationIntervalUnitKind CALCULATION_INTERVAL_UNIT_EDEFAULT = CalculationIntervalUnitKind.MILLI_SECOND;

    /**
     * The cached value of the '{@link #getCalculationIntervalUnit() <em>Calculation Interval Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationIntervalUnit()
     * @generated
     * @ordered
     */
    protected CalculationIntervalUnitKind calculationIntervalUnit = CALCULATION_INTERVAL_UNIT_EDEFAULT;

    /**
     * This is true if the Calculation Interval Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationIntervalUnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PeriodicStatisticalCalculationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPeriodicStatisticalCalculation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCalculationIntervalMagnitude() {
        return calculationIntervalMagnitude;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalculationIntervalMagnitude( Integer newCalculationIntervalMagnitude ) {
        Integer oldCalculationIntervalMagnitude = calculationIntervalMagnitude;
        calculationIntervalMagnitude = newCalculationIntervalMagnitude;
        boolean oldCalculationIntervalMagnitudeESet = calculationIntervalMagnitudeESet;
        calculationIntervalMagnitudeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE,
                oldCalculationIntervalMagnitude, calculationIntervalMagnitude, !oldCalculationIntervalMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationIntervalMagnitude() {
        Integer oldCalculationIntervalMagnitude = calculationIntervalMagnitude;
        boolean oldCalculationIntervalMagnitudeESet = calculationIntervalMagnitudeESet;
        calculationIntervalMagnitude = CALCULATION_INTERVAL_MAGNITUDE_EDEFAULT;
        calculationIntervalMagnitudeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE,
                oldCalculationIntervalMagnitude, CALCULATION_INTERVAL_MAGNITUDE_EDEFAULT,
                oldCalculationIntervalMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationIntervalMagnitude() {
        return calculationIntervalMagnitudeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationIntervalUnitKind getCalculationIntervalUnit() {
        return calculationIntervalUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCalculationIntervalUnit( CalculationIntervalUnitKind newCalculationIntervalUnit ) {
        CalculationIntervalUnitKind oldCalculationIntervalUnit = calculationIntervalUnit;
        calculationIntervalUnit = newCalculationIntervalUnit == null ? CALCULATION_INTERVAL_UNIT_EDEFAULT
                : newCalculationIntervalUnit;
        boolean oldCalculationIntervalUnitESet = calculationIntervalUnitESet;
        calculationIntervalUnitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT, oldCalculationIntervalUnit,
                calculationIntervalUnit, !oldCalculationIntervalUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCalculationIntervalUnit() {
        CalculationIntervalUnitKind oldCalculationIntervalUnit = calculationIntervalUnit;
        boolean oldCalculationIntervalUnitESet = calculationIntervalUnitESet;
        calculationIntervalUnit = CALCULATION_INTERVAL_UNIT_EDEFAULT;
        calculationIntervalUnitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT, oldCalculationIntervalUnit,
                CALCULATION_INTERVAL_UNIT_EDEFAULT, oldCalculationIntervalUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationIntervalUnit() {
        return calculationIntervalUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE:
            return getCalculationIntervalMagnitude();
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT:
            return getCalculationIntervalUnit();
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
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE:
            setCalculationIntervalMagnitude( ( Integer ) newValue );
            return;
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT:
            setCalculationIntervalUnit( ( CalculationIntervalUnitKind ) newValue );
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
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE:
            unsetCalculationIntervalMagnitude();
            return;
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT:
            unsetCalculationIntervalUnit();
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
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_MAGNITUDE:
            return isSetCalculationIntervalMagnitude();
        case CimPackage.PERIODIC_STATISTICAL_CALCULATION__CALCULATION_INTERVAL_UNIT:
            return isSetCalculationIntervalUnit();
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
        result.append( " (calculationIntervalMagnitude: " );
        if( calculationIntervalMagnitudeESet )
            result.append( calculationIntervalMagnitude );
        else
            result.append( "<unset>" );
        result.append( ", calculationIntervalUnit: " );
        if( calculationIntervalUnitESet )
            result.append( calculationIntervalUnit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PeriodicStatisticalCalculationImpl
