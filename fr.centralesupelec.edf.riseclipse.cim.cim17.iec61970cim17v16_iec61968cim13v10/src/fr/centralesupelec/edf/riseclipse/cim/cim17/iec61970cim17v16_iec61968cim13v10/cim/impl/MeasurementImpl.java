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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CalculationMethodHierarchy;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Procedure;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getMeasurementType <em>Measurement Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getPhases <em>Phases</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getUncefactUnitCode <em>Uncefact Unit Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getProcedures <em>Procedures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.MeasurementImpl#getCalculationMethodHierarchy <em>Calculation Method Hierarchy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends IdentifiedObjectImpl implements Measurement {
    /**
     * The default value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected static final String MEASUREMENT_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeasurementType() <em>Measurement Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementType()
     * @generated
     * @ordered
     */
    protected String measurementType = MEASUREMENT_TYPE_EDEFAULT;

    /**
     * This is true if the Measurement Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean measurementTypeESet;

    /**
     * The default value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected static final PhaseCode PHASES_EDEFAULT = PhaseCode.ABCN;

    /**
     * The cached value of the '{@link #getPhases() <em>Phases</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhases()
     * @generated
     * @ordered
     */
    protected PhaseCode phases = PHASES_EDEFAULT;

    /**
     * This is true if the Phases attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phasesESet;

    /**
     * The default value of the '{@link #getUncefactUnitCode() <em>Uncefact Unit Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUncefactUnitCode()
     * @generated
     * @ordered
     */
    protected static final String UNCEFACT_UNIT_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUncefactUnitCode() <em>Uncefact Unit Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUncefactUnitCode()
     * @generated
     * @ordered
     */
    protected String uncefactUnitCode = UNCEFACT_UNIT_CODE_EDEFAULT;

    /**
     * This is true if the Uncefact Unit Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uncefactUnitCodeESet;

    /**
     * The default value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected static final UnitMultiplier UNIT_MULTIPLIER_EDEFAULT = UnitMultiplier.YOCTO;

    /**
     * The cached value of the '{@link #getUnitMultiplier() <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitMultiplier()
     * @generated
     * @ordered
     */
    protected UnitMultiplier unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;

    /**
     * This is true if the Unit Multiplier attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitMultiplierESet;

    /**
     * The default value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol UNIT_SYMBOL_EDEFAULT = UnitSymbol.NONE;

    /**
     * The cached value of the '{@link #getUnitSymbol() <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnitSymbol()
     * @generated
     * @ordered
     */
    protected UnitSymbol unitSymbol = UNIT_SYMBOL_EDEFAULT;

    /**
     * This is true if the Unit Symbol attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean unitSymbolESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected ACDCTerminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The cached value of the '{@link #getProcedures() <em>Procedures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedures()
     * @generated
     * @ordered
     */
    protected EList< Procedure > procedures;

    /**
     * The cached value of the '{@link #getPowerSystemResource() <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResource()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResource;

    /**
     * This is true if the Power System Resource reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourceESet;

    /**
     * The cached value of the '{@link #getAsset() <em>Asset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsset()
     * @generated
     * @ordered
     */
    protected Asset asset;

    /**
     * This is true if the Asset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean assetESet;

    /**
     * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocations()
     * @generated
     * @ordered
     */
    protected EList< Location > locations;

    /**
     * The cached value of the '{@link #getCalculationMethodHierarchy() <em>Calculation Method Hierarchy</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCalculationMethodHierarchy()
     * @generated
     * @ordered
     */
    protected CalculationMethodHierarchy calculationMethodHierarchy;

    /**
     * This is true if the Calculation Method Hierarchy reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean calculationMethodHierarchyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getMeasurement();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMeasurementType() {
        return measurementType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeasurementType( String newMeasurementType ) {
        String oldMeasurementType = measurementType;
        measurementType = newMeasurementType;
        boolean oldMeasurementTypeESet = measurementTypeESet;
        measurementTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__MEASUREMENT_TYPE,
                    oldMeasurementType, measurementType, !oldMeasurementTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurementType() {
        String oldMeasurementType = measurementType;
        boolean oldMeasurementTypeESet = measurementTypeESet;
        measurementType = MEASUREMENT_TYPE_EDEFAULT;
        measurementTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__MEASUREMENT_TYPE,
                    oldMeasurementType, MEASUREMENT_TYPE_EDEFAULT, oldMeasurementTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurementType() {
        return measurementTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseCode getPhases() {
        return phases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhases( PhaseCode newPhases ) {
        PhaseCode oldPhases = phases;
        phases = newPhases == null ? PHASES_EDEFAULT : newPhases;
        boolean oldPhasesESet = phasesESet;
        phasesESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MEASUREMENT__PHASES, oldPhases, phases, !oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhases() {
        PhaseCode oldPhases = phases;
        boolean oldPhasesESet = phasesESet;
        phases = PHASES_EDEFAULT;
        phasesESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MEASUREMENT__PHASES, oldPhases, PHASES_EDEFAULT, oldPhasesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhases() {
        return phasesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getUncefactUnitCode() {
        return uncefactUnitCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUncefactUnitCode( String newUncefactUnitCode ) {
        String oldUncefactUnitCode = uncefactUnitCode;
        uncefactUnitCode = newUncefactUnitCode;
        boolean oldUncefactUnitCodeESet = uncefactUnitCodeESet;
        uncefactUnitCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE,
                    oldUncefactUnitCode, uncefactUnitCode, !oldUncefactUnitCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUncefactUnitCode() {
        String oldUncefactUnitCode = uncefactUnitCode;
        boolean oldUncefactUnitCodeESet = uncefactUnitCodeESet;
        uncefactUnitCode = UNCEFACT_UNIT_CODE_EDEFAULT;
        uncefactUnitCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE,
                    oldUncefactUnitCode, UNCEFACT_UNIT_CODE_EDEFAULT, oldUncefactUnitCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUncefactUnitCode() {
        return uncefactUnitCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitMultiplier getUnitMultiplier() {
        return unitMultiplier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitMultiplier( UnitMultiplier newUnitMultiplier ) {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        unitMultiplier = newUnitMultiplier == null ? UNIT_MULTIPLIER_EDEFAULT : newUnitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplierESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MEASUREMENT__UNIT_MULTIPLIER, oldUnitMultiplier, unitMultiplier, !oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitMultiplier() {
        UnitMultiplier oldUnitMultiplier = unitMultiplier;
        boolean oldUnitMultiplierESet = unitMultiplierESet;
        unitMultiplier = UNIT_MULTIPLIER_EDEFAULT;
        unitMultiplierESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.MEASUREMENT__UNIT_MULTIPLIER,
                    oldUnitMultiplier, UNIT_MULTIPLIER_EDEFAULT, oldUnitMultiplierESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitMultiplier() {
        return unitMultiplierESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnitSymbol( UnitSymbol newUnitSymbol ) {
        UnitSymbol oldUnitSymbol = unitSymbol;
        unitSymbol = newUnitSymbol == null ? UNIT_SYMBOL_EDEFAULT : newUnitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbolESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.MEASUREMENT__UNIT_SYMBOL, oldUnitSymbol, unitSymbol, !oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUnitSymbol() {
        UnitSymbol oldUnitSymbol = unitSymbol;
        boolean oldUnitSymbolESet = unitSymbolESet;
        unitSymbol = UNIT_SYMBOL_EDEFAULT;
        unitSymbolESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.MEASUREMENT__UNIT_SYMBOL, oldUnitSymbol, UNIT_SYMBOL_EDEFAULT, oldUnitSymbolESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnitSymbol() {
        return unitSymbolESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ACDCTerminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( ACDCTerminal newTerminal, NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( ACDCTerminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.ACDC_TERMINAL__MEASUREMENTS, ACDCTerminal.class, msgs );
            if( newTerminal != null ) msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this,
                    CimPackage.ACDC_TERMINAL__MEASUREMENTS, ACDCTerminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__TERMINAL, newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        ACDCTerminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.ACDC_TERMINAL__MEASUREMENTS,
                    ACDCTerminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__TERMINAL, null, null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Procedure > getProcedures() {
        if( procedures == null ) {
            procedures = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Procedure >( Procedure.class,
                    this, CimPackage.MEASUREMENT__PROCEDURES, CimPackage.PROCEDURE__MEASUREMENTS );
        }
        return procedures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetProcedures() {
        if( procedures != null ) ( ( InternalEList.Unsettable< ? > ) procedures ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetProcedures() {
        return procedures != null && ( ( InternalEList.Unsettable< ? > ) procedures ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResource() {
        return powerSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResource( PowerSystemResource newPowerSystemResource,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = newPowerSystemResource;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, newPowerSystemResource,
                    !oldPowerSystemResourceESet );
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
    public void setPowerSystemResource( PowerSystemResource newPowerSystemResource ) {
        if( newPowerSystemResource != powerSystemResource ) {
            NotificationChain msgs = null;
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            if( newPowerSystemResource != null )
                msgs = ( ( InternalEObject ) newPowerSystemResource ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            msgs = basicSetPowerSystemResource( newPowerSystemResource, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE,
                        newPowerSystemResource, newPowerSystemResource, !oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResource( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResource = powerSystemResource;
        powerSystemResource = null;
        boolean oldPowerSystemResourceESet = powerSystemResourceESet;
        powerSystemResourceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, oldPowerSystemResource, null,
                    oldPowerSystemResourceESet );
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
    public void unsetPowerSystemResource() {
        if( powerSystemResource != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResource( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemResourceESet = powerSystemResourceESet;
            powerSystemResourceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE, null, null, oldPowerSystemResourceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResource() {
        return powerSystemResourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Asset getAsset() {
        return asset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsset( Asset newAsset, NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = newAsset;
        boolean oldAssetESet = assetESet;
        assetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__ASSET, oldAsset, newAsset, !oldAssetESet );
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
    public void setAsset( Asset newAsset ) {
        if( newAsset != asset ) {
            NotificationChain msgs = null;
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__MEASUREMENTS, Asset.class, msgs );
            if( newAsset != null ) msgs = ( ( InternalEObject ) newAsset ).eInverseAdd( this,
                    CimPackage.ASSET__MEASUREMENTS, Asset.class, msgs );
            msgs = basicSetAsset( newAsset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__ASSET, newAsset, newAsset, !oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsset( NotificationChain msgs ) {
        Asset oldAsset = asset;
        asset = null;
        boolean oldAssetESet = assetESet;
        assetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__ASSET, oldAsset, null, oldAssetESet );
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
    public void unsetAsset() {
        if( asset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asset ).eInverseRemove( this, CimPackage.ASSET__MEASUREMENTS, Asset.class,
                    msgs );
            msgs = basicUnsetAsset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAssetESet = assetESet;
            assetESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__ASSET, null, null, oldAssetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsset() {
        return assetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Location > getLocations() {
        if( locations == null ) {
            locations = new EObjectWithInverseEList.Unsettable.ManyInverse< Location >( Location.class, this,
                    CimPackage.MEASUREMENT__LOCATIONS, CimPackage.LOCATION__MEASUREMENTS );
        }
        return locations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocations() {
        if( locations != null ) ( ( InternalEList.Unsettable< ? > ) locations ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocations() {
        return locations != null && ( ( InternalEList.Unsettable< ? > ) locations ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CalculationMethodHierarchy getCalculationMethodHierarchy() {
        return calculationMethodHierarchy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCalculationMethodHierarchy(
            CalculationMethodHierarchy newCalculationMethodHierarchy, NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = newCalculationMethodHierarchy;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet );
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
    public void setCalculationMethodHierarchy( CalculationMethodHierarchy newCalculationMethodHierarchy ) {
        if( newCalculationMethodHierarchy != calculationMethodHierarchy ) {
            NotificationChain msgs = null;
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT, CalculationMethodHierarchy.class, msgs );
            if( newCalculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) newCalculationMethodHierarchy ).eInverseAdd( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT, CalculationMethodHierarchy.class, msgs );
            msgs = basicSetCalculationMethodHierarchy( newCalculationMethodHierarchy, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY, newCalculationMethodHierarchy,
                    newCalculationMethodHierarchy, !oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCalculationMethodHierarchy( NotificationChain msgs ) {
        CalculationMethodHierarchy oldCalculationMethodHierarchy = calculationMethodHierarchy;
        calculationMethodHierarchy = null;
        boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
        calculationMethodHierarchyESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY, oldCalculationMethodHierarchy, null,
                    oldCalculationMethodHierarchyESet );
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
    public void unsetCalculationMethodHierarchy() {
        if( calculationMethodHierarchy != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                    CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT, CalculationMethodHierarchy.class, msgs );
            msgs = basicUnsetCalculationMethodHierarchy( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCalculationMethodHierarchyESet = calculationMethodHierarchyESet;
            calculationMethodHierarchyESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY, null, null,
                    oldCalculationMethodHierarchyESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCalculationMethodHierarchy() {
        return calculationMethodHierarchyESet;
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
        case CimPackage.MEASUREMENT__TERMINAL:
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.ACDC_TERMINAL__MEASUREMENTS, ACDCTerminal.class, msgs );
            return basicSetTerminal( ( ACDCTerminal ) otherEnd, msgs );
        case CimPackage.MEASUREMENT__PROCEDURES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getProcedures() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            if( powerSystemResource != null ) msgs = ( ( InternalEObject ) powerSystemResource ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, PowerSystemResource.class, msgs );
            return basicSetPowerSystemResource( ( PowerSystemResource ) otherEnd, msgs );
        case CimPackage.MEASUREMENT__ASSET:
            if( asset != null ) msgs = ( ( InternalEObject ) asset ).eInverseRemove( this,
                    CimPackage.ASSET__MEASUREMENTS, Asset.class, msgs );
            return basicSetAsset( ( Asset ) otherEnd, msgs );
        case CimPackage.MEASUREMENT__LOCATIONS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLocations() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            if( calculationMethodHierarchy != null )
                msgs = ( ( InternalEObject ) calculationMethodHierarchy ).eInverseRemove( this,
                        CimPackage.CALCULATION_METHOD_HIERARCHY__MEASUREMENT, CalculationMethodHierarchy.class, msgs );
            return basicSetCalculationMethodHierarchy( ( CalculationMethodHierarchy ) otherEnd, msgs );
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
        case CimPackage.MEASUREMENT__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.MEASUREMENT__PROCEDURES:
            return ( ( InternalEList< ? > ) getProcedures() ).basicRemove( otherEnd, msgs );
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return basicUnsetPowerSystemResource( msgs );
        case CimPackage.MEASUREMENT__ASSET:
            return basicUnsetAsset( msgs );
        case CimPackage.MEASUREMENT__LOCATIONS:
            return ( ( InternalEList< ? > ) getLocations() ).basicRemove( otherEnd, msgs );
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            return basicUnsetCalculationMethodHierarchy( msgs );
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
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            return getMeasurementType();
        case CimPackage.MEASUREMENT__PHASES:
            return getPhases();
        case CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE:
            return getUncefactUnitCode();
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            return getUnitMultiplier();
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            return getUnitSymbol();
        case CimPackage.MEASUREMENT__TERMINAL:
            return getTerminal();
        case CimPackage.MEASUREMENT__PROCEDURES:
            return getProcedures();
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return getPowerSystemResource();
        case CimPackage.MEASUREMENT__ASSET:
            return getAsset();
        case CimPackage.MEASUREMENT__LOCATIONS:
            return getLocations();
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            return getCalculationMethodHierarchy();
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
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            setMeasurementType( ( String ) newValue );
            return;
        case CimPackage.MEASUREMENT__PHASES:
            setPhases( ( PhaseCode ) newValue );
            return;
        case CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE:
            setUncefactUnitCode( ( String ) newValue );
            return;
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            setUnitMultiplier( ( UnitMultiplier ) newValue );
            return;
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            setUnitSymbol( ( UnitSymbol ) newValue );
            return;
        case CimPackage.MEASUREMENT__TERMINAL:
            setTerminal( ( ACDCTerminal ) newValue );
            return;
        case CimPackage.MEASUREMENT__PROCEDURES:
            getProcedures().clear();
            getProcedures().addAll( ( Collection< ? extends Procedure > ) newValue );
            return;
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            setPowerSystemResource( ( PowerSystemResource ) newValue );
            return;
        case CimPackage.MEASUREMENT__ASSET:
            setAsset( ( Asset ) newValue );
            return;
        case CimPackage.MEASUREMENT__LOCATIONS:
            getLocations().clear();
            getLocations().addAll( ( Collection< ? extends Location > ) newValue );
            return;
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            setCalculationMethodHierarchy( ( CalculationMethodHierarchy ) newValue );
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
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            unsetMeasurementType();
            return;
        case CimPackage.MEASUREMENT__PHASES:
            unsetPhases();
            return;
        case CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE:
            unsetUncefactUnitCode();
            return;
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            unsetUnitMultiplier();
            return;
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            unsetUnitSymbol();
            return;
        case CimPackage.MEASUREMENT__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.MEASUREMENT__PROCEDURES:
            unsetProcedures();
            return;
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            unsetPowerSystemResource();
            return;
        case CimPackage.MEASUREMENT__ASSET:
            unsetAsset();
            return;
        case CimPackage.MEASUREMENT__LOCATIONS:
            unsetLocations();
            return;
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            unsetCalculationMethodHierarchy();
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
        case CimPackage.MEASUREMENT__MEASUREMENT_TYPE:
            return isSetMeasurementType();
        case CimPackage.MEASUREMENT__PHASES:
            return isSetPhases();
        case CimPackage.MEASUREMENT__UNCEFACT_UNIT_CODE:
            return isSetUncefactUnitCode();
        case CimPackage.MEASUREMENT__UNIT_MULTIPLIER:
            return isSetUnitMultiplier();
        case CimPackage.MEASUREMENT__UNIT_SYMBOL:
            return isSetUnitSymbol();
        case CimPackage.MEASUREMENT__TERMINAL:
            return isSetTerminal();
        case CimPackage.MEASUREMENT__PROCEDURES:
            return isSetProcedures();
        case CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE:
            return isSetPowerSystemResource();
        case CimPackage.MEASUREMENT__ASSET:
            return isSetAsset();
        case CimPackage.MEASUREMENT__LOCATIONS:
            return isSetLocations();
        case CimPackage.MEASUREMENT__CALCULATION_METHOD_HIERARCHY:
            return isSetCalculationMethodHierarchy();
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
        result.append( " (measurementType: " );
        if( measurementTypeESet )
            result.append( measurementType );
        else
            result.append( "<unset>" );
        result.append( ", phases: " );
        if( phasesESet )
            result.append( phases );
        else
            result.append( "<unset>" );
        result.append( ", uncefactUnitCode: " );
        if( uncefactUnitCodeESet )
            result.append( uncefactUnitCode );
        else
            result.append( "<unset>" );
        result.append( ", unitMultiplier: " );
        if( unitMultiplierESet )
            result.append( unitMultiplier );
        else
            result.append( "<unset>" );
        result.append( ", unitSymbol: " );
        if( unitSymbolESet )
            result.append( unitSymbol );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //MeasurementImpl
