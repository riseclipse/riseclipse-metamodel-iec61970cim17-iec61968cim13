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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FossilFuel;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelAllocationSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.FuelType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

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
 * An implementation of the model object '<em><b>Fossil Fuel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFossilFuelType <em>Fossil Fuel Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelCost <em>Fuel Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelDispatchCost <em>Fuel Dispatch Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelEffFactor <em>Fuel Eff Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelHandlingCost <em>Fuel Handling Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelHeatContent <em>Fuel Heat Content</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelMixture <em>Fuel Mixture</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelSulfur <em>Fuel Sulfur</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getHighBreakpointP <em>High Breakpoint P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getLowBreakpointP <em>Low Breakpoint P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getThermalGeneratingUnit <em>Thermal Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.FossilFuelImpl#getFuelAllocationSchedules <em>Fuel Allocation Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FossilFuelImpl extends IdentifiedObjectImpl implements FossilFuel {
    /**
     * The default value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuelType()
     * @generated
     * @ordered
     */
    protected static final FuelType FOSSIL_FUEL_TYPE_EDEFAULT = FuelType.COAL;

    /**
     * The cached value of the '{@link #getFossilFuelType() <em>Fossil Fuel Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFossilFuelType()
     * @generated
     * @ordered
     */
    protected FuelType fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;

    /**
     * This is true if the Fossil Fuel Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fossilFuelTypeESet;

    /**
     * The default value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelCost()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelCost() <em>Fuel Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelCost()
     * @generated
     * @ordered
     */
    protected Float fuelCost = FUEL_COST_EDEFAULT;

    /**
     * This is true if the Fuel Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelCostESet;

    /**
     * The default value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelDispatchCost()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_DISPATCH_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelDispatchCost() <em>Fuel Dispatch Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelDispatchCost()
     * @generated
     * @ordered
     */
    protected Float fuelDispatchCost = FUEL_DISPATCH_COST_EDEFAULT;

    /**
     * This is true if the Fuel Dispatch Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelDispatchCostESet;

    /**
     * The default value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelEffFactor()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_EFF_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelEffFactor() <em>Fuel Eff Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelEffFactor()
     * @generated
     * @ordered
     */
    protected Float fuelEffFactor = FUEL_EFF_FACTOR_EDEFAULT;

    /**
     * This is true if the Fuel Eff Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelEffFactorESet;

    /**
     * The default value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelHandlingCost()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_HANDLING_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelHandlingCost() <em>Fuel Handling Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelHandlingCost()
     * @generated
     * @ordered
     */
    protected Float fuelHandlingCost = FUEL_HANDLING_COST_EDEFAULT;

    /**
     * This is true if the Fuel Handling Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelHandlingCostESet;

    /**
     * The default value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelHeatContent()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_HEAT_CONTENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelHeatContent() <em>Fuel Heat Content</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelHeatContent()
     * @generated
     * @ordered
     */
    protected Float fuelHeatContent = FUEL_HEAT_CONTENT_EDEFAULT;

    /**
     * This is true if the Fuel Heat Content attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelHeatContentESet;

    /**
     * The default value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelMixture()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_MIXTURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelMixture() <em>Fuel Mixture</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelMixture()
     * @generated
     * @ordered
     */
    protected Float fuelMixture = FUEL_MIXTURE_EDEFAULT;

    /**
     * This is true if the Fuel Mixture attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelMixtureESet;

    /**
     * The default value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSulfur()
     * @generated
     * @ordered
     */
    protected static final Float FUEL_SULFUR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFuelSulfur() <em>Fuel Sulfur</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelSulfur()
     * @generated
     * @ordered
     */
    protected Float fuelSulfur = FUEL_SULFUR_EDEFAULT;

    /**
     * This is true if the Fuel Sulfur attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fuelSulfurESet;

    /**
     * The default value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighBreakpointP()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_BREAKPOINT_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighBreakpointP() <em>High Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighBreakpointP()
     * @generated
     * @ordered
     */
    protected Float highBreakpointP = HIGH_BREAKPOINT_P_EDEFAULT;

    /**
     * This is true if the High Breakpoint P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highBreakpointPESet;

    /**
     * The default value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowBreakpointP()
     * @generated
     * @ordered
     */
    protected static final Float LOW_BREAKPOINT_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowBreakpointP() <em>Low Breakpoint P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowBreakpointP()
     * @generated
     * @ordered
     */
    protected Float lowBreakpointP = LOW_BREAKPOINT_P_EDEFAULT;

    /**
     * This is true if the Low Breakpoint P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowBreakpointPESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnit() <em>Thermal Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnit()
     * @generated
     * @ordered
     */
    protected ThermalGeneratingUnit thermalGeneratingUnit;

    /**
     * This is true if the Thermal Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thermalGeneratingUnitESet;

    /**
     * The cached value of the '{@link #getFuelAllocationSchedules() <em>Fuel Allocation Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFuelAllocationSchedules()
     * @generated
     * @ordered
     */
    protected EList< FuelAllocationSchedule > fuelAllocationSchedules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FossilFuelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getFossilFuel();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public FuelType getFossilFuelType() {
        return fossilFuelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFossilFuelType( FuelType newFossilFuelType ) {
        FuelType oldFossilFuelType = fossilFuelType;
        fossilFuelType = newFossilFuelType == null ? FOSSIL_FUEL_TYPE_EDEFAULT : newFossilFuelType;
        boolean oldFossilFuelTypeESet = fossilFuelTypeESet;
        fossilFuelTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE, oldFossilFuelType, fossilFuelType, !oldFossilFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFossilFuelType() {
        FuelType oldFossilFuelType = fossilFuelType;
        boolean oldFossilFuelTypeESet = fossilFuelTypeESet;
        fossilFuelType = FOSSIL_FUEL_TYPE_EDEFAULT;
        fossilFuelTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE,
                    oldFossilFuelType, FOSSIL_FUEL_TYPE_EDEFAULT, oldFossilFuelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFossilFuelType() {
        return fossilFuelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelCost() {
        return fuelCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelCost( Float newFuelCost ) {
        Float oldFuelCost = fuelCost;
        fuelCost = newFuelCost;
        boolean oldFuelCostESet = fuelCostESet;
        fuelCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__FUEL_COST, oldFuelCost, fuelCost, !oldFuelCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelCost() {
        Float oldFuelCost = fuelCost;
        boolean oldFuelCostESet = fuelCostESet;
        fuelCost = FUEL_COST_EDEFAULT;
        fuelCostESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_FUEL__FUEL_COST, oldFuelCost, FUEL_COST_EDEFAULT, oldFuelCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelCost() {
        return fuelCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelDispatchCost() {
        return fuelDispatchCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelDispatchCost( Float newFuelDispatchCost ) {
        Float oldFuelDispatchCost = fuelDispatchCost;
        fuelDispatchCost = newFuelDispatchCost;
        boolean oldFuelDispatchCostESet = fuelDispatchCostESet;
        fuelDispatchCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST,
                    oldFuelDispatchCost, fuelDispatchCost, !oldFuelDispatchCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelDispatchCost() {
        Float oldFuelDispatchCost = fuelDispatchCost;
        boolean oldFuelDispatchCostESet = fuelDispatchCostESet;
        fuelDispatchCost = FUEL_DISPATCH_COST_EDEFAULT;
        fuelDispatchCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST,
                    oldFuelDispatchCost, FUEL_DISPATCH_COST_EDEFAULT, oldFuelDispatchCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelDispatchCost() {
        return fuelDispatchCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelEffFactor() {
        return fuelEffFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelEffFactor( Float newFuelEffFactor ) {
        Float oldFuelEffFactor = fuelEffFactor;
        fuelEffFactor = newFuelEffFactor;
        boolean oldFuelEffFactorESet = fuelEffFactorESet;
        fuelEffFactorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR, oldFuelEffFactor, fuelEffFactor, !oldFuelEffFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelEffFactor() {
        Float oldFuelEffFactor = fuelEffFactor;
        boolean oldFuelEffFactorESet = fuelEffFactorESet;
        fuelEffFactor = FUEL_EFF_FACTOR_EDEFAULT;
        fuelEffFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR,
                    oldFuelEffFactor, FUEL_EFF_FACTOR_EDEFAULT, oldFuelEffFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelEffFactor() {
        return fuelEffFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelHandlingCost() {
        return fuelHandlingCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelHandlingCost( Float newFuelHandlingCost ) {
        Float oldFuelHandlingCost = fuelHandlingCost;
        fuelHandlingCost = newFuelHandlingCost;
        boolean oldFuelHandlingCostESet = fuelHandlingCostESet;
        fuelHandlingCostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST,
                    oldFuelHandlingCost, fuelHandlingCost, !oldFuelHandlingCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelHandlingCost() {
        Float oldFuelHandlingCost = fuelHandlingCost;
        boolean oldFuelHandlingCostESet = fuelHandlingCostESet;
        fuelHandlingCost = FUEL_HANDLING_COST_EDEFAULT;
        fuelHandlingCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST,
                    oldFuelHandlingCost, FUEL_HANDLING_COST_EDEFAULT, oldFuelHandlingCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelHandlingCost() {
        return fuelHandlingCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelHeatContent() {
        return fuelHeatContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelHeatContent( Float newFuelHeatContent ) {
        Float oldFuelHeatContent = fuelHeatContent;
        fuelHeatContent = newFuelHeatContent;
        boolean oldFuelHeatContentESet = fuelHeatContentESet;
        fuelHeatContentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT,
                    oldFuelHeatContent, fuelHeatContent, !oldFuelHeatContentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelHeatContent() {
        Float oldFuelHeatContent = fuelHeatContent;
        boolean oldFuelHeatContentESet = fuelHeatContentESet;
        fuelHeatContent = FUEL_HEAT_CONTENT_EDEFAULT;
        fuelHeatContentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT,
                    oldFuelHeatContent, FUEL_HEAT_CONTENT_EDEFAULT, oldFuelHeatContentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelHeatContent() {
        return fuelHeatContentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelMixture() {
        return fuelMixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelMixture( Float newFuelMixture ) {
        Float oldFuelMixture = fuelMixture;
        fuelMixture = newFuelMixture;
        boolean oldFuelMixtureESet = fuelMixtureESet;
        fuelMixtureESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__FUEL_MIXTURE, oldFuelMixture, fuelMixture, !oldFuelMixtureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelMixture() {
        Float oldFuelMixture = fuelMixture;
        boolean oldFuelMixtureESet = fuelMixtureESet;
        fuelMixture = FUEL_MIXTURE_EDEFAULT;
        fuelMixtureESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_FUEL__FUEL_MIXTURE, oldFuelMixture, FUEL_MIXTURE_EDEFAULT, oldFuelMixtureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelMixture() {
        return fuelMixtureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFuelSulfur() {
        return fuelSulfur;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFuelSulfur( Float newFuelSulfur ) {
        Float oldFuelSulfur = fuelSulfur;
        fuelSulfur = newFuelSulfur;
        boolean oldFuelSulfurESet = fuelSulfurESet;
        fuelSulfurESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__FUEL_SULFUR, oldFuelSulfur, fuelSulfur, !oldFuelSulfurESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelSulfur() {
        Float oldFuelSulfur = fuelSulfur;
        boolean oldFuelSulfurESet = fuelSulfurESet;
        fuelSulfur = FUEL_SULFUR_EDEFAULT;
        fuelSulfurESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.FOSSIL_FUEL__FUEL_SULFUR, oldFuelSulfur, FUEL_SULFUR_EDEFAULT, oldFuelSulfurESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelSulfur() {
        return fuelSulfurESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighBreakpointP() {
        return highBreakpointP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighBreakpointP( Float newHighBreakpointP ) {
        Float oldHighBreakpointP = highBreakpointP;
        highBreakpointP = newHighBreakpointP;
        boolean oldHighBreakpointPESet = highBreakpointPESet;
        highBreakpointPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P,
                    oldHighBreakpointP, highBreakpointP, !oldHighBreakpointPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighBreakpointP() {
        Float oldHighBreakpointP = highBreakpointP;
        boolean oldHighBreakpointPESet = highBreakpointPESet;
        highBreakpointP = HIGH_BREAKPOINT_P_EDEFAULT;
        highBreakpointPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P,
                    oldHighBreakpointP, HIGH_BREAKPOINT_P_EDEFAULT, oldHighBreakpointPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighBreakpointP() {
        return highBreakpointPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowBreakpointP() {
        return lowBreakpointP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowBreakpointP( Float newLowBreakpointP ) {
        Float oldLowBreakpointP = lowBreakpointP;
        lowBreakpointP = newLowBreakpointP;
        boolean oldLowBreakpointPESet = lowBreakpointPESet;
        lowBreakpointPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P, oldLowBreakpointP, lowBreakpointP, !oldLowBreakpointPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowBreakpointP() {
        Float oldLowBreakpointP = lowBreakpointP;
        boolean oldLowBreakpointPESet = lowBreakpointPESet;
        lowBreakpointP = LOW_BREAKPOINT_P_EDEFAULT;
        lowBreakpointPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P,
                    oldLowBreakpointP, LOW_BREAKPOINT_P_EDEFAULT, oldLowBreakpointPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowBreakpointP() {
        return lowBreakpointPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ThermalGeneratingUnit getThermalGeneratingUnit() {
        return thermalGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit,
            NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = newThermalGeneratingUnit;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, newThermalGeneratingUnit,
                    !oldThermalGeneratingUnitESet );
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
    public void setThermalGeneratingUnit( ThermalGeneratingUnit newThermalGeneratingUnit ) {
        if( newThermalGeneratingUnit != thermalGeneratingUnit ) {
            NotificationChain msgs = null;
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            if( newThermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newThermalGeneratingUnit ).eInverseAdd( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            msgs = basicSetThermalGeneratingUnit( newThermalGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT,
                        newThermalGeneratingUnit, newThermalGeneratingUnit, !oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetThermalGeneratingUnit( NotificationChain msgs ) {
        ThermalGeneratingUnit oldThermalGeneratingUnit = thermalGeneratingUnit;
        thermalGeneratingUnit = null;
        boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
        thermalGeneratingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, oldThermalGeneratingUnit, null,
                    oldThermalGeneratingUnitESet );
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
    public void unsetThermalGeneratingUnit() {
        if( thermalGeneratingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                    CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            msgs = basicUnsetThermalGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldThermalGeneratingUnitESet = thermalGeneratingUnitESet;
            thermalGeneratingUnitESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT, null, null, oldThermalGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnit() {
        return thermalGeneratingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< FuelAllocationSchedule > getFuelAllocationSchedules() {
        if( fuelAllocationSchedules == null ) {
            fuelAllocationSchedules = new EObjectWithInverseResolvingEList.Unsettable< FuelAllocationSchedule >(
                    FuelAllocationSchedule.class, this, CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES,
                    CimPackage.FUEL_ALLOCATION_SCHEDULE__FOSSIL_FUEL );
        }
        return fuelAllocationSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFuelAllocationSchedules() {
        if( fuelAllocationSchedules != null ) ( ( InternalEList.Unsettable< ? > ) fuelAllocationSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFuelAllocationSchedules() {
        return fuelAllocationSchedules != null && ( ( InternalEList.Unsettable< ? > ) fuelAllocationSchedules ).isSet();
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
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            if( thermalGeneratingUnit != null )
                msgs = ( ( InternalEObject ) thermalGeneratingUnit ).eInverseRemove( this,
                        CimPackage.THERMAL_GENERATING_UNIT__FOSSIL_FUELS, ThermalGeneratingUnit.class, msgs );
            return basicSetThermalGeneratingUnit( ( ThermalGeneratingUnit ) otherEnd, msgs );
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFuelAllocationSchedules() )
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
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return basicUnsetThermalGeneratingUnit( msgs );
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            return ( ( InternalEList< ? > ) getFuelAllocationSchedules() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            return getFossilFuelType();
        case CimPackage.FOSSIL_FUEL__FUEL_COST:
            return getFuelCost();
        case CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
            return getFuelDispatchCost();
        case CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
            return getFuelEffFactor();
        case CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
            return getFuelHandlingCost();
        case CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
            return getFuelHeatContent();
        case CimPackage.FOSSIL_FUEL__FUEL_MIXTURE:
            return getFuelMixture();
        case CimPackage.FOSSIL_FUEL__FUEL_SULFUR:
            return getFuelSulfur();
        case CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
            return getHighBreakpointP();
        case CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
            return getLowBreakpointP();
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return getThermalGeneratingUnit();
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            return getFuelAllocationSchedules();
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            setFossilFuelType( ( FuelType ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_COST:
            setFuelCost( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
            setFuelDispatchCost( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
            setFuelEffFactor( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
            setFuelHandlingCost( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
            setFuelHeatContent( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_MIXTURE:
            setFuelMixture( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_SULFUR:
            setFuelSulfur( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
            setHighBreakpointP( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
            setLowBreakpointP( ( Float ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            setThermalGeneratingUnit( ( ThermalGeneratingUnit ) newValue );
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            getFuelAllocationSchedules().clear();
            getFuelAllocationSchedules().addAll( ( Collection< ? extends FuelAllocationSchedule > ) newValue );
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            unsetFossilFuelType();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_COST:
            unsetFuelCost();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
            unsetFuelDispatchCost();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
            unsetFuelEffFactor();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
            unsetFuelHandlingCost();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
            unsetFuelHeatContent();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_MIXTURE:
            unsetFuelMixture();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_SULFUR:
            unsetFuelSulfur();
            return;
        case CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
            unsetHighBreakpointP();
            return;
        case CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
            unsetLowBreakpointP();
            return;
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            unsetThermalGeneratingUnit();
            return;
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            unsetFuelAllocationSchedules();
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
        case CimPackage.FOSSIL_FUEL__FOSSIL_FUEL_TYPE:
            return isSetFossilFuelType();
        case CimPackage.FOSSIL_FUEL__FUEL_COST:
            return isSetFuelCost();
        case CimPackage.FOSSIL_FUEL__FUEL_DISPATCH_COST:
            return isSetFuelDispatchCost();
        case CimPackage.FOSSIL_FUEL__FUEL_EFF_FACTOR:
            return isSetFuelEffFactor();
        case CimPackage.FOSSIL_FUEL__FUEL_HANDLING_COST:
            return isSetFuelHandlingCost();
        case CimPackage.FOSSIL_FUEL__FUEL_HEAT_CONTENT:
            return isSetFuelHeatContent();
        case CimPackage.FOSSIL_FUEL__FUEL_MIXTURE:
            return isSetFuelMixture();
        case CimPackage.FOSSIL_FUEL__FUEL_SULFUR:
            return isSetFuelSulfur();
        case CimPackage.FOSSIL_FUEL__HIGH_BREAKPOINT_P:
            return isSetHighBreakpointP();
        case CimPackage.FOSSIL_FUEL__LOW_BREAKPOINT_P:
            return isSetLowBreakpointP();
        case CimPackage.FOSSIL_FUEL__THERMAL_GENERATING_UNIT:
            return isSetThermalGeneratingUnit();
        case CimPackage.FOSSIL_FUEL__FUEL_ALLOCATION_SCHEDULES:
            return isSetFuelAllocationSchedules();
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
        result.append( " (fossilFuelType: " );
        if( fossilFuelTypeESet )
            result.append( fossilFuelType );
        else
            result.append( "<unset>" );
        result.append( ", fuelCost: " );
        if( fuelCostESet )
            result.append( fuelCost );
        else
            result.append( "<unset>" );
        result.append( ", fuelDispatchCost: " );
        if( fuelDispatchCostESet )
            result.append( fuelDispatchCost );
        else
            result.append( "<unset>" );
        result.append( ", fuelEffFactor: " );
        if( fuelEffFactorESet )
            result.append( fuelEffFactor );
        else
            result.append( "<unset>" );
        result.append( ", fuelHandlingCost: " );
        if( fuelHandlingCostESet )
            result.append( fuelHandlingCost );
        else
            result.append( "<unset>" );
        result.append( ", fuelHeatContent: " );
        if( fuelHeatContentESet )
            result.append( fuelHeatContent );
        else
            result.append( "<unset>" );
        result.append( ", fuelMixture: " );
        if( fuelMixtureESet )
            result.append( fuelMixture );
        else
            result.append( "<unset>" );
        result.append( ", fuelSulfur: " );
        if( fuelSulfurESet )
            result.append( fuelSulfur );
        else
            result.append( "<unset>" );
        result.append( ", highBreakpointP: " );
        if( highBreakpointPESet )
            result.append( highBreakpointP );
        else
            result.append( "<unset>" );
        result.append( ", lowBreakpointP: " );
        if( lowBreakpointPESet )
            result.append( lowBreakpointP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //FossilFuelImpl
