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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BushingInsulationKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bushing Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getC1Capacitance <em>C1 Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getC1PowerFactor <em>C1 Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getC2Capacitance <em>C2 Capacitance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getC2PowerFactor <em>C2 Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getInsulationKind <em>Insulation Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getRatedImpulseWithstandVoltage <em>Rated Impulse Withstand Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getRatedLineToGroundVoltage <em>Rated Line To Ground Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.BushingInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BushingInfoImpl extends AssetInfoImpl implements BushingInfo {
    /**
     * The default value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC1Capacitance()
     * @generated
     * @ordered
     */
    protected static final Float C1_CAPACITANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC1Capacitance() <em>C1 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC1Capacitance()
     * @generated
     * @ordered
     */
    protected Float c1Capacitance = C1_CAPACITANCE_EDEFAULT;

    /**
     * This is true if the C1 Capacitance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c1CapacitanceESet;

    /**
     * The default value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC1PowerFactor()
     * @generated
     * @ordered
     */
    protected static final Float C1_POWER_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC1PowerFactor() <em>C1 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC1PowerFactor()
     * @generated
     * @ordered
     */
    protected Float c1PowerFactor = C1_POWER_FACTOR_EDEFAULT;

    /**
     * This is true if the C1 Power Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c1PowerFactorESet;

    /**
     * The default value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC2Capacitance()
     * @generated
     * @ordered
     */
    protected static final Float C2_CAPACITANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC2Capacitance() <em>C2 Capacitance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC2Capacitance()
     * @generated
     * @ordered
     */
    protected Float c2Capacitance = C2_CAPACITANCE_EDEFAULT;

    /**
     * This is true if the C2 Capacitance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c2CapacitanceESet;

    /**
     * The default value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC2PowerFactor()
     * @generated
     * @ordered
     */
    protected static final Float C2_POWER_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getC2PowerFactor() <em>C2 Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getC2PowerFactor()
     * @generated
     * @ordered
     */
    protected Float c2PowerFactor = C2_POWER_FACTOR_EDEFAULT;

    /**
     * This is true if the C2 Power Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean c2PowerFactorESet;

    /**
     * The default value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationKind()
     * @generated
     * @ordered
     */
    protected static final BushingInsulationKind INSULATION_KIND_EDEFAULT = BushingInsulationKind.OIL_IMPREGNATED_PAPER;

    /**
     * The cached value of the '{@link #getInsulationKind() <em>Insulation Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationKind()
     * @generated
     * @ordered
     */
    protected BushingInsulationKind insulationKind = INSULATION_KIND_EDEFAULT;

    /**
     * This is true if the Insulation Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean insulationKindESet;

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
     * The default value of the '{@link #getRatedImpulseWithstandVoltage() <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedImpulseWithstandVoltage() <em>Rated Impulse Withstand Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedImpulseWithstandVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedImpulseWithstandVoltage = RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Impulse Withstand Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedImpulseWithstandVoltageESet;

    /**
     * The default value of the '{@link #getRatedLineToGroundVoltage() <em>Rated Line To Ground Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedLineToGroundVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_LINE_TO_GROUND_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedLineToGroundVoltage() <em>Rated Line To Ground Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedLineToGroundVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedLineToGroundVoltage = RATED_LINE_TO_GROUND_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Line To Ground Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedLineToGroundVoltageESet;

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
    protected BushingInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBushingInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getC1Capacitance() {
        return c1Capacitance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC1Capacitance( Float newC1Capacitance ) {
        Float oldC1Capacitance = c1Capacitance;
        c1Capacitance = newC1Capacitance;
        boolean oldC1CapacitanceESet = c1CapacitanceESet;
        c1CapacitanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__C1_CAPACITANCE, oldC1Capacitance, c1Capacitance, !oldC1CapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC1Capacitance() {
        Float oldC1Capacitance = c1Capacitance;
        boolean oldC1CapacitanceESet = c1CapacitanceESet;
        c1Capacitance = C1_CAPACITANCE_EDEFAULT;
        c1CapacitanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__C1_CAPACITANCE,
                    oldC1Capacitance, C1_CAPACITANCE_EDEFAULT, oldC1CapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC1Capacitance() {
        return c1CapacitanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getC1PowerFactor() {
        return c1PowerFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC1PowerFactor( Float newC1PowerFactor ) {
        Float oldC1PowerFactor = c1PowerFactor;
        c1PowerFactor = newC1PowerFactor;
        boolean oldC1PowerFactorESet = c1PowerFactorESet;
        c1PowerFactorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__C1_POWER_FACTOR, oldC1PowerFactor, c1PowerFactor, !oldC1PowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC1PowerFactor() {
        Float oldC1PowerFactor = c1PowerFactor;
        boolean oldC1PowerFactorESet = c1PowerFactorESet;
        c1PowerFactor = C1_POWER_FACTOR_EDEFAULT;
        c1PowerFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__C1_POWER_FACTOR,
                    oldC1PowerFactor, C1_POWER_FACTOR_EDEFAULT, oldC1PowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC1PowerFactor() {
        return c1PowerFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getC2Capacitance() {
        return c2Capacitance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC2Capacitance( Float newC2Capacitance ) {
        Float oldC2Capacitance = c2Capacitance;
        c2Capacitance = newC2Capacitance;
        boolean oldC2CapacitanceESet = c2CapacitanceESet;
        c2CapacitanceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__C2_CAPACITANCE, oldC2Capacitance, c2Capacitance, !oldC2CapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC2Capacitance() {
        Float oldC2Capacitance = c2Capacitance;
        boolean oldC2CapacitanceESet = c2CapacitanceESet;
        c2Capacitance = C2_CAPACITANCE_EDEFAULT;
        c2CapacitanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__C2_CAPACITANCE,
                    oldC2Capacitance, C2_CAPACITANCE_EDEFAULT, oldC2CapacitanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC2Capacitance() {
        return c2CapacitanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getC2PowerFactor() {
        return c2PowerFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setC2PowerFactor( Float newC2PowerFactor ) {
        Float oldC2PowerFactor = c2PowerFactor;
        c2PowerFactor = newC2PowerFactor;
        boolean oldC2PowerFactorESet = c2PowerFactorESet;
        c2PowerFactorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__C2_POWER_FACTOR, oldC2PowerFactor, c2PowerFactor, !oldC2PowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetC2PowerFactor() {
        Float oldC2PowerFactor = c2PowerFactor;
        boolean oldC2PowerFactorESet = c2PowerFactorESet;
        c2PowerFactor = C2_POWER_FACTOR_EDEFAULT;
        c2PowerFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__C2_POWER_FACTOR,
                    oldC2PowerFactor, C2_POWER_FACTOR_EDEFAULT, oldC2PowerFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetC2PowerFactor() {
        return c2PowerFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BushingInsulationKind getInsulationKind() {
        return insulationKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInsulationKind( BushingInsulationKind newInsulationKind ) {
        BushingInsulationKind oldInsulationKind = insulationKind;
        insulationKind = newInsulationKind == null ? INSULATION_KIND_EDEFAULT : newInsulationKind;
        boolean oldInsulationKindESet = insulationKindESet;
        insulationKindESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__INSULATION_KIND, oldInsulationKind, insulationKind, !oldInsulationKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInsulationKind() {
        BushingInsulationKind oldInsulationKind = insulationKind;
        boolean oldInsulationKindESet = insulationKindESet;
        insulationKind = INSULATION_KIND_EDEFAULT;
        insulationKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__INSULATION_KIND,
                    oldInsulationKind, INSULATION_KIND_EDEFAULT, oldInsulationKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInsulationKind() {
        return insulationKindESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__RATED_CURRENT,
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
    public Float getRatedImpulseWithstandVoltage() {
        return ratedImpulseWithstandVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedImpulseWithstandVoltage( Float newRatedImpulseWithstandVoltage ) {
        Float oldRatedImpulseWithstandVoltage = ratedImpulseWithstandVoltage;
        ratedImpulseWithstandVoltage = newRatedImpulseWithstandVoltage;
        boolean oldRatedImpulseWithstandVoltageESet = ratedImpulseWithstandVoltageESet;
        ratedImpulseWithstandVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE, oldRatedImpulseWithstandVoltage,
                ratedImpulseWithstandVoltage, !oldRatedImpulseWithstandVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedImpulseWithstandVoltage() {
        Float oldRatedImpulseWithstandVoltage = ratedImpulseWithstandVoltage;
        boolean oldRatedImpulseWithstandVoltageESet = ratedImpulseWithstandVoltageESet;
        ratedImpulseWithstandVoltage = RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT;
        ratedImpulseWithstandVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE, oldRatedImpulseWithstandVoltage,
                RATED_IMPULSE_WITHSTAND_VOLTAGE_EDEFAULT, oldRatedImpulseWithstandVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedImpulseWithstandVoltage() {
        return ratedImpulseWithstandVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedLineToGroundVoltage() {
        return ratedLineToGroundVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedLineToGroundVoltage( Float newRatedLineToGroundVoltage ) {
        Float oldRatedLineToGroundVoltage = ratedLineToGroundVoltage;
        ratedLineToGroundVoltage = newRatedLineToGroundVoltage;
        boolean oldRatedLineToGroundVoltageESet = ratedLineToGroundVoltageESet;
        ratedLineToGroundVoltageESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE,
                        oldRatedLineToGroundVoltage, ratedLineToGroundVoltage, !oldRatedLineToGroundVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedLineToGroundVoltage() {
        Float oldRatedLineToGroundVoltage = ratedLineToGroundVoltage;
        boolean oldRatedLineToGroundVoltageESet = ratedLineToGroundVoltageESet;
        ratedLineToGroundVoltage = RATED_LINE_TO_GROUND_VOLTAGE_EDEFAULT;
        ratedLineToGroundVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE, oldRatedLineToGroundVoltage,
                RATED_LINE_TO_GROUND_VOLTAGE_EDEFAULT, oldRatedLineToGroundVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedLineToGroundVoltage() {
        return ratedLineToGroundVoltageESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.BUSHING_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUSHING_INFO__RATED_VOLTAGE,
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
        case CimPackage.BUSHING_INFO__C1_CAPACITANCE:
            return getC1Capacitance();
        case CimPackage.BUSHING_INFO__C1_POWER_FACTOR:
            return getC1PowerFactor();
        case CimPackage.BUSHING_INFO__C2_CAPACITANCE:
            return getC2Capacitance();
        case CimPackage.BUSHING_INFO__C2_POWER_FACTOR:
            return getC2PowerFactor();
        case CimPackage.BUSHING_INFO__INSULATION_KIND:
            return getInsulationKind();
        case CimPackage.BUSHING_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            return getRatedImpulseWithstandVoltage();
        case CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE:
            return getRatedLineToGroundVoltage();
        case CimPackage.BUSHING_INFO__RATED_VOLTAGE:
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
        case CimPackage.BUSHING_INFO__C1_CAPACITANCE:
            setC1Capacitance( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__C1_POWER_FACTOR:
            setC1PowerFactor( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__C2_CAPACITANCE:
            setC2Capacitance( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__C2_POWER_FACTOR:
            setC2PowerFactor( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__INSULATION_KIND:
            setInsulationKind( ( BushingInsulationKind ) newValue );
            return;
        case CimPackage.BUSHING_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            setRatedImpulseWithstandVoltage( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE:
            setRatedLineToGroundVoltage( ( Float ) newValue );
            return;
        case CimPackage.BUSHING_INFO__RATED_VOLTAGE:
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
        case CimPackage.BUSHING_INFO__C1_CAPACITANCE:
            unsetC1Capacitance();
            return;
        case CimPackage.BUSHING_INFO__C1_POWER_FACTOR:
            unsetC1PowerFactor();
            return;
        case CimPackage.BUSHING_INFO__C2_CAPACITANCE:
            unsetC2Capacitance();
            return;
        case CimPackage.BUSHING_INFO__C2_POWER_FACTOR:
            unsetC2PowerFactor();
            return;
        case CimPackage.BUSHING_INFO__INSULATION_KIND:
            unsetInsulationKind();
            return;
        case CimPackage.BUSHING_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            unsetRatedImpulseWithstandVoltage();
            return;
        case CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE:
            unsetRatedLineToGroundVoltage();
            return;
        case CimPackage.BUSHING_INFO__RATED_VOLTAGE:
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
        case CimPackage.BUSHING_INFO__C1_CAPACITANCE:
            return isSetC1Capacitance();
        case CimPackage.BUSHING_INFO__C1_POWER_FACTOR:
            return isSetC1PowerFactor();
        case CimPackage.BUSHING_INFO__C2_CAPACITANCE:
            return isSetC2Capacitance();
        case CimPackage.BUSHING_INFO__C2_POWER_FACTOR:
            return isSetC2PowerFactor();
        case CimPackage.BUSHING_INFO__INSULATION_KIND:
            return isSetInsulationKind();
        case CimPackage.BUSHING_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.BUSHING_INFO__RATED_IMPULSE_WITHSTAND_VOLTAGE:
            return isSetRatedImpulseWithstandVoltage();
        case CimPackage.BUSHING_INFO__RATED_LINE_TO_GROUND_VOLTAGE:
            return isSetRatedLineToGroundVoltage();
        case CimPackage.BUSHING_INFO__RATED_VOLTAGE:
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
        result.append( " (c1Capacitance: " );
        if( c1CapacitanceESet )
            result.append( c1Capacitance );
        else
            result.append( "<unset>" );
        result.append( ", c1PowerFactor: " );
        if( c1PowerFactorESet )
            result.append( c1PowerFactor );
        else
            result.append( "<unset>" );
        result.append( ", c2Capacitance: " );
        if( c2CapacitanceESet )
            result.append( c2Capacitance );
        else
            result.append( "<unset>" );
        result.append( ", c2PowerFactor: " );
        if( c2PowerFactorESet )
            result.append( c2PowerFactor );
        else
            result.append( "<unset>" );
        result.append( ", insulationKind: " );
        if( insulationKindESet )
            result.append( insulationKind );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedImpulseWithstandVoltage: " );
        if( ratedImpulseWithstandVoltageESet )
            result.append( ratedImpulseWithstandVoltage );
        else
            result.append( "<unset>" );
        result.append( ", ratedLineToGroundVoltage: " );
        if( ratedLineToGroundVoltageESet )
            result.append( ratedLineToGroundVoltage );
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

} //BushingInfoImpl
