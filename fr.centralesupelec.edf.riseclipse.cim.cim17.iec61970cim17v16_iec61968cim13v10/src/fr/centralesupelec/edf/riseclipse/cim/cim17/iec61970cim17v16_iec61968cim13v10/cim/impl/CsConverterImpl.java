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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsConverter;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsOperatingModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CsPpccControlKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cs Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMaxAlpha <em>Max Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMaxGamma <em>Max Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMaxIdc <em>Max Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMinAlpha <em>Min Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMinGamma <em>Min Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getMinIdc <em>Min Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getRatedIdc <em>Rated Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getTargetAlpha <em>Target Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getTargetGamma <em>Target Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CsConverterImpl#getTargetIdc <em>Target Idc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CsConverterImpl extends ACDCConverterImpl implements CsConverter {
    /**
     * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected static final Float ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected Float alpha = ALPHA_EDEFAULT;

    /**
     * This is true if the Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alphaESet;

    /**
     * The default value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGamma()
     * @generated
     * @ordered
     */
    protected static final Float GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGamma()
     * @generated
     * @ordered
     */
    protected Float gamma = GAMMA_EDEFAULT;

    /**
     * This is true if the Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gammaESet;

    /**
     * The default value of the '{@link #getMaxAlpha() <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAlpha()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAlpha() <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAlpha()
     * @generated
     * @ordered
     */
    protected Float maxAlpha = MAX_ALPHA_EDEFAULT;

    /**
     * This is true if the Max Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAlphaESet;

    /**
     * The default value of the '{@link #getMaxGamma() <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGamma()
     * @generated
     * @ordered
     */
    protected static final Float MAX_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxGamma() <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGamma()
     * @generated
     * @ordered
     */
    protected Float maxGamma = MAX_GAMMA_EDEFAULT;

    /**
     * This is true if the Max Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxGammaESet;

    /**
     * The default value of the '{@link #getMaxIdc() <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIdc()
     * @generated
     * @ordered
     */
    protected static final Float MAX_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxIdc() <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIdc()
     * @generated
     * @ordered
     */
    protected Float maxIdc = MAX_IDC_EDEFAULT;

    /**
     * This is true if the Max Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxIdcESet;

    /**
     * The default value of the '{@link #getMinAlpha() <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAlpha()
     * @generated
     * @ordered
     */
    protected static final Float MIN_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinAlpha() <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAlpha()
     * @generated
     * @ordered
     */
    protected Float minAlpha = MIN_ALPHA_EDEFAULT;

    /**
     * This is true if the Min Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minAlphaESet;

    /**
     * The default value of the '{@link #getMinGamma() <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinGamma()
     * @generated
     * @ordered
     */
    protected static final Float MIN_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinGamma() <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinGamma()
     * @generated
     * @ordered
     */
    protected Float minGamma = MIN_GAMMA_EDEFAULT;

    /**
     * This is true if the Min Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minGammaESet;

    /**
     * The default value of the '{@link #getMinIdc() <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIdc()
     * @generated
     * @ordered
     */
    protected static final Float MIN_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinIdc() <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIdc()
     * @generated
     * @ordered
     */
    protected Float minIdc = MIN_IDC_EDEFAULT;

    /**
     * This is true if the Min Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minIdcESet;

    /**
     * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected static final CsOperatingModeKind OPERATING_MODE_EDEFAULT = CsOperatingModeKind.INVERTER;

    /**
     * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected CsOperatingModeKind operatingMode = OPERATING_MODE_EDEFAULT;

    /**
     * This is true if the Operating Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingModeESet;

    /**
     * The default value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected static final CsPpccControlKind PPCC_CONTROL_EDEFAULT = CsPpccControlKind.ACTIVE_POWER;

    /**
     * The cached value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected CsPpccControlKind pPccControl = PPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the PPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pPccControlESet;

    /**
     * The default value of the '{@link #getRatedIdc() <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedIdc()
     * @generated
     * @ordered
     */
    protected static final Float RATED_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedIdc() <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedIdc()
     * @generated
     * @ordered
     */
    protected Float ratedIdc = RATED_IDC_EDEFAULT;

    /**
     * This is true if the Rated Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedIdcESet;

    /**
     * The default value of the '{@link #getTargetAlpha() <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetAlpha()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetAlpha() <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetAlpha()
     * @generated
     * @ordered
     */
    protected Float targetAlpha = TARGET_ALPHA_EDEFAULT;

    /**
     * This is true if the Target Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetAlphaESet;

    /**
     * The default value of the '{@link #getTargetGamma() <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetGamma()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetGamma() <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetGamma()
     * @generated
     * @ordered
     */
    protected Float targetGamma = TARGET_GAMMA_EDEFAULT;

    /**
     * This is true if the Target Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetGammaESet;

    /**
     * The default value of the '{@link #getTargetIdc() <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetIdc()
     * @generated
     * @ordered
     */
    protected static final Float TARGET_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetIdc() <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetIdc()
     * @generated
     * @ordered
     */
    protected Float targetIdc = TARGET_IDC_EDEFAULT;

    /**
     * This is true if the Target Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetIdcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CsConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCsConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAlpha() {
        return alpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlpha( Float newAlpha ) {
        Float oldAlpha = alpha;
        alpha = newAlpha;
        boolean oldAlphaESet = alphaESet;
        alphaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__ALPHA, oldAlpha, alpha, !oldAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlpha() {
        Float oldAlpha = alpha;
        boolean oldAlphaESet = alphaESet;
        alpha = ALPHA_EDEFAULT;
        alphaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__ALPHA, oldAlpha, ALPHA_EDEFAULT, oldAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlpha() {
        return alphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGamma() {
        return gamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGamma( Float newGamma ) {
        Float oldGamma = gamma;
        gamma = newGamma;
        boolean oldGammaESet = gammaESet;
        gammaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__GAMMA, oldGamma, gamma, !oldGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGamma() {
        Float oldGamma = gamma;
        boolean oldGammaESet = gammaESet;
        gamma = GAMMA_EDEFAULT;
        gammaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__GAMMA, oldGamma, GAMMA_EDEFAULT, oldGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGamma() {
        return gammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxAlpha() {
        return maxAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAlpha( Float newMaxAlpha ) {
        Float oldMaxAlpha = maxAlpha;
        maxAlpha = newMaxAlpha;
        boolean oldMaxAlphaESet = maxAlphaESet;
        maxAlphaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MAX_ALPHA, oldMaxAlpha, maxAlpha, !oldMaxAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAlpha() {
        Float oldMaxAlpha = maxAlpha;
        boolean oldMaxAlphaESet = maxAlphaESet;
        maxAlpha = MAX_ALPHA_EDEFAULT;
        maxAlphaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MAX_ALPHA, oldMaxAlpha, MAX_ALPHA_EDEFAULT, oldMaxAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAlpha() {
        return maxAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxGamma() {
        return maxGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxGamma( Float newMaxGamma ) {
        Float oldMaxGamma = maxGamma;
        maxGamma = newMaxGamma;
        boolean oldMaxGammaESet = maxGammaESet;
        maxGammaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MAX_GAMMA, oldMaxGamma, maxGamma, !oldMaxGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxGamma() {
        Float oldMaxGamma = maxGamma;
        boolean oldMaxGammaESet = maxGammaESet;
        maxGamma = MAX_GAMMA_EDEFAULT;
        maxGammaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MAX_GAMMA, oldMaxGamma, MAX_GAMMA_EDEFAULT, oldMaxGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxGamma() {
        return maxGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxIdc() {
        return maxIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxIdc( Float newMaxIdc ) {
        Float oldMaxIdc = maxIdc;
        maxIdc = newMaxIdc;
        boolean oldMaxIdcESet = maxIdcESet;
        maxIdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MAX_IDC, oldMaxIdc, maxIdc, !oldMaxIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxIdc() {
        Float oldMaxIdc = maxIdc;
        boolean oldMaxIdcESet = maxIdcESet;
        maxIdc = MAX_IDC_EDEFAULT;
        maxIdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MAX_IDC, oldMaxIdc, MAX_IDC_EDEFAULT, oldMaxIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxIdc() {
        return maxIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinAlpha() {
        return minAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinAlpha( Float newMinAlpha ) {
        Float oldMinAlpha = minAlpha;
        minAlpha = newMinAlpha;
        boolean oldMinAlphaESet = minAlphaESet;
        minAlphaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MIN_ALPHA, oldMinAlpha, minAlpha, !oldMinAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinAlpha() {
        Float oldMinAlpha = minAlpha;
        boolean oldMinAlphaESet = minAlphaESet;
        minAlpha = MIN_ALPHA_EDEFAULT;
        minAlphaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MIN_ALPHA, oldMinAlpha, MIN_ALPHA_EDEFAULT, oldMinAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinAlpha() {
        return minAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinGamma() {
        return minGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinGamma( Float newMinGamma ) {
        Float oldMinGamma = minGamma;
        minGamma = newMinGamma;
        boolean oldMinGammaESet = minGammaESet;
        minGammaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MIN_GAMMA, oldMinGamma, minGamma, !oldMinGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinGamma() {
        Float oldMinGamma = minGamma;
        boolean oldMinGammaESet = minGammaESet;
        minGamma = MIN_GAMMA_EDEFAULT;
        minGammaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MIN_GAMMA, oldMinGamma, MIN_GAMMA_EDEFAULT, oldMinGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinGamma() {
        return minGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinIdc() {
        return minIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinIdc( Float newMinIdc ) {
        Float oldMinIdc = minIdc;
        minIdc = newMinIdc;
        boolean oldMinIdcESet = minIdcESet;
        minIdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__MIN_IDC, oldMinIdc, minIdc, !oldMinIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinIdc() {
        Float oldMinIdc = minIdc;
        boolean oldMinIdcESet = minIdcESet;
        minIdc = MIN_IDC_EDEFAULT;
        minIdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__MIN_IDC, oldMinIdc, MIN_IDC_EDEFAULT, oldMinIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinIdc() {
        return minIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsOperatingModeKind getOperatingMode() {
        return operatingMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperatingMode( CsOperatingModeKind newOperatingMode ) {
        CsOperatingModeKind oldOperatingMode = operatingMode;
        operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingModeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__OPERATING_MODE, oldOperatingMode, operatingMode, !oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatingMode() {
        CsOperatingModeKind oldOperatingMode = operatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingMode = OPERATING_MODE_EDEFAULT;
        operatingModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__OPERATING_MODE,
                    oldOperatingMode, OPERATING_MODE_EDEFAULT, oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingMode() {
        return operatingModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsPpccControlKind getPPccControl() {
        return pPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPPccControl( CsPpccControlKind newPPccControl ) {
        CsPpccControlKind oldPPccControl = pPccControl;
        pPccControl = newPPccControl == null ? PPCC_CONTROL_EDEFAULT : newPPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControlESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__PPCC_CONTROL, oldPPccControl, pPccControl, !oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPPccControl() {
        CsPpccControlKind oldPPccControl = pPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControl = PPCC_CONTROL_EDEFAULT;
        pPccControlESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__PPCC_CONTROL, oldPPccControl, PPCC_CONTROL_EDEFAULT, oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPPccControl() {
        return pPccControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedIdc() {
        return ratedIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedIdc( Float newRatedIdc ) {
        Float oldRatedIdc = ratedIdc;
        ratedIdc = newRatedIdc;
        boolean oldRatedIdcESet = ratedIdcESet;
        ratedIdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__RATED_IDC, oldRatedIdc, ratedIdc, !oldRatedIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedIdc() {
        Float oldRatedIdc = ratedIdc;
        boolean oldRatedIdcESet = ratedIdcESet;
        ratedIdc = RATED_IDC_EDEFAULT;
        ratedIdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__RATED_IDC, oldRatedIdc, RATED_IDC_EDEFAULT, oldRatedIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedIdc() {
        return ratedIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetAlpha() {
        return targetAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetAlpha( Float newTargetAlpha ) {
        Float oldTargetAlpha = targetAlpha;
        targetAlpha = newTargetAlpha;
        boolean oldTargetAlphaESet = targetAlphaESet;
        targetAlphaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__TARGET_ALPHA, oldTargetAlpha, targetAlpha, !oldTargetAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetAlpha() {
        Float oldTargetAlpha = targetAlpha;
        boolean oldTargetAlphaESet = targetAlphaESet;
        targetAlpha = TARGET_ALPHA_EDEFAULT;
        targetAlphaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__TARGET_ALPHA, oldTargetAlpha, TARGET_ALPHA_EDEFAULT, oldTargetAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetAlpha() {
        return targetAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetGamma() {
        return targetGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetGamma( Float newTargetGamma ) {
        Float oldTargetGamma = targetGamma;
        targetGamma = newTargetGamma;
        boolean oldTargetGammaESet = targetGammaESet;
        targetGammaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__TARGET_GAMMA, oldTargetGamma, targetGamma, !oldTargetGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetGamma() {
        Float oldTargetGamma = targetGamma;
        boolean oldTargetGammaESet = targetGammaESet;
        targetGamma = TARGET_GAMMA_EDEFAULT;
        targetGammaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__TARGET_GAMMA, oldTargetGamma, TARGET_GAMMA_EDEFAULT, oldTargetGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetGamma() {
        return targetGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTargetIdc() {
        return targetIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetIdc( Float newTargetIdc ) {
        Float oldTargetIdc = targetIdc;
        targetIdc = newTargetIdc;
        boolean oldTargetIdcESet = targetIdcESet;
        targetIdcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.CS_CONVERTER__TARGET_IDC, oldTargetIdc, targetIdc, !oldTargetIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetIdc() {
        Float oldTargetIdc = targetIdc;
        boolean oldTargetIdcESet = targetIdcESet;
        targetIdc = TARGET_IDC_EDEFAULT;
        targetIdcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.CS_CONVERTER__TARGET_IDC, oldTargetIdc, TARGET_IDC_EDEFAULT, oldTargetIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetIdc() {
        return targetIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CS_CONVERTER__ALPHA:
            return getAlpha();
        case CimPackage.CS_CONVERTER__GAMMA:
            return getGamma();
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            return getMaxAlpha();
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            return getMaxGamma();
        case CimPackage.CS_CONVERTER__MAX_IDC:
            return getMaxIdc();
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            return getMinAlpha();
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            return getMinGamma();
        case CimPackage.CS_CONVERTER__MIN_IDC:
            return getMinIdc();
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            return getOperatingMode();
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            return getPPccControl();
        case CimPackage.CS_CONVERTER__RATED_IDC:
            return getRatedIdc();
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            return getTargetAlpha();
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            return getTargetGamma();
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            return getTargetIdc();
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
        case CimPackage.CS_CONVERTER__ALPHA:
            setAlpha( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__GAMMA:
            setGamma( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            setMaxAlpha( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            setMaxGamma( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_IDC:
            setMaxIdc( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            setMinAlpha( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            setMinGamma( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_IDC:
            setMinIdc( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            setOperatingMode( ( CsOperatingModeKind ) newValue );
            return;
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            setPPccControl( ( CsPpccControlKind ) newValue );
            return;
        case CimPackage.CS_CONVERTER__RATED_IDC:
            setRatedIdc( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            setTargetAlpha( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            setTargetGamma( ( Float ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            setTargetIdc( ( Float ) newValue );
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
        case CimPackage.CS_CONVERTER__ALPHA:
            unsetAlpha();
            return;
        case CimPackage.CS_CONVERTER__GAMMA:
            unsetGamma();
            return;
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            unsetMaxAlpha();
            return;
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            unsetMaxGamma();
            return;
        case CimPackage.CS_CONVERTER__MAX_IDC:
            unsetMaxIdc();
            return;
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            unsetMinAlpha();
            return;
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            unsetMinGamma();
            return;
        case CimPackage.CS_CONVERTER__MIN_IDC:
            unsetMinIdc();
            return;
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            unsetOperatingMode();
            return;
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            unsetPPccControl();
            return;
        case CimPackage.CS_CONVERTER__RATED_IDC:
            unsetRatedIdc();
            return;
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            unsetTargetAlpha();
            return;
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            unsetTargetGamma();
            return;
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            unsetTargetIdc();
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
        case CimPackage.CS_CONVERTER__ALPHA:
            return isSetAlpha();
        case CimPackage.CS_CONVERTER__GAMMA:
            return isSetGamma();
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            return isSetMaxAlpha();
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            return isSetMaxGamma();
        case CimPackage.CS_CONVERTER__MAX_IDC:
            return isSetMaxIdc();
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            return isSetMinAlpha();
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            return isSetMinGamma();
        case CimPackage.CS_CONVERTER__MIN_IDC:
            return isSetMinIdc();
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            return isSetOperatingMode();
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            return isSetPPccControl();
        case CimPackage.CS_CONVERTER__RATED_IDC:
            return isSetRatedIdc();
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            return isSetTargetAlpha();
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            return isSetTargetGamma();
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            return isSetTargetIdc();
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
        result.append( " (alpha: " );
        if( alphaESet )
            result.append( alpha );
        else
            result.append( "<unset>" );
        result.append( ", gamma: " );
        if( gammaESet )
            result.append( gamma );
        else
            result.append( "<unset>" );
        result.append( ", maxAlpha: " );
        if( maxAlphaESet )
            result.append( maxAlpha );
        else
            result.append( "<unset>" );
        result.append( ", maxGamma: " );
        if( maxGammaESet )
            result.append( maxGamma );
        else
            result.append( "<unset>" );
        result.append( ", maxIdc: " );
        if( maxIdcESet )
            result.append( maxIdc );
        else
            result.append( "<unset>" );
        result.append( ", minAlpha: " );
        if( minAlphaESet )
            result.append( minAlpha );
        else
            result.append( "<unset>" );
        result.append( ", minGamma: " );
        if( minGammaESet )
            result.append( minGamma );
        else
            result.append( "<unset>" );
        result.append( ", minIdc: " );
        if( minIdcESet )
            result.append( minIdc );
        else
            result.append( "<unset>" );
        result.append( ", operatingMode: " );
        if( operatingModeESet )
            result.append( operatingMode );
        else
            result.append( "<unset>" );
        result.append( ", pPccControl: " );
        if( pPccControlESet )
            result.append( pPccControl );
        else
            result.append( "<unset>" );
        result.append( ", ratedIdc: " );
        if( ratedIdcESet )
            result.append( ratedIdc );
        else
            result.append( "<unset>" );
        result.append( ", targetAlpha: " );
        if( targetAlphaESet )
            result.append( targetAlpha );
        else
            result.append( "<unset>" );
        result.append( ", targetGamma: " );
        if( targetGammaESet )
            result.append( targetGamma );
        else
            result.append( "<unset>" );
        result.append( ", targetIdc: " );
        if( targetIdcESet )
            result.append( targetIdc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CsConverterImpl
