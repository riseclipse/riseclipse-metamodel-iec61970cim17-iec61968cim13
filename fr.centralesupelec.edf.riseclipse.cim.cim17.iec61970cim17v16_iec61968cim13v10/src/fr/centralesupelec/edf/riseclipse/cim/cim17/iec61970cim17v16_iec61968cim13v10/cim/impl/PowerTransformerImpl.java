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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerTransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerTank;

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
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getHighSideMinOperatingU <em>High Side Min Operating U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getOperationalValuesConsidered <em>Operational Values Considered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getVectorGroup <em>Vector Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getPowerTransformerEnd <em>Power Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PowerTransformerImpl#getTransformerTanks <em>Transformer Tanks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerImpl extends ConductingEquipmentImpl implements PowerTransformer {
    /**
     * The default value of the '{@link #getBeforeShCircuitHighestOperatingCurrent() <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     * @ordered
     */
    protected static final Float BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBeforeShCircuitHighestOperatingCurrent() <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     * @ordered
     */
    protected Float beforeShCircuitHighestOperatingCurrent = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT;

    /**
     * This is true if the Before Sh Circuit Highest Operating Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShCircuitHighestOperatingCurrentESet;

    /**
     * The default value of the '{@link #getBeforeShCircuitHighestOperatingVoltage() <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     * @ordered
     */
    protected static final Float BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBeforeShCircuitHighestOperatingVoltage() <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     * @ordered
     */
    protected Float beforeShCircuitHighestOperatingVoltage = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Before Sh Circuit Highest Operating Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShCircuitHighestOperatingVoltageESet;

    /**
     * The default value of the '{@link #getBeforeShortCircuitAnglePf() <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     * @ordered
     */
    protected static final Float BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBeforeShortCircuitAnglePf() <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     * @ordered
     */
    protected Float beforeShortCircuitAnglePf = BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT;

    /**
     * This is true if the Before Short Circuit Angle Pf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShortCircuitAnglePfESet;

    /**
     * The default value of the '{@link #getHighSideMinOperatingU() <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighSideMinOperatingU()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_SIDE_MIN_OPERATING_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighSideMinOperatingU() <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighSideMinOperatingU()
     * @generated
     * @ordered
     */
    protected Float highSideMinOperatingU = HIGH_SIDE_MIN_OPERATING_U_EDEFAULT;

    /**
     * This is true if the High Side Min Operating U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highSideMinOperatingUESet;

    /**
     * The default value of the '{@link #getIsPartOfGeneratorUnit() <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PART_OF_GENERATOR_UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsPartOfGeneratorUnit() <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     * @ordered
     */
    protected Boolean isPartOfGeneratorUnit = IS_PART_OF_GENERATOR_UNIT_EDEFAULT;

    /**
     * This is true if the Is Part Of Generator Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPartOfGeneratorUnitESet;

    /**
     * The default value of the '{@link #getOperationalValuesConsidered() <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalValuesConsidered()
     * @generated
     * @ordered
     */
    protected static final Boolean OPERATIONAL_VALUES_CONSIDERED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOperationalValuesConsidered() <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalValuesConsidered()
     * @generated
     * @ordered
     */
    protected Boolean operationalValuesConsidered = OPERATIONAL_VALUES_CONSIDERED_EDEFAULT;

    /**
     * This is true if the Operational Values Considered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationalValuesConsideredESet;

    /**
     * The default value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVectorGroup()
     * @generated
     * @ordered
     */
    protected static final String VECTOR_GROUP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVectorGroup() <em>Vector Group</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVectorGroup()
     * @generated
     * @ordered
     */
    protected String vectorGroup = VECTOR_GROUP_EDEFAULT;

    /**
     * This is true if the Vector Group attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vectorGroupESet;

    /**
     * The cached value of the '{@link #getPowerTransformerEnd() <em>Power Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformerEnd()
     * @generated
     * @ordered
     */
    protected EList< PowerTransformerEnd > powerTransformerEnd;

    /**
     * The cached value of the '{@link #getTransformerTanks() <em>Transformer Tanks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerTanks()
     * @generated
     * @ordered
     */
    protected EList< TransformerTank > transformerTanks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerTransformer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBeforeShCircuitHighestOperatingCurrent() {
        return beforeShCircuitHighestOperatingCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShCircuitHighestOperatingCurrent( Float newBeforeShCircuitHighestOperatingCurrent ) {
        Float oldBeforeShCircuitHighestOperatingCurrent = beforeShCircuitHighestOperatingCurrent;
        beforeShCircuitHighestOperatingCurrent = newBeforeShCircuitHighestOperatingCurrent;
        boolean oldBeforeShCircuitHighestOperatingCurrentESet = beforeShCircuitHighestOperatingCurrentESet;
        beforeShCircuitHighestOperatingCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT,
                oldBeforeShCircuitHighestOperatingCurrent, beforeShCircuitHighestOperatingCurrent,
                !oldBeforeShCircuitHighestOperatingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShCircuitHighestOperatingCurrent() {
        Float oldBeforeShCircuitHighestOperatingCurrent = beforeShCircuitHighestOperatingCurrent;
        boolean oldBeforeShCircuitHighestOperatingCurrentESet = beforeShCircuitHighestOperatingCurrentESet;
        beforeShCircuitHighestOperatingCurrent = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT;
        beforeShCircuitHighestOperatingCurrentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT,
                oldBeforeShCircuitHighestOperatingCurrent, BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT,
                oldBeforeShCircuitHighestOperatingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShCircuitHighestOperatingCurrent() {
        return beforeShCircuitHighestOperatingCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBeforeShCircuitHighestOperatingVoltage() {
        return beforeShCircuitHighestOperatingVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShCircuitHighestOperatingVoltage( Float newBeforeShCircuitHighestOperatingVoltage ) {
        Float oldBeforeShCircuitHighestOperatingVoltage = beforeShCircuitHighestOperatingVoltage;
        beforeShCircuitHighestOperatingVoltage = newBeforeShCircuitHighestOperatingVoltage;
        boolean oldBeforeShCircuitHighestOperatingVoltageESet = beforeShCircuitHighestOperatingVoltageESet;
        beforeShCircuitHighestOperatingVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE,
                oldBeforeShCircuitHighestOperatingVoltage, beforeShCircuitHighestOperatingVoltage,
                !oldBeforeShCircuitHighestOperatingVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShCircuitHighestOperatingVoltage() {
        Float oldBeforeShCircuitHighestOperatingVoltage = beforeShCircuitHighestOperatingVoltage;
        boolean oldBeforeShCircuitHighestOperatingVoltageESet = beforeShCircuitHighestOperatingVoltageESet;
        beforeShCircuitHighestOperatingVoltage = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT;
        beforeShCircuitHighestOperatingVoltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE,
                oldBeforeShCircuitHighestOperatingVoltage, BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT,
                oldBeforeShCircuitHighestOperatingVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShCircuitHighestOperatingVoltage() {
        return beforeShCircuitHighestOperatingVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBeforeShortCircuitAnglePf() {
        return beforeShortCircuitAnglePf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShortCircuitAnglePf( Float newBeforeShortCircuitAnglePf ) {
        Float oldBeforeShortCircuitAnglePf = beforeShortCircuitAnglePf;
        beforeShortCircuitAnglePf = newBeforeShortCircuitAnglePf;
        boolean oldBeforeShortCircuitAnglePfESet = beforeShortCircuitAnglePfESet;
        beforeShortCircuitAnglePfESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF, oldBeforeShortCircuitAnglePf,
                beforeShortCircuitAnglePf, !oldBeforeShortCircuitAnglePfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShortCircuitAnglePf() {
        Float oldBeforeShortCircuitAnglePf = beforeShortCircuitAnglePf;
        boolean oldBeforeShortCircuitAnglePfESet = beforeShortCircuitAnglePfESet;
        beforeShortCircuitAnglePf = BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT;
        beforeShortCircuitAnglePfESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF, oldBeforeShortCircuitAnglePf,
                BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT, oldBeforeShortCircuitAnglePfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShortCircuitAnglePf() {
        return beforeShortCircuitAnglePfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighSideMinOperatingU() {
        return highSideMinOperatingU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighSideMinOperatingU( Float newHighSideMinOperatingU ) {
        Float oldHighSideMinOperatingU = highSideMinOperatingU;
        highSideMinOperatingU = newHighSideMinOperatingU;
        boolean oldHighSideMinOperatingUESet = highSideMinOperatingUESet;
        highSideMinOperatingUESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U,
                        oldHighSideMinOperatingU, highSideMinOperatingU, !oldHighSideMinOperatingUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighSideMinOperatingU() {
        Float oldHighSideMinOperatingU = highSideMinOperatingU;
        boolean oldHighSideMinOperatingUESet = highSideMinOperatingUESet;
        highSideMinOperatingU = HIGH_SIDE_MIN_OPERATING_U_EDEFAULT;
        highSideMinOperatingUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U, oldHighSideMinOperatingU,
                HIGH_SIDE_MIN_OPERATING_U_EDEFAULT, oldHighSideMinOperatingUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighSideMinOperatingU() {
        return highSideMinOperatingUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPartOfGeneratorUnit() {
        return isPartOfGeneratorUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPartOfGeneratorUnit( Boolean newIsPartOfGeneratorUnit ) {
        Boolean oldIsPartOfGeneratorUnit = isPartOfGeneratorUnit;
        isPartOfGeneratorUnit = newIsPartOfGeneratorUnit;
        boolean oldIsPartOfGeneratorUnitESet = isPartOfGeneratorUnitESet;
        isPartOfGeneratorUnitESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT,
                        oldIsPartOfGeneratorUnit, isPartOfGeneratorUnit, !oldIsPartOfGeneratorUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPartOfGeneratorUnit() {
        Boolean oldIsPartOfGeneratorUnit = isPartOfGeneratorUnit;
        boolean oldIsPartOfGeneratorUnitESet = isPartOfGeneratorUnitESet;
        isPartOfGeneratorUnit = IS_PART_OF_GENERATOR_UNIT_EDEFAULT;
        isPartOfGeneratorUnitESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT, oldIsPartOfGeneratorUnit,
                IS_PART_OF_GENERATOR_UNIT_EDEFAULT, oldIsPartOfGeneratorUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPartOfGeneratorUnit() {
        return isPartOfGeneratorUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOperationalValuesConsidered() {
        return operationalValuesConsidered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationalValuesConsidered( Boolean newOperationalValuesConsidered ) {
        Boolean oldOperationalValuesConsidered = operationalValuesConsidered;
        operationalValuesConsidered = newOperationalValuesConsidered;
        boolean oldOperationalValuesConsideredESet = operationalValuesConsideredESet;
        operationalValuesConsideredESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED, oldOperationalValuesConsidered,
                operationalValuesConsidered, !oldOperationalValuesConsideredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalValuesConsidered() {
        Boolean oldOperationalValuesConsidered = operationalValuesConsidered;
        boolean oldOperationalValuesConsideredESet = operationalValuesConsideredESet;
        operationalValuesConsidered = OPERATIONAL_VALUES_CONSIDERED_EDEFAULT;
        operationalValuesConsideredESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED, oldOperationalValuesConsidered,
                OPERATIONAL_VALUES_CONSIDERED_EDEFAULT, oldOperationalValuesConsideredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalValuesConsidered() {
        return operationalValuesConsideredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getVectorGroup() {
        return vectorGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVectorGroup( String newVectorGroup ) {
        String oldVectorGroup = vectorGroup;
        vectorGroup = newVectorGroup;
        boolean oldVectorGroupESet = vectorGroupESet;
        vectorGroupESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.POWER_TRANSFORMER__VECTOR_GROUP, oldVectorGroup, vectorGroup, !oldVectorGroupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVectorGroup() {
        String oldVectorGroup = vectorGroup;
        boolean oldVectorGroupESet = vectorGroupESet;
        vectorGroup = VECTOR_GROUP_EDEFAULT;
        vectorGroupESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER__VECTOR_GROUP,
                    oldVectorGroup, VECTOR_GROUP_EDEFAULT, oldVectorGroupESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVectorGroup() {
        return vectorGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerTransformerEnd > getPowerTransformerEnd() {
        if( powerTransformerEnd == null ) {
            powerTransformerEnd = new EObjectWithInverseResolvingEList.Unsettable< PowerTransformerEnd >(
                    PowerTransformerEnd.class, this, CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER );
        }
        return powerTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerTransformerEnd() {
        if( powerTransformerEnd != null ) ( ( InternalEList.Unsettable< ? > ) powerTransformerEnd ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformerEnd() {
        return powerTransformerEnd != null && ( ( InternalEList.Unsettable< ? > ) powerTransformerEnd ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerTank > getTransformerTanks() {
        if( transformerTanks == null ) {
            transformerTanks = new EObjectWithInverseResolvingEList.Unsettable< TransformerTank >(
                    TransformerTank.class, this, CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS,
                    CimPackage.TRANSFORMER_TANK__POWER_TRANSFORMER );
        }
        return transformerTanks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransformerTanks() {
        if( transformerTanks != null ) ( ( InternalEList.Unsettable< ? > ) transformerTanks ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerTanks() {
        return transformerTanks != null && ( ( InternalEList.Unsettable< ? > ) transformerTanks ).isSet();
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerTransformerEnd() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTransformerTanks() )
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getPowerTransformerEnd() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            return ( ( InternalEList< ? > ) getTransformerTanks() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            return getBeforeShCircuitHighestOperatingCurrent();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            return getBeforeShCircuitHighestOperatingVoltage();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            return getBeforeShortCircuitAnglePf();
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            return getHighSideMinOperatingU();
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            return getIsPartOfGeneratorUnit();
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            return getOperationalValuesConsidered();
        case CimPackage.POWER_TRANSFORMER__VECTOR_GROUP:
            return getVectorGroup();
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return getPowerTransformerEnd();
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            return getTransformerTanks();
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
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            setBeforeShCircuitHighestOperatingCurrent( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            setBeforeShCircuitHighestOperatingVoltage( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            setBeforeShortCircuitAnglePf( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            setHighSideMinOperatingU( ( Float ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            setIsPartOfGeneratorUnit( ( Boolean ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            setOperationalValuesConsidered( ( Boolean ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__VECTOR_GROUP:
            setVectorGroup( ( String ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            getPowerTransformerEnd().clear();
            getPowerTransformerEnd().addAll( ( Collection< ? extends PowerTransformerEnd > ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            getTransformerTanks().clear();
            getTransformerTanks().addAll( ( Collection< ? extends TransformerTank > ) newValue );
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
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            unsetBeforeShCircuitHighestOperatingCurrent();
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            unsetBeforeShCircuitHighestOperatingVoltage();
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            unsetBeforeShortCircuitAnglePf();
            return;
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            unsetHighSideMinOperatingU();
            return;
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            unsetIsPartOfGeneratorUnit();
            return;
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            unsetOperationalValuesConsidered();
            return;
        case CimPackage.POWER_TRANSFORMER__VECTOR_GROUP:
            unsetVectorGroup();
            return;
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            unsetPowerTransformerEnd();
            return;
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            unsetTransformerTanks();
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
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            return isSetBeforeShCircuitHighestOperatingCurrent();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            return isSetBeforeShCircuitHighestOperatingVoltage();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            return isSetBeforeShortCircuitAnglePf();
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            return isSetHighSideMinOperatingU();
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            return isSetIsPartOfGeneratorUnit();
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            return isSetOperationalValuesConsidered();
        case CimPackage.POWER_TRANSFORMER__VECTOR_GROUP:
            return isSetVectorGroup();
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return isSetPowerTransformerEnd();
        case CimPackage.POWER_TRANSFORMER__TRANSFORMER_TANKS:
            return isSetTransformerTanks();
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
        result.append( " (beforeShCircuitHighestOperatingCurrent: " );
        if( beforeShCircuitHighestOperatingCurrentESet )
            result.append( beforeShCircuitHighestOperatingCurrent );
        else
            result.append( "<unset>" );
        result.append( ", beforeShCircuitHighestOperatingVoltage: " );
        if( beforeShCircuitHighestOperatingVoltageESet )
            result.append( beforeShCircuitHighestOperatingVoltage );
        else
            result.append( "<unset>" );
        result.append( ", beforeShortCircuitAnglePf: " );
        if( beforeShortCircuitAnglePfESet )
            result.append( beforeShortCircuitAnglePf );
        else
            result.append( "<unset>" );
        result.append( ", highSideMinOperatingU: " );
        if( highSideMinOperatingUESet )
            result.append( highSideMinOperatingU );
        else
            result.append( "<unset>" );
        result.append( ", isPartOfGeneratorUnit: " );
        if( isPartOfGeneratorUnitESet )
            result.append( isPartOfGeneratorUnit );
        else
            result.append( "<unset>" );
        result.append( ", operationalValuesConsidered: " );
        if( operationalValuesConsideredESet )
            result.append( operationalValuesConsidered );
        else
            result.append( "<unset>" );
        result.append( ", vectorGroup: " );
        if( vectorGroupESet )
            result.append( vectorGroup );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerTransformerImpl
