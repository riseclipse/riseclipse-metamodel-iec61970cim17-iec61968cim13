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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3IEC;

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
 * An implementation of the model object '<em><b>Wind Cont PType3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getKdtd <em>Kdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getMpuvrt <em>Mpuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getOmegaoffset <em>Omegaoffset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getPdtdmax <em>Pdtdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTdvs <em>Tdvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getThetaemin <em>Thetaemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getThetauscale <em>Thetauscale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTomegafiltp3 <em>Tomegafiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTpfiltp3 <em>Tpfiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTufiltp3 <em>Tufiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getTwref <em>Twref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getUdvs <em>Udvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getUpdip <em>Updip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getWdtd <em>Wdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getZeta <em>Zeta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindContPType3IECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType3IECImpl extends IdentifiedObjectImpl implements WindContPType3IEC {
    /**
     * The default value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected static final Float DPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected Float dpmax = DPMAX_EDEFAULT;

    /**
     * This is true if the Dpmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxESet;

    /**
     * The default value of the '{@link #getDprefmax() <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmax()
     * @generated
     * @ordered
     */
    protected static final Float DPREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDprefmax() <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmax()
     * @generated
     * @ordered
     */
    protected Float dprefmax = DPREFMAX_EDEFAULT;

    /**
     * This is true if the Dprefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dprefmaxESet;

    /**
     * The default value of the '{@link #getDprefmin() <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmin()
     * @generated
     * @ordered
     */
    protected static final Float DPREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDprefmin() <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmin()
     * @generated
     * @ordered
     */
    protected Float dprefmin = DPREFMIN_EDEFAULT;

    /**
     * This is true if the Dprefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dprefminESet;

    /**
     * The default value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected static final Float DTHETAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected Float dthetamax = DTHETAMAX_EDEFAULT;

    /**
     * This is true if the Dthetamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetamaxESet;

    /**
     * The default value of the '{@link #getDthetamaxuvrt() <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamaxuvrt()
     * @generated
     * @ordered
     */
    protected static final Float DTHETAMAXUVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamaxuvrt() <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamaxuvrt()
     * @generated
     * @ordered
     */
    protected Float dthetamaxuvrt = DTHETAMAXUVRT_EDEFAULT;

    /**
     * This is true if the Dthetamaxuvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetamaxuvrtESet;

    /**
     * The default value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected static final Float KDTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected Float kdtd = KDTD_EDEFAULT;

    /**
     * This is true if the Kdtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdtdESet;

    /**
     * The default value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected static final Float KIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected Float kip = KIP_EDEFAULT;

    /**
     * This is true if the Kip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipESet;

    /**
     * The default value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected static final Float KPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected Float kpp = KPP_EDEFAULT;

    /**
     * This is true if the Kpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kppESet;

    /**
     * The default value of the '{@link #getMpuvrt() <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMpuvrt()
     * @generated
     * @ordered
     */
    protected static final Boolean MPUVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMpuvrt() <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMpuvrt()
     * @generated
     * @ordered
     */
    protected Boolean mpuvrt = MPUVRT_EDEFAULT;

    /**
     * This is true if the Mpuvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mpuvrtESet;

    /**
     * The default value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected static final Float OMEGAOFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected Float omegaoffset = OMEGAOFFSET_EDEFAULT;

    /**
     * This is true if the Omegaoffset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegaoffsetESet;

    /**
     * The default value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected static final Float PDTDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected Float pdtdmax = PDTDMAX_EDEFAULT;

    /**
     * This is true if the Pdtdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pdtdmaxESet;

    /**
     * The default value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected static final Float TDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected Float tdvs = TDVS_EDEFAULT;

    /**
     * This is true if the Tdvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdvsESet;

    /**
     * The default value of the '{@link #getThetaemin() <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaemin()
     * @generated
     * @ordered
     */
    protected static final Float THETAEMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetaemin() <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaemin()
     * @generated
     * @ordered
     */
    protected Float thetaemin = THETAEMIN_EDEFAULT;

    /**
     * This is true if the Thetaemin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetaeminESet;

    /**
     * The default value of the '{@link #getThetauscale() <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetauscale()
     * @generated
     * @ordered
     */
    protected static final Float THETAUSCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetauscale() <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetauscale()
     * @generated
     * @ordered
     */
    protected Float thetauscale = THETAUSCALE_EDEFAULT;

    /**
     * This is true if the Thetauscale attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetauscaleESet;

    /**
     * The default value of the '{@link #getTomegafiltp3() <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltp3()
     * @generated
     * @ordered
     */
    protected static final Float TOMEGAFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomegafiltp3() <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltp3()
     * @generated
     * @ordered
     */
    protected Float tomegafiltp3 = TOMEGAFILTP3_EDEFAULT;

    /**
     * This is true if the Tomegafiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomegafiltp3ESet;

    /**
     * The default value of the '{@link #getTpfiltp3() <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltp3()
     * @generated
     * @ordered
     */
    protected static final Float TPFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfiltp3() <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltp3()
     * @generated
     * @ordered
     */
    protected Float tpfiltp3 = TPFILTP3_EDEFAULT;

    /**
     * This is true if the Tpfiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfiltp3ESet;

    /**
     * The default value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected static final Float TPORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected Float tpord = TPORD_EDEFAULT;

    /**
     * This is true if the Tpord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpordESet;

    /**
     * The default value of the '{@link #getTufiltp3() <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp3()
     * @generated
     * @ordered
     */
    protected static final Float TUFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufiltp3() <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp3()
     * @generated
     * @ordered
     */
    protected Float tufiltp3 = TUFILTP3_EDEFAULT;

    /**
     * This is true if the Tufiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltp3ESet;

    /**
     * The default value of the '{@link #getTwref() <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwref()
     * @generated
     * @ordered
     */
    protected static final Float TWREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwref() <em>Twref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwref()
     * @generated
     * @ordered
     */
    protected Float twref = TWREF_EDEFAULT;

    /**
     * This is true if the Twref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twrefESet;

    /**
     * The default value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected static final Float UDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected Float udvs = UDVS_EDEFAULT;

    /**
     * This is true if the Udvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udvsESet;

    /**
     * The default value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected static final Float UPDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected Float updip = UPDIP_EDEFAULT;

    /**
     * This is true if the Updip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean updipESet;

    /**
     * The default value of the '{@link #getWdtd() <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWdtd()
     * @generated
     * @ordered
     */
    protected static final Float WDTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWdtd() <em>Wdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWdtd()
     * @generated
     * @ordered
     */
    protected Float wdtd = WDTD_EDEFAULT;

    /**
     * This is true if the Wdtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean wdtdESet;

    /**
     * The default value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected static final Float ZETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected Float zeta = ZETA_EDEFAULT;

    /**
     * This is true if the Zeta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zetaESet;

    /**
     * The cached value of the '{@link #getWindDynamicsLookupTable() <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindDynamicsLookupTable()
     * @generated
     * @ordered
     */
    protected EList< WindDynamicsLookupTable > windDynamicsLookupTable;

    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType3IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpmax() {
        return dpmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmax( Float newDpmax ) {
        Float oldDpmax = dpmax;
        dpmax = newDpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax, dpmax, !oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmax() {
        Float oldDpmax = dpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmax = DPMAX_EDEFAULT;
        dpmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax, DPMAX_EDEFAULT, oldDpmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmax() {
        return dpmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDprefmax() {
        return dprefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDprefmax( Float newDprefmax ) {
        Float oldDprefmax = dprefmax;
        dprefmax = newDprefmax;
        boolean oldDprefmaxESet = dprefmaxESet;
        dprefmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX, oldDprefmax, dprefmax, !oldDprefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDprefmax() {
        Float oldDprefmax = dprefmax;
        boolean oldDprefmaxESet = dprefmaxESet;
        dprefmax = DPREFMAX_EDEFAULT;
        dprefmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX, oldDprefmax, DPREFMAX_EDEFAULT, oldDprefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDprefmax() {
        return dprefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDprefmin() {
        return dprefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDprefmin( Float newDprefmin ) {
        Float oldDprefmin = dprefmin;
        dprefmin = newDprefmin;
        boolean oldDprefminESet = dprefminESet;
        dprefminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN, oldDprefmin, dprefmin, !oldDprefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDprefmin() {
        Float oldDprefmin = dprefmin;
        boolean oldDprefminESet = dprefminESet;
        dprefmin = DPREFMIN_EDEFAULT;
        dprefminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN, oldDprefmin, DPREFMIN_EDEFAULT, oldDprefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDprefmin() {
        return dprefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDthetamax() {
        return dthetamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamax( Float newDthetamax ) {
        Float oldDthetamax = dthetamax;
        dthetamax = newDthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX, oldDthetamax, dthetamax, !oldDthetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamax() {
        Float oldDthetamax = dthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamax = DTHETAMAX_EDEFAULT;
        dthetamaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX, oldDthetamax, DTHETAMAX_EDEFAULT, oldDthetamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamax() {
        return dthetamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDthetamaxuvrt() {
        return dthetamaxuvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamaxuvrt( Float newDthetamaxuvrt ) {
        Float oldDthetamaxuvrt = dthetamaxuvrt;
        dthetamaxuvrt = newDthetamaxuvrt;
        boolean oldDthetamaxuvrtESet = dthetamaxuvrtESet;
        dthetamaxuvrtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT,
                    oldDthetamaxuvrt, dthetamaxuvrt, !oldDthetamaxuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamaxuvrt() {
        Float oldDthetamaxuvrt = dthetamaxuvrt;
        boolean oldDthetamaxuvrtESet = dthetamaxuvrtESet;
        dthetamaxuvrt = DTHETAMAXUVRT_EDEFAULT;
        dthetamaxuvrtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT,
                    oldDthetamaxuvrt, DTHETAMAXUVRT_EDEFAULT, oldDthetamaxuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamaxuvrt() {
        return dthetamaxuvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKdtd() {
        return kdtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdtd( Float newKdtd ) {
        Float oldKdtd = kdtd;
        kdtd = newKdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd, kdtd, !oldKdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdtd() {
        Float oldKdtd = kdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtd = KDTD_EDEFAULT;
        kdtdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd, KDTD_EDEFAULT, oldKdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdtd() {
        return kdtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKip() {
        return kip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKip( Float newKip ) {
        Float oldKip = kip;
        kip = newKip;
        boolean oldKipESet = kipESet;
        kipESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip, kip, !oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKip() {
        Float oldKip = kip;
        boolean oldKipESet = kipESet;
        kip = KIP_EDEFAULT;
        kipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip, KIP_EDEFAULT, oldKipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKip() {
        return kipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpp() {
        return kpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpp( Float newKpp ) {
        Float oldKpp = kpp;
        kpp = newKpp;
        boolean oldKppESet = kppESet;
        kppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp, kpp, !oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpp() {
        Float oldKpp = kpp;
        boolean oldKppESet = kppESet;
        kpp = KPP_EDEFAULT;
        kppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp, KPP_EDEFAULT, oldKppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpp() {
        return kppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMpuvrt() {
        return mpuvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMpuvrt( Boolean newMpuvrt ) {
        Boolean oldMpuvrt = mpuvrt;
        mpuvrt = newMpuvrt;
        boolean oldMpuvrtESet = mpuvrtESet;
        mpuvrtESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT, oldMpuvrt, mpuvrt, !oldMpuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMpuvrt() {
        Boolean oldMpuvrt = mpuvrt;
        boolean oldMpuvrtESet = mpuvrtESet;
        mpuvrt = MPUVRT_EDEFAULT;
        mpuvrtESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT, oldMpuvrt, MPUVRT_EDEFAULT, oldMpuvrtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMpuvrt() {
        return mpuvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getOmegaoffset() {
        return omegaoffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegaoffset( Float newOmegaoffset ) {
        Float oldOmegaoffset = omegaoffset;
        omegaoffset = newOmegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffsetESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET, oldOmegaoffset, omegaoffset, !oldOmegaoffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegaoffset() {
        Float oldOmegaoffset = omegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffset = OMEGAOFFSET_EDEFAULT;
        omegaoffsetESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET,
                    oldOmegaoffset, OMEGAOFFSET_EDEFAULT, oldOmegaoffsetESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegaoffset() {
        return omegaoffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPdtdmax() {
        return pdtdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPdtdmax( Float newPdtdmax ) {
        Float oldPdtdmax = pdtdmax;
        pdtdmax = newPdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX, oldPdtdmax, pdtdmax, !oldPdtdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPdtdmax() {
        Float oldPdtdmax = pdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmax = PDTDMAX_EDEFAULT;
        pdtdmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX, oldPdtdmax, PDTDMAX_EDEFAULT, oldPdtdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPdtdmax() {
        return pdtdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTdvs() {
        return tdvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdvs( Float newTdvs ) {
        Float oldTdvs = tdvs;
        tdvs = newTdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs, tdvs, !oldTdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdvs() {
        Float oldTdvs = tdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvs = TDVS_EDEFAULT;
        tdvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs, TDVS_EDEFAULT, oldTdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdvs() {
        return tdvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetaemin() {
        return thetaemin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetaemin( Float newThetaemin ) {
        Float oldThetaemin = thetaemin;
        thetaemin = newThetaemin;
        boolean oldThetaeminESet = thetaeminESet;
        thetaeminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN, oldThetaemin, thetaemin, !oldThetaeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetaemin() {
        Float oldThetaemin = thetaemin;
        boolean oldThetaeminESet = thetaeminESet;
        thetaemin = THETAEMIN_EDEFAULT;
        thetaeminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN, oldThetaemin, THETAEMIN_EDEFAULT, oldThetaeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetaemin() {
        return thetaeminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getThetauscale() {
        return thetauscale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetauscale( Float newThetauscale ) {
        Float oldThetauscale = thetauscale;
        thetauscale = newThetauscale;
        boolean oldThetauscaleESet = thetauscaleESet;
        thetauscaleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE, oldThetauscale, thetauscale, !oldThetauscaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetauscale() {
        Float oldThetauscale = thetauscale;
        boolean oldThetauscaleESet = thetauscaleESet;
        thetauscale = THETAUSCALE_EDEFAULT;
        thetauscaleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE,
                    oldThetauscale, THETAUSCALE_EDEFAULT, oldThetauscaleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetauscale() {
        return thetauscaleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTomegafiltp3() {
        return tomegafiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomegafiltp3( Float newTomegafiltp3 ) {
        Float oldTomegafiltp3 = tomegafiltp3;
        tomegafiltp3 = newTomegafiltp3;
        boolean oldTomegafiltp3ESet = tomegafiltp3ESet;
        tomegafiltp3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3, oldTomegafiltp3, tomegafiltp3, !oldTomegafiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomegafiltp3() {
        Float oldTomegafiltp3 = tomegafiltp3;
        boolean oldTomegafiltp3ESet = tomegafiltp3ESet;
        tomegafiltp3 = TOMEGAFILTP3_EDEFAULT;
        tomegafiltp3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3,
                    oldTomegafiltp3, TOMEGAFILTP3_EDEFAULT, oldTomegafiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomegafiltp3() {
        return tomegafiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpfiltp3() {
        return tpfiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfiltp3( Float newTpfiltp3 ) {
        Float oldTpfiltp3 = tpfiltp3;
        tpfiltp3 = newTpfiltp3;
        boolean oldTpfiltp3ESet = tpfiltp3ESet;
        tpfiltp3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3, oldTpfiltp3, tpfiltp3, !oldTpfiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfiltp3() {
        Float oldTpfiltp3 = tpfiltp3;
        boolean oldTpfiltp3ESet = tpfiltp3ESet;
        tpfiltp3 = TPFILTP3_EDEFAULT;
        tpfiltp3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3, oldTpfiltp3, TPFILTP3_EDEFAULT, oldTpfiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfiltp3() {
        return tpfiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpord() {
        return tpord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpord( Float newTpord ) {
        Float oldTpord = tpord;
        tpord = newTpord;
        boolean oldTpordESet = tpordESet;
        tpordESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord, tpord, !oldTpordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpord() {
        Float oldTpord = tpord;
        boolean oldTpordESet = tpordESet;
        tpord = TPORD_EDEFAULT;
        tpordESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord, TPORD_EDEFAULT, oldTpordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpord() {
        return tpordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTufiltp3() {
        return tufiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufiltp3( Float newTufiltp3 ) {
        Float oldTufiltp3 = tufiltp3;
        tufiltp3 = newTufiltp3;
        boolean oldTufiltp3ESet = tufiltp3ESet;
        tufiltp3ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3, oldTufiltp3, tufiltp3, !oldTufiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufiltp3() {
        Float oldTufiltp3 = tufiltp3;
        boolean oldTufiltp3ESet = tufiltp3ESet;
        tufiltp3 = TUFILTP3_EDEFAULT;
        tufiltp3ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3, oldTufiltp3, TUFILTP3_EDEFAULT, oldTufiltp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufiltp3() {
        return tufiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwref() {
        return twref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwref( Float newTwref ) {
        Float oldTwref = twref;
        twref = newTwref;
        boolean oldTwrefESet = twrefESet;
        twrefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TWREF, oldTwref, twref, !oldTwrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwref() {
        Float oldTwref = twref;
        boolean oldTwrefESet = twrefESet;
        twref = TWREF_EDEFAULT;
        twrefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__TWREF, oldTwref, TWREF_EDEFAULT, oldTwrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwref() {
        return twrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUdvs() {
        return udvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdvs( Float newUdvs ) {
        Float oldUdvs = udvs;
        udvs = newUdvs;
        boolean oldUdvsESet = udvsESet;
        udvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs, udvs, !oldUdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdvs() {
        Float oldUdvs = udvs;
        boolean oldUdvsESet = udvsESet;
        udvs = UDVS_EDEFAULT;
        udvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs, UDVS_EDEFAULT, oldUdvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdvs() {
        return udvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUpdip() {
        return updip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpdip( Float newUpdip ) {
        Float oldUpdip = updip;
        updip = newUpdip;
        boolean oldUpdipESet = updipESet;
        updipESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip, updip, !oldUpdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdip() {
        Float oldUpdip = updip;
        boolean oldUpdipESet = updipESet;
        updip = UPDIP_EDEFAULT;
        updipESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip, UPDIP_EDEFAULT, oldUpdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdip() {
        return updipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWdtd() {
        return wdtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWdtd( Float newWdtd ) {
        Float oldWdtd = wdtd;
        wdtd = newWdtd;
        boolean oldWdtdESet = wdtdESet;
        wdtdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__WDTD, oldWdtd, wdtd, !oldWdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWdtd() {
        Float oldWdtd = wdtd;
        boolean oldWdtdESet = wdtdESet;
        wdtd = WDTD_EDEFAULT;
        wdtdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__WDTD, oldWdtd, WDTD_EDEFAULT, oldWdtdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWdtd() {
        return wdtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getZeta() {
        return zeta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeta( Float newZeta ) {
        Float oldZeta = zeta;
        zeta = newZeta;
        boolean oldZetaESet = zetaESet;
        zetaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta, zeta, !oldZetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeta() {
        Float oldZeta = zeta;
        boolean oldZetaESet = zetaESet;
        zeta = ZETA_EDEFAULT;
        zetaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta, ZETA_EDEFAULT, oldZetaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeta() {
        return zetaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< WindDynamicsLookupTable >(
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC );
        }
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindDynamicsLookupTable() {
        if( windDynamicsLookupTable != null ) ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindDynamicsLookupTable() {
        return windDynamicsLookupTable != null && ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet );
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
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            if( newWindTurbineType3IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
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
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, null, null, oldWindTurbineType3IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            return getDprefmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            return getDprefmin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            return getDthetamax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            return getDthetamaxuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return getKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return getKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return getKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            return getMpuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return getOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return getPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return getTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            return getThetaemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            return getThetauscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            return getTomegafiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            return getTpfiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return getTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            return getTufiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            return getTwref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return getUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return getUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            return getWdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return getZeta();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return getWindTurbineType3IEC();
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            setDpmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            setDprefmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            setDprefmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            setDthetamax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            setDthetamaxuvrt( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            setKdtd( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            setKip( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            setKpp( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            setMpuvrt( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            setOmegaoffset( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            setPdtdmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            setTdvs( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            setThetaemin( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            setThetauscale( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            setTomegafiltp3( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            setTpfiltp3( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            setTpord( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            setTufiltp3( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            setTwref( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            setUdvs( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            setUpdip( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            setWdtd( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            setZeta( ( Float ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            unsetDprefmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            unsetDprefmin();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            unsetDthetamax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            unsetDthetamaxuvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            unsetKdtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            unsetKip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            unsetKpp();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            unsetMpuvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            unsetOmegaoffset();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            unsetPdtdmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            unsetTdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            unsetThetaemin();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            unsetThetauscale();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            unsetTomegafiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            unsetTpfiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            unsetTpord();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            unsetTufiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            unsetTwref();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            unsetUdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            unsetUpdip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            unsetWdtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            unsetZeta();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            return isSetDprefmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            return isSetDprefmin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            return isSetDthetamax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            return isSetDthetamaxuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return isSetKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return isSetKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return isSetKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            return isSetMpuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return isSetOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return isSetPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return isSetTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            return isSetThetaemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            return isSetThetauscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            return isSetTomegafiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            return isSetTpfiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return isSetTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            return isSetTufiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TWREF:
            return isSetTwref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return isSetUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return isSetUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WDTD:
            return isSetWdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return isSetZeta();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
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
        result.append( " (dpmax: " );
        if( dpmaxESet )
            result.append( dpmax );
        else
            result.append( "<unset>" );
        result.append( ", dprefmax: " );
        if( dprefmaxESet )
            result.append( dprefmax );
        else
            result.append( "<unset>" );
        result.append( ", dprefmin: " );
        if( dprefminESet )
            result.append( dprefmin );
        else
            result.append( "<unset>" );
        result.append( ", dthetamax: " );
        if( dthetamaxESet )
            result.append( dthetamax );
        else
            result.append( "<unset>" );
        result.append( ", dthetamaxuvrt: " );
        if( dthetamaxuvrtESet )
            result.append( dthetamaxuvrt );
        else
            result.append( "<unset>" );
        result.append( ", kdtd: " );
        if( kdtdESet )
            result.append( kdtd );
        else
            result.append( "<unset>" );
        result.append( ", kip: " );
        if( kipESet )
            result.append( kip );
        else
            result.append( "<unset>" );
        result.append( ", kpp: " );
        if( kppESet )
            result.append( kpp );
        else
            result.append( "<unset>" );
        result.append( ", mpuvrt: " );
        if( mpuvrtESet )
            result.append( mpuvrt );
        else
            result.append( "<unset>" );
        result.append( ", omegaoffset: " );
        if( omegaoffsetESet )
            result.append( omegaoffset );
        else
            result.append( "<unset>" );
        result.append( ", pdtdmax: " );
        if( pdtdmaxESet )
            result.append( pdtdmax );
        else
            result.append( "<unset>" );
        result.append( ", tdvs: " );
        if( tdvsESet )
            result.append( tdvs );
        else
            result.append( "<unset>" );
        result.append( ", thetaemin: " );
        if( thetaeminESet )
            result.append( thetaemin );
        else
            result.append( "<unset>" );
        result.append( ", thetauscale: " );
        if( thetauscaleESet )
            result.append( thetauscale );
        else
            result.append( "<unset>" );
        result.append( ", tomegafiltp3: " );
        if( tomegafiltp3ESet )
            result.append( tomegafiltp3 );
        else
            result.append( "<unset>" );
        result.append( ", tpfiltp3: " );
        if( tpfiltp3ESet )
            result.append( tpfiltp3 );
        else
            result.append( "<unset>" );
        result.append( ", tpord: " );
        if( tpordESet )
            result.append( tpord );
        else
            result.append( "<unset>" );
        result.append( ", tufiltp3: " );
        if( tufiltp3ESet )
            result.append( tufiltp3 );
        else
            result.append( "<unset>" );
        result.append( ", twref: " );
        if( twrefESet )
            result.append( twref );
        else
            result.append( "<unset>" );
        result.append( ", udvs: " );
        if( udvsESet )
            result.append( udvs );
        else
            result.append( "<unset>" );
        result.append( ", updip: " );
        if( updipESet )
            result.append( updip );
        else
            result.append( "<unset>" );
        result.append( ", wdtd: " );
        if( wdtdESet )
            result.append( wdtd );
        else
            result.append( "<unset>" );
        result.append( ", zeta: " );
        if( zetaESet )
            result.append( zeta );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContPType3IECImpl
