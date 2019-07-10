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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInfo;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireInsulationKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireMaterialKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePhaseInfo;

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
 * An implementation of the model object '<em><b>Wire Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getCoreRadius <em>Core Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getCoreStrandCount <em>Core Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getGmr <em>Gmr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getInsulated <em>Insulated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getInsulationMaterial <em>Insulation Material</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getInsulationThickness <em>Insulation Thickness</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getMaterial <em>Material</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRAC25 <em>RAC25</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRAC50 <em>RAC50</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRAC75 <em>RAC75</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getRDC20 <em>RDC20</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getSizeDescription <em>Size Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getStrandCount <em>Strand Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WireInfoImpl#getWirePhaseInfo <em>Wire Phase Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WireInfoImpl extends AssetInfoImpl implements WireInfo {
    /**
     * The default value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreRadius()
     * @generated
     * @ordered
     */
    protected static final Float CORE_RADIUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreRadius() <em>Core Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreRadius()
     * @generated
     * @ordered
     */
    protected Float coreRadius = CORE_RADIUS_EDEFAULT;

    /**
     * This is true if the Core Radius attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreRadiusESet;

    /**
     * The default value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreStrandCount()
     * @generated
     * @ordered
     */
    protected static final Integer CORE_STRAND_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCoreStrandCount() <em>Core Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreStrandCount()
     * @generated
     * @ordered
     */
    protected Integer coreStrandCount = CORE_STRAND_COUNT_EDEFAULT;

    /**
     * This is true if the Core Strand Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreStrandCountESet;

    /**
     * The default value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmr()
     * @generated
     * @ordered
     */
    protected static final Float GMR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmr() <em>Gmr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmr()
     * @generated
     * @ordered
     */
    protected Float gmr = GMR_EDEFAULT;

    /**
     * This is true if the Gmr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gmrESet;

    /**
     * The default value of the '{@link #getInsulated() <em>Insulated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulated()
     * @generated
     * @ordered
     */
    protected static final Boolean INSULATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInsulated() <em>Insulated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulated()
     * @generated
     * @ordered
     */
    protected Boolean insulated = INSULATED_EDEFAULT;

    /**
     * This is true if the Insulated attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean insulatedESet;

    /**
     * The default value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationMaterial()
     * @generated
     * @ordered
     */
    protected static final WireInsulationKind INSULATION_MATERIAL_EDEFAULT = WireInsulationKind.ASBESTOS_AND_VARNISHED_CAMBRIC;

    /**
     * The cached value of the '{@link #getInsulationMaterial() <em>Insulation Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationMaterial()
     * @generated
     * @ordered
     */
    protected WireInsulationKind insulationMaterial = INSULATION_MATERIAL_EDEFAULT;

    /**
     * This is true if the Insulation Material attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean insulationMaterialESet;

    /**
     * The default value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationThickness()
     * @generated
     * @ordered
     */
    protected static final Float INSULATION_THICKNESS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInsulationThickness() <em>Insulation Thickness</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInsulationThickness()
     * @generated
     * @ordered
     */
    protected Float insulationThickness = INSULATION_THICKNESS_EDEFAULT;

    /**
     * This is true if the Insulation Thickness attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean insulationThicknessESet;

    /**
     * The default value of the '{@link #getMaterial() <em>Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaterial()
     * @generated
     * @ordered
     */
    protected static final WireMaterialKind MATERIAL_EDEFAULT = WireMaterialKind.COPPER;

    /**
     * The cached value of the '{@link #getMaterial() <em>Material</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaterial()
     * @generated
     * @ordered
     */
    protected WireMaterialKind material = MATERIAL_EDEFAULT;

    /**
     * This is true if the Material attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean materialESet;

    /**
     * The default value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC25()
     * @generated
     * @ordered
     */
    protected static final Float RAC25_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRAC25() <em>RAC25</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC25()
     * @generated
     * @ordered
     */
    protected Float rAC25 = RAC25_EDEFAULT;

    /**
     * This is true if the RAC25 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rAC25ESet;

    /**
     * The default value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC50()
     * @generated
     * @ordered
     */
    protected static final Float RAC50_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRAC50() <em>RAC50</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC50()
     * @generated
     * @ordered
     */
    protected Float rAC50 = RAC50_EDEFAULT;

    /**
     * This is true if the RAC50 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rAC50ESet;

    /**
     * The default value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC75()
     * @generated
     * @ordered
     */
    protected static final Float RAC75_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRAC75() <em>RAC75</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRAC75()
     * @generated
     * @ordered
     */
    protected Float rAC75 = RAC75_EDEFAULT;

    /**
     * This is true if the RAC75 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rAC75ESet;

    /**
     * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadius()
     * @generated
     * @ordered
     */
    protected static final Float RADIUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRadius()
     * @generated
     * @ordered
     */
    protected Float radius = RADIUS_EDEFAULT;

    /**
     * This is true if the Radius attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean radiusESet;

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
     * The default value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRDC20()
     * @generated
     * @ordered
     */
    protected static final Float RDC20_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRDC20() <em>RDC20</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRDC20()
     * @generated
     * @ordered
     */
    protected Float rDC20 = RDC20_EDEFAULT;

    /**
     * This is true if the RDC20 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rDC20ESet;

    /**
     * The default value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeDescription()
     * @generated
     * @ordered
     */
    protected static final String SIZE_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSizeDescription() <em>Size Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSizeDescription()
     * @generated
     * @ordered
     */
    protected String sizeDescription = SIZE_DESCRIPTION_EDEFAULT;

    /**
     * This is true if the Size Description attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sizeDescriptionESet;

    /**
     * The default value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrandCount()
     * @generated
     * @ordered
     */
    protected static final Integer STRAND_COUNT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrandCount() <em>Strand Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrandCount()
     * @generated
     * @ordered
     */
    protected Integer strandCount = STRAND_COUNT_EDEFAULT;

    /**
     * This is true if the Strand Count attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean strandCountESet;

    /**
     * The cached value of the '{@link #getWirePhaseInfo() <em>Wire Phase Info</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWirePhaseInfo()
     * @generated
     * @ordered
     */
    protected EList< WirePhaseInfo > wirePhaseInfo;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WireInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWireInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCoreRadius() {
        return coreRadius;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreRadius( Float newCoreRadius ) {
        Float oldCoreRadius = coreRadius;
        coreRadius = newCoreRadius;
        boolean oldCoreRadiusESet = coreRadiusESet;
        coreRadiusESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__CORE_RADIUS, oldCoreRadius, coreRadius, !oldCoreRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreRadius() {
        Float oldCoreRadius = coreRadius;
        boolean oldCoreRadiusESet = coreRadiusESet;
        coreRadius = CORE_RADIUS_EDEFAULT;
        coreRadiusESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__CORE_RADIUS, oldCoreRadius, CORE_RADIUS_EDEFAULT, oldCoreRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreRadius() {
        return coreRadiusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getCoreStrandCount() {
        return coreStrandCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoreStrandCount( Integer newCoreStrandCount ) {
        Integer oldCoreStrandCount = coreStrandCount;
        coreStrandCount = newCoreStrandCount;
        boolean oldCoreStrandCountESet = coreStrandCountESet;
        coreStrandCountESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_INFO__CORE_STRAND_COUNT,
                    oldCoreStrandCount, coreStrandCount, !oldCoreStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoreStrandCount() {
        Integer oldCoreStrandCount = coreStrandCount;
        boolean oldCoreStrandCountESet = coreStrandCountESet;
        coreStrandCount = CORE_STRAND_COUNT_EDEFAULT;
        coreStrandCountESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_INFO__CORE_STRAND_COUNT,
                    oldCoreStrandCount, CORE_STRAND_COUNT_EDEFAULT, oldCoreStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreStrandCount() {
        return coreStrandCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGmr() {
        return gmr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmr( Float newGmr ) {
        Float oldGmr = gmr;
        gmr = newGmr;
        boolean oldGmrESet = gmrESet;
        gmrESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_INFO__GMR, oldGmr, gmr, !oldGmrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmr() {
        Float oldGmr = gmr;
        boolean oldGmrESet = gmrESet;
        gmr = GMR_EDEFAULT;
        gmrESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__GMR, oldGmr, GMR_EDEFAULT, oldGmrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmr() {
        return gmrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getInsulated() {
        return insulated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInsulated( Boolean newInsulated ) {
        Boolean oldInsulated = insulated;
        insulated = newInsulated;
        boolean oldInsulatedESet = insulatedESet;
        insulatedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__INSULATED, oldInsulated, insulated, !oldInsulatedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInsulated() {
        Boolean oldInsulated = insulated;
        boolean oldInsulatedESet = insulatedESet;
        insulated = INSULATED_EDEFAULT;
        insulatedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__INSULATED, oldInsulated, INSULATED_EDEFAULT, oldInsulatedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInsulated() {
        return insulatedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireInsulationKind getInsulationMaterial() {
        return insulationMaterial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInsulationMaterial( WireInsulationKind newInsulationMaterial ) {
        WireInsulationKind oldInsulationMaterial = insulationMaterial;
        insulationMaterial = newInsulationMaterial == null ? INSULATION_MATERIAL_EDEFAULT : newInsulationMaterial;
        boolean oldInsulationMaterialESet = insulationMaterialESet;
        insulationMaterialESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_INFO__INSULATION_MATERIAL,
                    oldInsulationMaterial, insulationMaterial, !oldInsulationMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInsulationMaterial() {
        WireInsulationKind oldInsulationMaterial = insulationMaterial;
        boolean oldInsulationMaterialESet = insulationMaterialESet;
        insulationMaterial = INSULATION_MATERIAL_EDEFAULT;
        insulationMaterialESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_INFO__INSULATION_MATERIAL,
                    oldInsulationMaterial, INSULATION_MATERIAL_EDEFAULT, oldInsulationMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInsulationMaterial() {
        return insulationMaterialESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInsulationThickness() {
        return insulationThickness;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInsulationThickness( Float newInsulationThickness ) {
        Float oldInsulationThickness = insulationThickness;
        insulationThickness = newInsulationThickness;
        boolean oldInsulationThicknessESet = insulationThicknessESet;
        insulationThicknessESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_INFO__INSULATION_THICKNESS,
                    oldInsulationThickness, insulationThickness, !oldInsulationThicknessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInsulationThickness() {
        Float oldInsulationThickness = insulationThickness;
        boolean oldInsulationThicknessESet = insulationThicknessESet;
        insulationThickness = INSULATION_THICKNESS_EDEFAULT;
        insulationThicknessESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_INFO__INSULATION_THICKNESS,
                    oldInsulationThickness, INSULATION_THICKNESS_EDEFAULT, oldInsulationThicknessESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInsulationThickness() {
        return insulationThicknessESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WireMaterialKind getMaterial() {
        return material;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaterial( WireMaterialKind newMaterial ) {
        WireMaterialKind oldMaterial = material;
        material = newMaterial == null ? MATERIAL_EDEFAULT : newMaterial;
        boolean oldMaterialESet = materialESet;
        materialESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__MATERIAL, oldMaterial, material, !oldMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaterial() {
        WireMaterialKind oldMaterial = material;
        boolean oldMaterialESet = materialESet;
        material = MATERIAL_EDEFAULT;
        materialESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__MATERIAL, oldMaterial, MATERIAL_EDEFAULT, oldMaterialESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaterial() {
        return materialESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRAC25() {
        return rAC25;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRAC25( Float newRAC25 ) {
        Float oldRAC25 = rAC25;
        rAC25 = newRAC25;
        boolean oldRAC25ESet = rAC25ESet;
        rAC25ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__RAC25, oldRAC25, rAC25, !oldRAC25ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRAC25() {
        Float oldRAC25 = rAC25;
        boolean oldRAC25ESet = rAC25ESet;
        rAC25 = RAC25_EDEFAULT;
        rAC25ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RAC25, oldRAC25, RAC25_EDEFAULT, oldRAC25ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRAC25() {
        return rAC25ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRAC50() {
        return rAC50;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRAC50( Float newRAC50 ) {
        Float oldRAC50 = rAC50;
        rAC50 = newRAC50;
        boolean oldRAC50ESet = rAC50ESet;
        rAC50ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__RAC50, oldRAC50, rAC50, !oldRAC50ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRAC50() {
        Float oldRAC50 = rAC50;
        boolean oldRAC50ESet = rAC50ESet;
        rAC50 = RAC50_EDEFAULT;
        rAC50ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RAC50, oldRAC50, RAC50_EDEFAULT, oldRAC50ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRAC50() {
        return rAC50ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRAC75() {
        return rAC75;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRAC75( Float newRAC75 ) {
        Float oldRAC75 = rAC75;
        rAC75 = newRAC75;
        boolean oldRAC75ESet = rAC75ESet;
        rAC75ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__RAC75, oldRAC75, rAC75, !oldRAC75ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRAC75() {
        Float oldRAC75 = rAC75;
        boolean oldRAC75ESet = rAC75ESet;
        rAC75 = RAC75_EDEFAULT;
        rAC75ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RAC75, oldRAC75, RAC75_EDEFAULT, oldRAC75ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRAC75() {
        return rAC75ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRadius() {
        return radius;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRadius( Float newRadius ) {
        Float oldRadius = radius;
        radius = newRadius;
        boolean oldRadiusESet = radiusESet;
        radiusESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__RADIUS, oldRadius, radius, !oldRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRadius() {
        Float oldRadius = radius;
        boolean oldRadiusESet = radiusESet;
        radius = RADIUS_EDEFAULT;
        radiusESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RADIUS, oldRadius, RADIUS_EDEFAULT, oldRadiusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRadius() {
        return radiusESet;
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
                CimPackage.WIRE_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RATED_CURRENT, oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
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
    public Float getRDC20() {
        return rDC20;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRDC20( Float newRDC20 ) {
        Float oldRDC20 = rDC20;
        rDC20 = newRDC20;
        boolean oldRDC20ESet = rDC20ESet;
        rDC20ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__RDC20, oldRDC20, rDC20, !oldRDC20ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRDC20() {
        Float oldRDC20 = rDC20;
        boolean oldRDC20ESet = rDC20ESet;
        rDC20 = RDC20_EDEFAULT;
        rDC20ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__RDC20, oldRDC20, RDC20_EDEFAULT, oldRDC20ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRDC20() {
        return rDC20ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSizeDescription() {
        return sizeDescription;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSizeDescription( String newSizeDescription ) {
        String oldSizeDescription = sizeDescription;
        sizeDescription = newSizeDescription;
        boolean oldSizeDescriptionESet = sizeDescriptionESet;
        sizeDescriptionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIRE_INFO__SIZE_DESCRIPTION,
                    oldSizeDescription, sizeDescription, !oldSizeDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSizeDescription() {
        String oldSizeDescription = sizeDescription;
        boolean oldSizeDescriptionESet = sizeDescriptionESet;
        sizeDescription = SIZE_DESCRIPTION_EDEFAULT;
        sizeDescriptionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIRE_INFO__SIZE_DESCRIPTION,
                    oldSizeDescription, SIZE_DESCRIPTION_EDEFAULT, oldSizeDescriptionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSizeDescription() {
        return sizeDescriptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getStrandCount() {
        return strandCount;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStrandCount( Integer newStrandCount ) {
        Integer oldStrandCount = strandCount;
        strandCount = newStrandCount;
        boolean oldStrandCountESet = strandCountESet;
        strandCountESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIRE_INFO__STRAND_COUNT, oldStrandCount, strandCount, !oldStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStrandCount() {
        Integer oldStrandCount = strandCount;
        boolean oldStrandCountESet = strandCountESet;
        strandCount = STRAND_COUNT_EDEFAULT;
        strandCountESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIRE_INFO__STRAND_COUNT, oldStrandCount, STRAND_COUNT_EDEFAULT, oldStrandCountESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStrandCount() {
        return strandCountESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WirePhaseInfo > getWirePhaseInfo() {
        if( wirePhaseInfo == null ) {
            wirePhaseInfo = new EObjectWithInverseResolvingEList.Unsettable< WirePhaseInfo >( WirePhaseInfo.class, this,
                    CimPackage.WIRE_INFO__WIRE_PHASE_INFO, CimPackage.WIRE_PHASE_INFO__WIRE_INFO );
        }
        return wirePhaseInfo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWirePhaseInfo() {
        if( wirePhaseInfo != null ) ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWirePhaseInfo() {
        return wirePhaseInfo != null && ( ( InternalEList.Unsettable< ? > ) wirePhaseInfo ).isSet();
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
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWirePhaseInfo() )
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
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            return ( ( InternalEList< ? > ) getWirePhaseInfo() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIRE_INFO__CORE_RADIUS:
            return getCoreRadius();
        case CimPackage.WIRE_INFO__CORE_STRAND_COUNT:
            return getCoreStrandCount();
        case CimPackage.WIRE_INFO__GMR:
            return getGmr();
        case CimPackage.WIRE_INFO__INSULATED:
            return getInsulated();
        case CimPackage.WIRE_INFO__INSULATION_MATERIAL:
            return getInsulationMaterial();
        case CimPackage.WIRE_INFO__INSULATION_THICKNESS:
            return getInsulationThickness();
        case CimPackage.WIRE_INFO__MATERIAL:
            return getMaterial();
        case CimPackage.WIRE_INFO__RAC25:
            return getRAC25();
        case CimPackage.WIRE_INFO__RAC50:
            return getRAC50();
        case CimPackage.WIRE_INFO__RAC75:
            return getRAC75();
        case CimPackage.WIRE_INFO__RADIUS:
            return getRadius();
        case CimPackage.WIRE_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.WIRE_INFO__RDC20:
            return getRDC20();
        case CimPackage.WIRE_INFO__SIZE_DESCRIPTION:
            return getSizeDescription();
        case CimPackage.WIRE_INFO__STRAND_COUNT:
            return getStrandCount();
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            return getWirePhaseInfo();
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
        case CimPackage.WIRE_INFO__CORE_RADIUS:
            setCoreRadius( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__CORE_STRAND_COUNT:
            setCoreStrandCount( ( Integer ) newValue );
            return;
        case CimPackage.WIRE_INFO__GMR:
            setGmr( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__INSULATED:
            setInsulated( ( Boolean ) newValue );
            return;
        case CimPackage.WIRE_INFO__INSULATION_MATERIAL:
            setInsulationMaterial( ( WireInsulationKind ) newValue );
            return;
        case CimPackage.WIRE_INFO__INSULATION_THICKNESS:
            setInsulationThickness( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__MATERIAL:
            setMaterial( ( WireMaterialKind ) newValue );
            return;
        case CimPackage.WIRE_INFO__RAC25:
            setRAC25( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__RAC50:
            setRAC50( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__RAC75:
            setRAC75( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__RADIUS:
            setRadius( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__RDC20:
            setRDC20( ( Float ) newValue );
            return;
        case CimPackage.WIRE_INFO__SIZE_DESCRIPTION:
            setSizeDescription( ( String ) newValue );
            return;
        case CimPackage.WIRE_INFO__STRAND_COUNT:
            setStrandCount( ( Integer ) newValue );
            return;
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            getWirePhaseInfo().clear();
            getWirePhaseInfo().addAll( ( Collection< ? extends WirePhaseInfo > ) newValue );
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
        case CimPackage.WIRE_INFO__CORE_RADIUS:
            unsetCoreRadius();
            return;
        case CimPackage.WIRE_INFO__CORE_STRAND_COUNT:
            unsetCoreStrandCount();
            return;
        case CimPackage.WIRE_INFO__GMR:
            unsetGmr();
            return;
        case CimPackage.WIRE_INFO__INSULATED:
            unsetInsulated();
            return;
        case CimPackage.WIRE_INFO__INSULATION_MATERIAL:
            unsetInsulationMaterial();
            return;
        case CimPackage.WIRE_INFO__INSULATION_THICKNESS:
            unsetInsulationThickness();
            return;
        case CimPackage.WIRE_INFO__MATERIAL:
            unsetMaterial();
            return;
        case CimPackage.WIRE_INFO__RAC25:
            unsetRAC25();
            return;
        case CimPackage.WIRE_INFO__RAC50:
            unsetRAC50();
            return;
        case CimPackage.WIRE_INFO__RAC75:
            unsetRAC75();
            return;
        case CimPackage.WIRE_INFO__RADIUS:
            unsetRadius();
            return;
        case CimPackage.WIRE_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.WIRE_INFO__RDC20:
            unsetRDC20();
            return;
        case CimPackage.WIRE_INFO__SIZE_DESCRIPTION:
            unsetSizeDescription();
            return;
        case CimPackage.WIRE_INFO__STRAND_COUNT:
            unsetStrandCount();
            return;
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            unsetWirePhaseInfo();
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
        case CimPackage.WIRE_INFO__CORE_RADIUS:
            return isSetCoreRadius();
        case CimPackage.WIRE_INFO__CORE_STRAND_COUNT:
            return isSetCoreStrandCount();
        case CimPackage.WIRE_INFO__GMR:
            return isSetGmr();
        case CimPackage.WIRE_INFO__INSULATED:
            return isSetInsulated();
        case CimPackage.WIRE_INFO__INSULATION_MATERIAL:
            return isSetInsulationMaterial();
        case CimPackage.WIRE_INFO__INSULATION_THICKNESS:
            return isSetInsulationThickness();
        case CimPackage.WIRE_INFO__MATERIAL:
            return isSetMaterial();
        case CimPackage.WIRE_INFO__RAC25:
            return isSetRAC25();
        case CimPackage.WIRE_INFO__RAC50:
            return isSetRAC50();
        case CimPackage.WIRE_INFO__RAC75:
            return isSetRAC75();
        case CimPackage.WIRE_INFO__RADIUS:
            return isSetRadius();
        case CimPackage.WIRE_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.WIRE_INFO__RDC20:
            return isSetRDC20();
        case CimPackage.WIRE_INFO__SIZE_DESCRIPTION:
            return isSetSizeDescription();
        case CimPackage.WIRE_INFO__STRAND_COUNT:
            return isSetStrandCount();
        case CimPackage.WIRE_INFO__WIRE_PHASE_INFO:
            return isSetWirePhaseInfo();
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
        result.append( " (coreRadius: " );
        if( coreRadiusESet )
            result.append( coreRadius );
        else
            result.append( "<unset>" );
        result.append( ", coreStrandCount: " );
        if( coreStrandCountESet )
            result.append( coreStrandCount );
        else
            result.append( "<unset>" );
        result.append( ", gmr: " );
        if( gmrESet )
            result.append( gmr );
        else
            result.append( "<unset>" );
        result.append( ", insulated: " );
        if( insulatedESet )
            result.append( insulated );
        else
            result.append( "<unset>" );
        result.append( ", insulationMaterial: " );
        if( insulationMaterialESet )
            result.append( insulationMaterial );
        else
            result.append( "<unset>" );
        result.append( ", insulationThickness: " );
        if( insulationThicknessESet )
            result.append( insulationThickness );
        else
            result.append( "<unset>" );
        result.append( ", material: " );
        if( materialESet )
            result.append( material );
        else
            result.append( "<unset>" );
        result.append( ", rAC25: " );
        if( rAC25ESet )
            result.append( rAC25 );
        else
            result.append( "<unset>" );
        result.append( ", rAC50: " );
        if( rAC50ESet )
            result.append( rAC50 );
        else
            result.append( "<unset>" );
        result.append( ", rAC75: " );
        if( rAC75ESet )
            result.append( rAC75 );
        else
            result.append( "<unset>" );
        result.append( ", radius: " );
        if( radiusESet )
            result.append( radius );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", rDC20: " );
        if( rDC20ESet )
            result.append( rDC20 );
        else
            result.append( "<unset>" );
        result.append( ", sizeDescription: " );
        if( sizeDescriptionESet )
            result.append( sizeDescription );
        else
            result.append( "<unset>" );
        result.append( ", strandCount: " );
        if( strandCountESet )
            result.append( strandCount );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WireInfoImpl
