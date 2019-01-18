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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableConstructionKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableOuterJacketKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CableShieldMaterialKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getConstructionKind <em>Construction Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getDiameterOverCore <em>Diameter Over Core</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getDiameterOverInsulation <em>Diameter Over Insulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getDiameterOverJacket <em>Diameter Over Jacket</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getDiameterOverScreen <em>Diameter Over Screen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getIsStrandFill <em>Is Strand Fill</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getNominalTemperature <em>Nominal Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getOuterJacketKind <em>Outer Jacket Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getSheathAsNeutral <em>Sheath As Neutral</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CableInfoImpl#getShieldMaterial <em>Shield Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CableInfoImpl extends WireInfoImpl implements CableInfo {
    /**
     * The default value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstructionKind()
     * @generated
     * @ordered
     */
    protected static final CableConstructionKind CONSTRUCTION_KIND_EDEFAULT = CableConstructionKind.COMPACTED;

    /**
     * The cached value of the '{@link #getConstructionKind() <em>Construction Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstructionKind()
     * @generated
     * @ordered
     */
    protected CableConstructionKind constructionKind = CONSTRUCTION_KIND_EDEFAULT;

    /**
     * This is true if the Construction Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean constructionKindESet;

    /**
     * The default value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverCore()
     * @generated
     * @ordered
     */
    protected static final Float DIAMETER_OVER_CORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiameterOverCore() <em>Diameter Over Core</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverCore()
     * @generated
     * @ordered
     */
    protected Float diameterOverCore = DIAMETER_OVER_CORE_EDEFAULT;

    /**
     * This is true if the Diameter Over Core attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diameterOverCoreESet;

    /**
     * The default value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverInsulation()
     * @generated
     * @ordered
     */
    protected static final Float DIAMETER_OVER_INSULATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiameterOverInsulation() <em>Diameter Over Insulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverInsulation()
     * @generated
     * @ordered
     */
    protected Float diameterOverInsulation = DIAMETER_OVER_INSULATION_EDEFAULT;

    /**
     * This is true if the Diameter Over Insulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diameterOverInsulationESet;

    /**
     * The default value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverJacket()
     * @generated
     * @ordered
     */
    protected static final Float DIAMETER_OVER_JACKET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiameterOverJacket() <em>Diameter Over Jacket</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverJacket()
     * @generated
     * @ordered
     */
    protected Float diameterOverJacket = DIAMETER_OVER_JACKET_EDEFAULT;

    /**
     * This is true if the Diameter Over Jacket attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diameterOverJacketESet;

    /**
     * The default value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverScreen()
     * @generated
     * @ordered
     */
    protected static final Float DIAMETER_OVER_SCREEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiameterOverScreen() <em>Diameter Over Screen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiameterOverScreen()
     * @generated
     * @ordered
     */
    protected Float diameterOverScreen = DIAMETER_OVER_SCREEN_EDEFAULT;

    /**
     * This is true if the Diameter Over Screen attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean diameterOverScreenESet;

    /**
     * The default value of the '{@link #getIsStrandFill() <em>Is Strand Fill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStrandFill()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_STRAND_FILL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsStrandFill() <em>Is Strand Fill</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsStrandFill()
     * @generated
     * @ordered
     */
    protected Boolean isStrandFill = IS_STRAND_FILL_EDEFAULT;

    /**
     * This is true if the Is Strand Fill attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isStrandFillESet;

    /**
     * The default value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalTemperature()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalTemperature() <em>Nominal Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalTemperature()
     * @generated
     * @ordered
     */
    protected Float nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Nominal Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalTemperatureESet;

    /**
     * The default value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOuterJacketKind()
     * @generated
     * @ordered
     */
    protected static final CableOuterJacketKind OUTER_JACKET_KIND_EDEFAULT = CableOuterJacketKind.NONE;

    /**
     * The cached value of the '{@link #getOuterJacketKind() <em>Outer Jacket Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOuterJacketKind()
     * @generated
     * @ordered
     */
    protected CableOuterJacketKind outerJacketKind = OUTER_JACKET_KIND_EDEFAULT;

    /**
     * This is true if the Outer Jacket Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean outerJacketKindESet;

    /**
     * The default value of the '{@link #getSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSheathAsNeutral()
     * @generated
     * @ordered
     */
    protected static final Boolean SHEATH_AS_NEUTRAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSheathAsNeutral() <em>Sheath As Neutral</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSheathAsNeutral()
     * @generated
     * @ordered
     */
    protected Boolean sheathAsNeutral = SHEATH_AS_NEUTRAL_EDEFAULT;

    /**
     * This is true if the Sheath As Neutral attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sheathAsNeutralESet;

    /**
     * The default value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShieldMaterial()
     * @generated
     * @ordered
     */
    protected static final CableShieldMaterialKind SHIELD_MATERIAL_EDEFAULT = CableShieldMaterialKind.LEAD;

    /**
     * The cached value of the '{@link #getShieldMaterial() <em>Shield Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShieldMaterial()
     * @generated
     * @ordered
     */
    protected CableShieldMaterialKind shieldMaterial = SHIELD_MATERIAL_EDEFAULT;

    /**
     * This is true if the Shield Material attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shieldMaterialESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CableInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCableInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CableConstructionKind getConstructionKind() {
        return constructionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConstructionKind( CableConstructionKind newConstructionKind ) {
        CableConstructionKind oldConstructionKind = constructionKind;
        constructionKind = newConstructionKind == null ? CONSTRUCTION_KIND_EDEFAULT : newConstructionKind;
        boolean oldConstructionKindESet = constructionKindESet;
        constructionKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__CONSTRUCTION_KIND,
                    oldConstructionKind, constructionKind, !oldConstructionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConstructionKind() {
        CableConstructionKind oldConstructionKind = constructionKind;
        boolean oldConstructionKindESet = constructionKindESet;
        constructionKind = CONSTRUCTION_KIND_EDEFAULT;
        constructionKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__CONSTRUCTION_KIND,
                    oldConstructionKind, CONSTRUCTION_KIND_EDEFAULT, oldConstructionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConstructionKind() {
        return constructionKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiameterOverCore() {
        return diameterOverCore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiameterOverCore( Float newDiameterOverCore ) {
        Float oldDiameterOverCore = diameterOverCore;
        diameterOverCore = newDiameterOverCore;
        boolean oldDiameterOverCoreESet = diameterOverCoreESet;
        diameterOverCoreESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__DIAMETER_OVER_CORE,
                    oldDiameterOverCore, diameterOverCore, !oldDiameterOverCoreESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiameterOverCore() {
        Float oldDiameterOverCore = diameterOverCore;
        boolean oldDiameterOverCoreESet = diameterOverCoreESet;
        diameterOverCore = DIAMETER_OVER_CORE_EDEFAULT;
        diameterOverCoreESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__DIAMETER_OVER_CORE,
                    oldDiameterOverCore, DIAMETER_OVER_CORE_EDEFAULT, oldDiameterOverCoreESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiameterOverCore() {
        return diameterOverCoreESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiameterOverInsulation() {
        return diameterOverInsulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiameterOverInsulation( Float newDiameterOverInsulation ) {
        Float oldDiameterOverInsulation = diameterOverInsulation;
        diameterOverInsulation = newDiameterOverInsulation;
        boolean oldDiameterOverInsulationESet = diameterOverInsulationESet;
        diameterOverInsulationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION,
                    oldDiameterOverInsulation, diameterOverInsulation, !oldDiameterOverInsulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiameterOverInsulation() {
        Float oldDiameterOverInsulation = diameterOverInsulation;
        boolean oldDiameterOverInsulationESet = diameterOverInsulationESet;
        diameterOverInsulation = DIAMETER_OVER_INSULATION_EDEFAULT;
        diameterOverInsulationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION,
                    oldDiameterOverInsulation, DIAMETER_OVER_INSULATION_EDEFAULT, oldDiameterOverInsulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiameterOverInsulation() {
        return diameterOverInsulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiameterOverJacket() {
        return diameterOverJacket;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiameterOverJacket( Float newDiameterOverJacket ) {
        Float oldDiameterOverJacket = diameterOverJacket;
        diameterOverJacket = newDiameterOverJacket;
        boolean oldDiameterOverJacketESet = diameterOverJacketESet;
        diameterOverJacketESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET,
                    oldDiameterOverJacket, diameterOverJacket, !oldDiameterOverJacketESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiameterOverJacket() {
        Float oldDiameterOverJacket = diameterOverJacket;
        boolean oldDiameterOverJacketESet = diameterOverJacketESet;
        diameterOverJacket = DIAMETER_OVER_JACKET_EDEFAULT;
        diameterOverJacketESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET,
                    oldDiameterOverJacket, DIAMETER_OVER_JACKET_EDEFAULT, oldDiameterOverJacketESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiameterOverJacket() {
        return diameterOverJacketESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDiameterOverScreen() {
        return diameterOverScreen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDiameterOverScreen( Float newDiameterOverScreen ) {
        Float oldDiameterOverScreen = diameterOverScreen;
        diameterOverScreen = newDiameterOverScreen;
        boolean oldDiameterOverScreenESet = diameterOverScreenESet;
        diameterOverScreenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN,
                    oldDiameterOverScreen, diameterOverScreen, !oldDiameterOverScreenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiameterOverScreen() {
        Float oldDiameterOverScreen = diameterOverScreen;
        boolean oldDiameterOverScreenESet = diameterOverScreenESet;
        diameterOverScreen = DIAMETER_OVER_SCREEN_EDEFAULT;
        diameterOverScreenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN,
                    oldDiameterOverScreen, DIAMETER_OVER_SCREEN_EDEFAULT, oldDiameterOverScreenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiameterOverScreen() {
        return diameterOverScreenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsStrandFill() {
        return isStrandFill;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsStrandFill( Boolean newIsStrandFill ) {
        Boolean oldIsStrandFill = isStrandFill;
        isStrandFill = newIsStrandFill;
        boolean oldIsStrandFillESet = isStrandFillESet;
        isStrandFillESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CABLE_INFO__IS_STRAND_FILL, oldIsStrandFill, isStrandFill, !oldIsStrandFillESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsStrandFill() {
        Boolean oldIsStrandFill = isStrandFill;
        boolean oldIsStrandFillESet = isStrandFillESet;
        isStrandFill = IS_STRAND_FILL_EDEFAULT;
        isStrandFillESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__IS_STRAND_FILL,
                    oldIsStrandFill, IS_STRAND_FILL_EDEFAULT, oldIsStrandFillESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsStrandFill() {
        return isStrandFillESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalTemperature() {
        return nominalTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalTemperature( Float newNominalTemperature ) {
        Float oldNominalTemperature = nominalTemperature;
        nominalTemperature = newNominalTemperature;
        boolean oldNominalTemperatureESet = nominalTemperatureESet;
        nominalTemperatureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE,
                    oldNominalTemperature, nominalTemperature, !oldNominalTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalTemperature() {
        Float oldNominalTemperature = nominalTemperature;
        boolean oldNominalTemperatureESet = nominalTemperatureESet;
        nominalTemperature = NOMINAL_TEMPERATURE_EDEFAULT;
        nominalTemperatureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE,
                    oldNominalTemperature, NOMINAL_TEMPERATURE_EDEFAULT, oldNominalTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalTemperature() {
        return nominalTemperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CableOuterJacketKind getOuterJacketKind() {
        return outerJacketKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOuterJacketKind( CableOuterJacketKind newOuterJacketKind ) {
        CableOuterJacketKind oldOuterJacketKind = outerJacketKind;
        outerJacketKind = newOuterJacketKind == null ? OUTER_JACKET_KIND_EDEFAULT : newOuterJacketKind;
        boolean oldOuterJacketKindESet = outerJacketKindESet;
        outerJacketKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__OUTER_JACKET_KIND,
                    oldOuterJacketKind, outerJacketKind, !oldOuterJacketKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOuterJacketKind() {
        CableOuterJacketKind oldOuterJacketKind = outerJacketKind;
        boolean oldOuterJacketKindESet = outerJacketKindESet;
        outerJacketKind = OUTER_JACKET_KIND_EDEFAULT;
        outerJacketKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__OUTER_JACKET_KIND,
                    oldOuterJacketKind, OUTER_JACKET_KIND_EDEFAULT, oldOuterJacketKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOuterJacketKind() {
        return outerJacketKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getSheathAsNeutral() {
        return sheathAsNeutral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSheathAsNeutral( Boolean newSheathAsNeutral ) {
        Boolean oldSheathAsNeutral = sheathAsNeutral;
        sheathAsNeutral = newSheathAsNeutral;
        boolean oldSheathAsNeutralESet = sheathAsNeutralESet;
        sheathAsNeutralESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL,
                    oldSheathAsNeutral, sheathAsNeutral, !oldSheathAsNeutralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSheathAsNeutral() {
        Boolean oldSheathAsNeutral = sheathAsNeutral;
        boolean oldSheathAsNeutralESet = sheathAsNeutralESet;
        sheathAsNeutral = SHEATH_AS_NEUTRAL_EDEFAULT;
        sheathAsNeutralESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL,
                    oldSheathAsNeutral, SHEATH_AS_NEUTRAL_EDEFAULT, oldSheathAsNeutralESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSheathAsNeutral() {
        return sheathAsNeutralESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CableShieldMaterialKind getShieldMaterial() {
        return shieldMaterial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShieldMaterial( CableShieldMaterialKind newShieldMaterial ) {
        CableShieldMaterialKind oldShieldMaterial = shieldMaterial;
        shieldMaterial = newShieldMaterial == null ? SHIELD_MATERIAL_EDEFAULT : newShieldMaterial;
        boolean oldShieldMaterialESet = shieldMaterialESet;
        shieldMaterialESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CABLE_INFO__SHIELD_MATERIAL, oldShieldMaterial, shieldMaterial, !oldShieldMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShieldMaterial() {
        CableShieldMaterialKind oldShieldMaterial = shieldMaterial;
        boolean oldShieldMaterialESet = shieldMaterialESet;
        shieldMaterial = SHIELD_MATERIAL_EDEFAULT;
        shieldMaterialESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CABLE_INFO__SHIELD_MATERIAL,
                    oldShieldMaterial, SHIELD_MATERIAL_EDEFAULT, oldShieldMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShieldMaterial() {
        return shieldMaterialESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CABLE_INFO__CONSTRUCTION_KIND:
            return getConstructionKind();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_CORE:
            return getDiameterOverCore();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
            return getDiameterOverInsulation();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
            return getDiameterOverJacket();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
            return getDiameterOverScreen();
        case CimPackage.CABLE_INFO__IS_STRAND_FILL:
            return getIsStrandFill();
        case CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
            return getNominalTemperature();
        case CimPackage.CABLE_INFO__OUTER_JACKET_KIND:
            return getOuterJacketKind();
        case CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
            return getSheathAsNeutral();
        case CimPackage.CABLE_INFO__SHIELD_MATERIAL:
            return getShieldMaterial();
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
        case CimPackage.CABLE_INFO__CONSTRUCTION_KIND:
            setConstructionKind( ( CableConstructionKind ) newValue );
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_CORE:
            setDiameterOverCore( ( Float ) newValue );
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
            setDiameterOverInsulation( ( Float ) newValue );
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
            setDiameterOverJacket( ( Float ) newValue );
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
            setDiameterOverScreen( ( Float ) newValue );
            return;
        case CimPackage.CABLE_INFO__IS_STRAND_FILL:
            setIsStrandFill( ( Boolean ) newValue );
            return;
        case CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
            setNominalTemperature( ( Float ) newValue );
            return;
        case CimPackage.CABLE_INFO__OUTER_JACKET_KIND:
            setOuterJacketKind( ( CableOuterJacketKind ) newValue );
            return;
        case CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
            setSheathAsNeutral( ( Boolean ) newValue );
            return;
        case CimPackage.CABLE_INFO__SHIELD_MATERIAL:
            setShieldMaterial( ( CableShieldMaterialKind ) newValue );
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
        case CimPackage.CABLE_INFO__CONSTRUCTION_KIND:
            unsetConstructionKind();
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_CORE:
            unsetDiameterOverCore();
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
            unsetDiameterOverInsulation();
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
            unsetDiameterOverJacket();
            return;
        case CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
            unsetDiameterOverScreen();
            return;
        case CimPackage.CABLE_INFO__IS_STRAND_FILL:
            unsetIsStrandFill();
            return;
        case CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
            unsetNominalTemperature();
            return;
        case CimPackage.CABLE_INFO__OUTER_JACKET_KIND:
            unsetOuterJacketKind();
            return;
        case CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
            unsetSheathAsNeutral();
            return;
        case CimPackage.CABLE_INFO__SHIELD_MATERIAL:
            unsetShieldMaterial();
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
        case CimPackage.CABLE_INFO__CONSTRUCTION_KIND:
            return isSetConstructionKind();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_CORE:
            return isSetDiameterOverCore();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_INSULATION:
            return isSetDiameterOverInsulation();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_JACKET:
            return isSetDiameterOverJacket();
        case CimPackage.CABLE_INFO__DIAMETER_OVER_SCREEN:
            return isSetDiameterOverScreen();
        case CimPackage.CABLE_INFO__IS_STRAND_FILL:
            return isSetIsStrandFill();
        case CimPackage.CABLE_INFO__NOMINAL_TEMPERATURE:
            return isSetNominalTemperature();
        case CimPackage.CABLE_INFO__OUTER_JACKET_KIND:
            return isSetOuterJacketKind();
        case CimPackage.CABLE_INFO__SHEATH_AS_NEUTRAL:
            return isSetSheathAsNeutral();
        case CimPackage.CABLE_INFO__SHIELD_MATERIAL:
            return isSetShieldMaterial();
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
        result.append( " (constructionKind: " );
        if( constructionKindESet )
            result.append( constructionKind );
        else
            result.append( "<unset>" );
        result.append( ", diameterOverCore: " );
        if( diameterOverCoreESet )
            result.append( diameterOverCore );
        else
            result.append( "<unset>" );
        result.append( ", diameterOverInsulation: " );
        if( diameterOverInsulationESet )
            result.append( diameterOverInsulation );
        else
            result.append( "<unset>" );
        result.append( ", diameterOverJacket: " );
        if( diameterOverJacketESet )
            result.append( diameterOverJacket );
        else
            result.append( "<unset>" );
        result.append( ", diameterOverScreen: " );
        if( diameterOverScreenESet )
            result.append( diameterOverScreen );
        else
            result.append( "<unset>" );
        result.append( ", isStrandFill: " );
        if( isStrandFillESet )
            result.append( isStrandFill );
        else
            result.append( "<unset>" );
        result.append( ", nominalTemperature: " );
        if( nominalTemperatureESet )
            result.append( nominalTemperature );
        else
            result.append( "<unset>" );
        result.append( ", outerJacketKind: " );
        if( outerJacketKindESet )
            result.append( outerJacketKind );
        else
            result.append( "<unset>" );
        result.append( ", sheathAsNeutral: " );
        if( sheathAsNeutralESet )
            result.append( sheathAsNeutral );
        else
            result.append( "<unset>" );
        result.append( ", shieldMaterial: " );
        if( shieldMaterialESet )
            result.append( shieldMaterial );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CableInfoImpl
