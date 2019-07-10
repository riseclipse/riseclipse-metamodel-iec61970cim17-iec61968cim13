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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSupply;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamTurbine;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Steam Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getCrossoverTC <em>Crossover TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getReheater1TC <em>Reheater1 TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getReheater2TC <em>Reheater2 TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft1PowerHP <em>Shaft1 Power HP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft1PowerIP <em>Shaft1 Power IP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft1PowerLP1 <em>Shaft1 Power LP1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft1PowerLP2 <em>Shaft1 Power LP2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft2PowerHP <em>Shaft2 Power HP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft2PowerIP <em>Shaft2 Power IP</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft2PowerLP1 <em>Shaft2 Power LP1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getShaft2PowerLP2 <em>Shaft2 Power LP2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getSteamChestTC <em>Steam Chest TC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SteamTurbineImpl#getSteamSupplys <em>Steam Supplys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SteamTurbineImpl extends PrimeMoverImpl implements SteamTurbine {
    /**
     * The default value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossoverTC()
     * @generated
     * @ordered
     */
    protected static final Float CROSSOVER_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCrossoverTC() <em>Crossover TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossoverTC()
     * @generated
     * @ordered
     */
    protected Float crossoverTC = CROSSOVER_TC_EDEFAULT;

    /**
     * This is true if the Crossover TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crossoverTCESet;

    /**
     * The default value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReheater1TC()
     * @generated
     * @ordered
     */
    protected static final Float REHEATER1_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReheater1TC() <em>Reheater1 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReheater1TC()
     * @generated
     * @ordered
     */
    protected Float reheater1TC = REHEATER1_TC_EDEFAULT;

    /**
     * This is true if the Reheater1 TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reheater1TCESet;

    /**
     * The default value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReheater2TC()
     * @generated
     * @ordered
     */
    protected static final Float REHEATER2_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReheater2TC() <em>Reheater2 TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReheater2TC()
     * @generated
     * @ordered
     */
    protected Float reheater2TC = REHEATER2_TC_EDEFAULT;

    /**
     * This is true if the Reheater2 TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reheater2TCESet;

    /**
     * The default value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerHP()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT1_POWER_HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft1PowerHP() <em>Shaft1 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerHP()
     * @generated
     * @ordered
     */
    protected Float shaft1PowerHP = SHAFT1_POWER_HP_EDEFAULT;

    /**
     * This is true if the Shaft1 Power HP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft1PowerHPESet;

    /**
     * The default value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerIP()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT1_POWER_IP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft1PowerIP() <em>Shaft1 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerIP()
     * @generated
     * @ordered
     */
    protected Float shaft1PowerIP = SHAFT1_POWER_IP_EDEFAULT;

    /**
     * This is true if the Shaft1 Power IP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft1PowerIPESet;

    /**
     * The default value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerLP1()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT1_POWER_LP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft1PowerLP1() <em>Shaft1 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerLP1()
     * @generated
     * @ordered
     */
    protected Float shaft1PowerLP1 = SHAFT1_POWER_LP1_EDEFAULT;

    /**
     * This is true if the Shaft1 Power LP1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft1PowerLP1ESet;

    /**
     * The default value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerLP2()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT1_POWER_LP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft1PowerLP2() <em>Shaft1 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft1PowerLP2()
     * @generated
     * @ordered
     */
    protected Float shaft1PowerLP2 = SHAFT1_POWER_LP2_EDEFAULT;

    /**
     * This is true if the Shaft1 Power LP2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft1PowerLP2ESet;

    /**
     * The default value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerHP()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT2_POWER_HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft2PowerHP() <em>Shaft2 Power HP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerHP()
     * @generated
     * @ordered
     */
    protected Float shaft2PowerHP = SHAFT2_POWER_HP_EDEFAULT;

    /**
     * This is true if the Shaft2 Power HP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft2PowerHPESet;

    /**
     * The default value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerIP()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT2_POWER_IP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft2PowerIP() <em>Shaft2 Power IP</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerIP()
     * @generated
     * @ordered
     */
    protected Float shaft2PowerIP = SHAFT2_POWER_IP_EDEFAULT;

    /**
     * This is true if the Shaft2 Power IP attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft2PowerIPESet;

    /**
     * The default value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerLP1()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT2_POWER_LP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft2PowerLP1() <em>Shaft2 Power LP1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerLP1()
     * @generated
     * @ordered
     */
    protected Float shaft2PowerLP1 = SHAFT2_POWER_LP1_EDEFAULT;

    /**
     * This is true if the Shaft2 Power LP1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft2PowerLP1ESet;

    /**
     * The default value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerLP2()
     * @generated
     * @ordered
     */
    protected static final Float SHAFT2_POWER_LP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShaft2PowerLP2() <em>Shaft2 Power LP2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShaft2PowerLP2()
     * @generated
     * @ordered
     */
    protected Float shaft2PowerLP2 = SHAFT2_POWER_LP2_EDEFAULT;

    /**
     * This is true if the Shaft2 Power LP2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shaft2PowerLP2ESet;

    /**
     * The default value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamChestTC()
     * @generated
     * @ordered
     */
    protected static final Float STEAM_CHEST_TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSteamChestTC() <em>Steam Chest TC</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamChestTC()
     * @generated
     * @ordered
     */
    protected Float steamChestTC = STEAM_CHEST_TC_EDEFAULT;

    /**
     * This is true if the Steam Chest TC attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamChestTCESet;

    /**
     * The cached value of the '{@link #getSteamSupplys() <em>Steam Supplys</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSupplys()
     * @generated
     * @ordered
     */
    protected EList< SteamSupply > steamSupplys;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SteamTurbineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSteamTurbine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCrossoverTC() {
        return crossoverTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCrossoverTC( Float newCrossoverTC ) {
        Float oldCrossoverTC = crossoverTC;
        crossoverTC = newCrossoverTC;
        boolean oldCrossoverTCESet = crossoverTCESet;
        crossoverTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__CROSSOVER_TC, oldCrossoverTC, crossoverTC, !oldCrossoverTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCrossoverTC() {
        Float oldCrossoverTC = crossoverTC;
        boolean oldCrossoverTCESet = crossoverTCESet;
        crossoverTC = CROSSOVER_TC_EDEFAULT;
        crossoverTCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STEAM_TURBINE__CROSSOVER_TC, oldCrossoverTC, CROSSOVER_TC_EDEFAULT, oldCrossoverTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrossoverTC() {
        return crossoverTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReheater1TC() {
        return reheater1TC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReheater1TC( Float newReheater1TC ) {
        Float oldReheater1TC = reheater1TC;
        reheater1TC = newReheater1TC;
        boolean oldReheater1TCESet = reheater1TCESet;
        reheater1TCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__REHEATER1_TC, oldReheater1TC, reheater1TC, !oldReheater1TCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReheater1TC() {
        Float oldReheater1TC = reheater1TC;
        boolean oldReheater1TCESet = reheater1TCESet;
        reheater1TC = REHEATER1_TC_EDEFAULT;
        reheater1TCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STEAM_TURBINE__REHEATER1_TC, oldReheater1TC, REHEATER1_TC_EDEFAULT, oldReheater1TCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReheater1TC() {
        return reheater1TCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getReheater2TC() {
        return reheater2TC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReheater2TC( Float newReheater2TC ) {
        Float oldReheater2TC = reheater2TC;
        reheater2TC = newReheater2TC;
        boolean oldReheater2TCESet = reheater2TCESet;
        reheater2TCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__REHEATER2_TC, oldReheater2TC, reheater2TC, !oldReheater2TCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReheater2TC() {
        Float oldReheater2TC = reheater2TC;
        boolean oldReheater2TCESet = reheater2TCESet;
        reheater2TC = REHEATER2_TC_EDEFAULT;
        reheater2TCESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.STEAM_TURBINE__REHEATER2_TC, oldReheater2TC, REHEATER2_TC_EDEFAULT, oldReheater2TCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReheater2TC() {
        return reheater2TCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft1PowerHP() {
        return shaft1PowerHP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft1PowerHP( Float newShaft1PowerHP ) {
        Float oldShaft1PowerHP = shaft1PowerHP;
        shaft1PowerHP = newShaft1PowerHP;
        boolean oldShaft1PowerHPESet = shaft1PowerHPESet;
        shaft1PowerHPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP, oldShaft1PowerHP, shaft1PowerHP, !oldShaft1PowerHPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft1PowerHP() {
        Float oldShaft1PowerHP = shaft1PowerHP;
        boolean oldShaft1PowerHPESet = shaft1PowerHPESet;
        shaft1PowerHP = SHAFT1_POWER_HP_EDEFAULT;
        shaft1PowerHPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP,
                    oldShaft1PowerHP, SHAFT1_POWER_HP_EDEFAULT, oldShaft1PowerHPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft1PowerHP() {
        return shaft1PowerHPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft1PowerIP() {
        return shaft1PowerIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft1PowerIP( Float newShaft1PowerIP ) {
        Float oldShaft1PowerIP = shaft1PowerIP;
        shaft1PowerIP = newShaft1PowerIP;
        boolean oldShaft1PowerIPESet = shaft1PowerIPESet;
        shaft1PowerIPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP, oldShaft1PowerIP, shaft1PowerIP, !oldShaft1PowerIPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft1PowerIP() {
        Float oldShaft1PowerIP = shaft1PowerIP;
        boolean oldShaft1PowerIPESet = shaft1PowerIPESet;
        shaft1PowerIP = SHAFT1_POWER_IP_EDEFAULT;
        shaft1PowerIPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP,
                    oldShaft1PowerIP, SHAFT1_POWER_IP_EDEFAULT, oldShaft1PowerIPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft1PowerIP() {
        return shaft1PowerIPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft1PowerLP1() {
        return shaft1PowerLP1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft1PowerLP1( Float newShaft1PowerLP1 ) {
        Float oldShaft1PowerLP1 = shaft1PowerLP1;
        shaft1PowerLP1 = newShaft1PowerLP1;
        boolean oldShaft1PowerLP1ESet = shaft1PowerLP1ESet;
        shaft1PowerLP1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1,
                    oldShaft1PowerLP1, shaft1PowerLP1, !oldShaft1PowerLP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft1PowerLP1() {
        Float oldShaft1PowerLP1 = shaft1PowerLP1;
        boolean oldShaft1PowerLP1ESet = shaft1PowerLP1ESet;
        shaft1PowerLP1 = SHAFT1_POWER_LP1_EDEFAULT;
        shaft1PowerLP1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1,
                    oldShaft1PowerLP1, SHAFT1_POWER_LP1_EDEFAULT, oldShaft1PowerLP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft1PowerLP1() {
        return shaft1PowerLP1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft1PowerLP2() {
        return shaft1PowerLP2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft1PowerLP2( Float newShaft1PowerLP2 ) {
        Float oldShaft1PowerLP2 = shaft1PowerLP2;
        shaft1PowerLP2 = newShaft1PowerLP2;
        boolean oldShaft1PowerLP2ESet = shaft1PowerLP2ESet;
        shaft1PowerLP2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2,
                    oldShaft1PowerLP2, shaft1PowerLP2, !oldShaft1PowerLP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft1PowerLP2() {
        Float oldShaft1PowerLP2 = shaft1PowerLP2;
        boolean oldShaft1PowerLP2ESet = shaft1PowerLP2ESet;
        shaft1PowerLP2 = SHAFT1_POWER_LP2_EDEFAULT;
        shaft1PowerLP2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2,
                    oldShaft1PowerLP2, SHAFT1_POWER_LP2_EDEFAULT, oldShaft1PowerLP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft1PowerLP2() {
        return shaft1PowerLP2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft2PowerHP() {
        return shaft2PowerHP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft2PowerHP( Float newShaft2PowerHP ) {
        Float oldShaft2PowerHP = shaft2PowerHP;
        shaft2PowerHP = newShaft2PowerHP;
        boolean oldShaft2PowerHPESet = shaft2PowerHPESet;
        shaft2PowerHPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP, oldShaft2PowerHP, shaft2PowerHP, !oldShaft2PowerHPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft2PowerHP() {
        Float oldShaft2PowerHP = shaft2PowerHP;
        boolean oldShaft2PowerHPESet = shaft2PowerHPESet;
        shaft2PowerHP = SHAFT2_POWER_HP_EDEFAULT;
        shaft2PowerHPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP,
                    oldShaft2PowerHP, SHAFT2_POWER_HP_EDEFAULT, oldShaft2PowerHPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft2PowerHP() {
        return shaft2PowerHPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft2PowerIP() {
        return shaft2PowerIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft2PowerIP( Float newShaft2PowerIP ) {
        Float oldShaft2PowerIP = shaft2PowerIP;
        shaft2PowerIP = newShaft2PowerIP;
        boolean oldShaft2PowerIPESet = shaft2PowerIPESet;
        shaft2PowerIPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP, oldShaft2PowerIP, shaft2PowerIP, !oldShaft2PowerIPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft2PowerIP() {
        Float oldShaft2PowerIP = shaft2PowerIP;
        boolean oldShaft2PowerIPESet = shaft2PowerIPESet;
        shaft2PowerIP = SHAFT2_POWER_IP_EDEFAULT;
        shaft2PowerIPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP,
                    oldShaft2PowerIP, SHAFT2_POWER_IP_EDEFAULT, oldShaft2PowerIPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft2PowerIP() {
        return shaft2PowerIPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft2PowerLP1() {
        return shaft2PowerLP1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft2PowerLP1( Float newShaft2PowerLP1 ) {
        Float oldShaft2PowerLP1 = shaft2PowerLP1;
        shaft2PowerLP1 = newShaft2PowerLP1;
        boolean oldShaft2PowerLP1ESet = shaft2PowerLP1ESet;
        shaft2PowerLP1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1,
                    oldShaft2PowerLP1, shaft2PowerLP1, !oldShaft2PowerLP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft2PowerLP1() {
        Float oldShaft2PowerLP1 = shaft2PowerLP1;
        boolean oldShaft2PowerLP1ESet = shaft2PowerLP1ESet;
        shaft2PowerLP1 = SHAFT2_POWER_LP1_EDEFAULT;
        shaft2PowerLP1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1,
                    oldShaft2PowerLP1, SHAFT2_POWER_LP1_EDEFAULT, oldShaft2PowerLP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft2PowerLP1() {
        return shaft2PowerLP1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShaft2PowerLP2() {
        return shaft2PowerLP2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShaft2PowerLP2( Float newShaft2PowerLP2 ) {
        Float oldShaft2PowerLP2 = shaft2PowerLP2;
        shaft2PowerLP2 = newShaft2PowerLP2;
        boolean oldShaft2PowerLP2ESet = shaft2PowerLP2ESet;
        shaft2PowerLP2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2,
                    oldShaft2PowerLP2, shaft2PowerLP2, !oldShaft2PowerLP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShaft2PowerLP2() {
        Float oldShaft2PowerLP2 = shaft2PowerLP2;
        boolean oldShaft2PowerLP2ESet = shaft2PowerLP2ESet;
        shaft2PowerLP2 = SHAFT2_POWER_LP2_EDEFAULT;
        shaft2PowerLP2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2,
                    oldShaft2PowerLP2, SHAFT2_POWER_LP2_EDEFAULT, oldShaft2PowerLP2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShaft2PowerLP2() {
        return shaft2PowerLP2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSteamChestTC() {
        return steamChestTC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSteamChestTC( Float newSteamChestTC ) {
        Float oldSteamChestTC = steamChestTC;
        steamChestTC = newSteamChestTC;
        boolean oldSteamChestTCESet = steamChestTCESet;
        steamChestTCESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.STEAM_TURBINE__STEAM_CHEST_TC, oldSteamChestTC, steamChestTC, !oldSteamChestTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamChestTC() {
        Float oldSteamChestTC = steamChestTC;
        boolean oldSteamChestTCESet = steamChestTCESet;
        steamChestTC = STEAM_CHEST_TC_EDEFAULT;
        steamChestTCESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STEAM_TURBINE__STEAM_CHEST_TC,
                    oldSteamChestTC, STEAM_CHEST_TC_EDEFAULT, oldSteamChestTCESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamChestTC() {
        return steamChestTCESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SteamSupply > getSteamSupplys() {
        if( steamSupplys == null ) {
            steamSupplys = new EObjectWithInverseEList.Unsettable.ManyInverse< SteamSupply >( SteamSupply.class, this,
                    CimPackage.STEAM_TURBINE__STEAM_SUPPLYS, CimPackage.STEAM_SUPPLY__STEAM_TURBINES );
        }
        return steamSupplys;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSteamSupplys() {
        if( steamSupplys != null ) ( ( InternalEList.Unsettable< ? > ) steamSupplys ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamSupplys() {
        return steamSupplys != null && ( ( InternalEList.Unsettable< ? > ) steamSupplys ).isSet();
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
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSteamSupplys() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            return ( ( InternalEList< ? > ) getSteamSupplys() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.STEAM_TURBINE__CROSSOVER_TC:
            return getCrossoverTC();
        case CimPackage.STEAM_TURBINE__REHEATER1_TC:
            return getReheater1TC();
        case CimPackage.STEAM_TURBINE__REHEATER2_TC:
            return getReheater2TC();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
            return getShaft1PowerHP();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
            return getShaft1PowerIP();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
            return getShaft1PowerLP1();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
            return getShaft1PowerLP2();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
            return getShaft2PowerHP();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
            return getShaft2PowerIP();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
            return getShaft2PowerLP1();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
            return getShaft2PowerLP2();
        case CimPackage.STEAM_TURBINE__STEAM_CHEST_TC:
            return getSteamChestTC();
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            return getSteamSupplys();
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
        case CimPackage.STEAM_TURBINE__CROSSOVER_TC:
            setCrossoverTC( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__REHEATER1_TC:
            setReheater1TC( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__REHEATER2_TC:
            setReheater2TC( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
            setShaft1PowerHP( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
            setShaft1PowerIP( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
            setShaft1PowerLP1( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
            setShaft1PowerLP2( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
            setShaft2PowerHP( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
            setShaft2PowerIP( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
            setShaft2PowerLP1( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
            setShaft2PowerLP2( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__STEAM_CHEST_TC:
            setSteamChestTC( ( Float ) newValue );
            return;
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            getSteamSupplys().clear();
            getSteamSupplys().addAll( ( Collection< ? extends SteamSupply > ) newValue );
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
        case CimPackage.STEAM_TURBINE__CROSSOVER_TC:
            unsetCrossoverTC();
            return;
        case CimPackage.STEAM_TURBINE__REHEATER1_TC:
            unsetReheater1TC();
            return;
        case CimPackage.STEAM_TURBINE__REHEATER2_TC:
            unsetReheater2TC();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
            unsetShaft1PowerHP();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
            unsetShaft1PowerIP();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
            unsetShaft1PowerLP1();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
            unsetShaft1PowerLP2();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
            unsetShaft2PowerHP();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
            unsetShaft2PowerIP();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
            unsetShaft2PowerLP1();
            return;
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
            unsetShaft2PowerLP2();
            return;
        case CimPackage.STEAM_TURBINE__STEAM_CHEST_TC:
            unsetSteamChestTC();
            return;
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            unsetSteamSupplys();
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
        case CimPackage.STEAM_TURBINE__CROSSOVER_TC:
            return isSetCrossoverTC();
        case CimPackage.STEAM_TURBINE__REHEATER1_TC:
            return isSetReheater1TC();
        case CimPackage.STEAM_TURBINE__REHEATER2_TC:
            return isSetReheater2TC();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_HP:
            return isSetShaft1PowerHP();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_IP:
            return isSetShaft1PowerIP();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP1:
            return isSetShaft1PowerLP1();
        case CimPackage.STEAM_TURBINE__SHAFT1_POWER_LP2:
            return isSetShaft1PowerLP2();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_HP:
            return isSetShaft2PowerHP();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_IP:
            return isSetShaft2PowerIP();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP1:
            return isSetShaft2PowerLP1();
        case CimPackage.STEAM_TURBINE__SHAFT2_POWER_LP2:
            return isSetShaft2PowerLP2();
        case CimPackage.STEAM_TURBINE__STEAM_CHEST_TC:
            return isSetSteamChestTC();
        case CimPackage.STEAM_TURBINE__STEAM_SUPPLYS:
            return isSetSteamSupplys();
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
        result.append( " (crossoverTC: " );
        if( crossoverTCESet )
            result.append( crossoverTC );
        else
            result.append( "<unset>" );
        result.append( ", reheater1TC: " );
        if( reheater1TCESet )
            result.append( reheater1TC );
        else
            result.append( "<unset>" );
        result.append( ", reheater2TC: " );
        if( reheater2TCESet )
            result.append( reheater2TC );
        else
            result.append( "<unset>" );
        result.append( ", shaft1PowerHP: " );
        if( shaft1PowerHPESet )
            result.append( shaft1PowerHP );
        else
            result.append( "<unset>" );
        result.append( ", shaft1PowerIP: " );
        if( shaft1PowerIPESet )
            result.append( shaft1PowerIP );
        else
            result.append( "<unset>" );
        result.append( ", shaft1PowerLP1: " );
        if( shaft1PowerLP1ESet )
            result.append( shaft1PowerLP1 );
        else
            result.append( "<unset>" );
        result.append( ", shaft1PowerLP2: " );
        if( shaft1PowerLP2ESet )
            result.append( shaft1PowerLP2 );
        else
            result.append( "<unset>" );
        result.append( ", shaft2PowerHP: " );
        if( shaft2PowerHPESet )
            result.append( shaft2PowerHP );
        else
            result.append( "<unset>" );
        result.append( ", shaft2PowerIP: " );
        if( shaft2PowerIPESet )
            result.append( shaft2PowerIP );
        else
            result.append( "<unset>" );
        result.append( ", shaft2PowerLP1: " );
        if( shaft2PowerLP1ESet )
            result.append( shaft2PowerLP1 );
        else
            result.append( "<unset>" );
        result.append( ", shaft2PowerLP2: " );
        if( shaft2PowerLP2ESet )
            result.append( shaft2PowerLP2 );
        else
            result.append( "<unset>" );
        result.append( ", steamChestTC: " );
        if( steamChestTCESet )
            result.append( steamChestTC );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SteamTurbineImpl
