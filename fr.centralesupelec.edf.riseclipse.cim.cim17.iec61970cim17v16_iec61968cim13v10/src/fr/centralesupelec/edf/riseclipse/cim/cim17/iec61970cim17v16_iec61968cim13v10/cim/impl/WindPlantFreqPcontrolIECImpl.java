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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantFreqPcontrolIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantIEC;

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
 * An implementation of the model object '<em><b>Wind Plant Freq Pcontrol IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getDpwprefmax <em>Dpwprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getDpwprefmin <em>Dpwprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getKiwpp <em>Kiwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getKiwppmax <em>Kiwppmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getKiwppmin <em>Kiwppmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getKpwpp <em>Kpwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getKwppref <em>Kwppref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getPrefmax <em>Prefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getPrefmin <em>Prefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getTpft <em>Tpft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getTpfv <em>Tpfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getTwpffiltp <em>Twpffiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getTwppfiltp <em>Twppfiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindPlantFreqPcontrolIECImpl#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindPlantFreqPcontrolIECImpl extends IdentifiedObjectImpl implements WindPlantFreqPcontrolIEC {
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
     * The default value of the '{@link #getDpwprefmax() <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpwprefmax()
     * @generated
     * @ordered
     */
    protected static final Float DPWPREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpwprefmax() <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpwprefmax()
     * @generated
     * @ordered
     */
    protected Float dpwprefmax = DPWPREFMAX_EDEFAULT;

    /**
     * This is true if the Dpwprefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpwprefmaxESet;

    /**
     * The default value of the '{@link #getDpwprefmin() <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpwprefmin()
     * @generated
     * @ordered
     */
    protected static final Float DPWPREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpwprefmin() <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpwprefmin()
     * @generated
     * @ordered
     */
    protected Float dpwprefmin = DPWPREFMIN_EDEFAULT;

    /**
     * This is true if the Dpwprefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpwprefminESet;

    /**
     * The default value of the '{@link #getKiwpp() <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpp()
     * @generated
     * @ordered
     */
    protected static final Float KIWPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwpp() <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwpp()
     * @generated
     * @ordered
     */
    protected Float kiwpp = KIWPP_EDEFAULT;

    /**
     * This is true if the Kiwpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwppESet;

    /**
     * The default value of the '{@link #getKiwppmax() <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwppmax()
     * @generated
     * @ordered
     */
    protected static final Float KIWPPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwppmax() <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwppmax()
     * @generated
     * @ordered
     */
    protected Float kiwppmax = KIWPPMAX_EDEFAULT;

    /**
     * This is true if the Kiwppmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwppmaxESet;

    /**
     * The default value of the '{@link #getKiwppmin() <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwppmin()
     * @generated
     * @ordered
     */
    protected static final Float KIWPPMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiwppmin() <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiwppmin()
     * @generated
     * @ordered
     */
    protected Float kiwppmin = KIWPPMIN_EDEFAULT;

    /**
     * This is true if the Kiwppmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiwppminESet;

    /**
     * The default value of the '{@link #getKpwpp() <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpp()
     * @generated
     * @ordered
     */
    protected static final Float KPWPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpwpp() <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpwpp()
     * @generated
     * @ordered
     */
    protected Float kpwpp = KPWPP_EDEFAULT;

    /**
     * This is true if the Kpwpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpwppESet;

    /**
     * The default value of the '{@link #getKwppref() <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwppref()
     * @generated
     * @ordered
     */
    protected static final Float KWPPREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKwppref() <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKwppref()
     * @generated
     * @ordered
     */
    protected Float kwppref = KWPPREF_EDEFAULT;

    /**
     * This is true if the Kwppref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kwpprefESet;

    /**
     * The default value of the '{@link #getPrefmax() <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefmax()
     * @generated
     * @ordered
     */
    protected static final Float PREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefmax() <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefmax()
     * @generated
     * @ordered
     */
    protected Float prefmax = PREFMAX_EDEFAULT;

    /**
     * This is true if the Prefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefmaxESet;

    /**
     * The default value of the '{@link #getPrefmin() <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefmin()
     * @generated
     * @ordered
     */
    protected static final Float PREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrefmin() <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrefmin()
     * @generated
     * @ordered
     */
    protected Float prefmin = PREFMIN_EDEFAULT;

    /**
     * This is true if the Prefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean prefminESet;

    /**
     * The default value of the '{@link #getTpft() <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpft()
     * @generated
     * @ordered
     */
    protected static final Float TPFT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpft() <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpft()
     * @generated
     * @ordered
     */
    protected Float tpft = TPFT_EDEFAULT;

    /**
     * This is true if the Tpft attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpftESet;

    /**
     * The default value of the '{@link #getTpfv() <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfv()
     * @generated
     * @ordered
     */
    protected static final Float TPFV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfv() <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfv()
     * @generated
     * @ordered
     */
    protected Float tpfv = TPFV_EDEFAULT;

    /**
     * This is true if the Tpfv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfvESet;

    /**
     * The default value of the '{@link #getTwpffiltp() <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpffiltp()
     * @generated
     * @ordered
     */
    protected static final Float TWPFFILTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwpffiltp() <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwpffiltp()
     * @generated
     * @ordered
     */
    protected Float twpffiltp = TWPFFILTP_EDEFAULT;

    /**
     * This is true if the Twpffiltp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twpffiltpESet;

    /**
     * The default value of the '{@link #getTwppfiltp() <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfiltp()
     * @generated
     * @ordered
     */
    protected static final Float TWPPFILTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTwppfiltp() <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTwppfiltp()
     * @generated
     * @ordered
     */
    protected Float twppfiltp = TWPPFILTP_EDEFAULT;

    /**
     * This is true if the Twppfiltp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twppfiltpESet;

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
     * The cached value of the '{@link #getWindPlantIEC() <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantIEC()
     * @generated
     * @ordered
     */
    protected WindPlantIEC windPlantIEC;

    /**
     * This is true if the Wind Plant IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantIECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindPlantFreqPcontrolIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindPlantFreqPcontrolIEC();
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
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX, oldDprefmax, dprefmax, !oldDprefmaxESet ) );
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
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX, oldDprefmax, DPREFMAX_EDEFAULT, oldDprefmaxESet ) );
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
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN, oldDprefmin, dprefmin, !oldDprefminESet ) );
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
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN, oldDprefmin, DPREFMIN_EDEFAULT, oldDprefminESet ) );
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
    public Float getDpwprefmax() {
        return dpwprefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpwprefmax( Float newDpwprefmax ) {
        Float oldDpwprefmax = dpwprefmax;
        dpwprefmax = newDpwprefmax;
        boolean oldDpwprefmaxESet = dpwprefmaxESet;
        dpwprefmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX, oldDpwprefmax, dpwprefmax, !oldDpwprefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpwprefmax() {
        Float oldDpwprefmax = dpwprefmax;
        boolean oldDpwprefmaxESet = dpwprefmaxESet;
        dpwprefmax = DPWPREFMAX_EDEFAULT;
        dpwprefmaxESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX,
                        oldDpwprefmax, DPWPREFMAX_EDEFAULT, oldDpwprefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpwprefmax() {
        return dpwprefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDpwprefmin() {
        return dpwprefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpwprefmin( Float newDpwprefmin ) {
        Float oldDpwprefmin = dpwprefmin;
        dpwprefmin = newDpwprefmin;
        boolean oldDpwprefminESet = dpwprefminESet;
        dpwprefminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN, oldDpwprefmin, dpwprefmin, !oldDpwprefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpwprefmin() {
        Float oldDpwprefmin = dpwprefmin;
        boolean oldDpwprefminESet = dpwprefminESet;
        dpwprefmin = DPWPREFMIN_EDEFAULT;
        dpwprefminESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN,
                        oldDpwprefmin, DPWPREFMIN_EDEFAULT, oldDpwprefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpwprefmin() {
        return dpwprefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiwpp() {
        return kiwpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwpp( Float newKiwpp ) {
        Float oldKiwpp = kiwpp;
        kiwpp = newKiwpp;
        boolean oldKiwppESet = kiwppESet;
        kiwppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP, oldKiwpp, kiwpp, !oldKiwppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwpp() {
        Float oldKiwpp = kiwpp;
        boolean oldKiwppESet = kiwppESet;
        kiwpp = KIWPP_EDEFAULT;
        kiwppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP, oldKiwpp, KIWPP_EDEFAULT, oldKiwppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwpp() {
        return kiwppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiwppmax() {
        return kiwppmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwppmax( Float newKiwppmax ) {
        Float oldKiwppmax = kiwppmax;
        kiwppmax = newKiwppmax;
        boolean oldKiwppmaxESet = kiwppmaxESet;
        kiwppmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX, oldKiwppmax, kiwppmax, !oldKiwppmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwppmax() {
        Float oldKiwppmax = kiwppmax;
        boolean oldKiwppmaxESet = kiwppmaxESet;
        kiwppmax = KIWPPMAX_EDEFAULT;
        kiwppmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX, oldKiwppmax, KIWPPMAX_EDEFAULT, oldKiwppmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwppmax() {
        return kiwppmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKiwppmin() {
        return kiwppmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiwppmin( Float newKiwppmin ) {
        Float oldKiwppmin = kiwppmin;
        kiwppmin = newKiwppmin;
        boolean oldKiwppminESet = kiwppminESet;
        kiwppminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN, oldKiwppmin, kiwppmin, !oldKiwppminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiwppmin() {
        Float oldKiwppmin = kiwppmin;
        boolean oldKiwppminESet = kiwppminESet;
        kiwppmin = KIWPPMIN_EDEFAULT;
        kiwppminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN, oldKiwppmin, KIWPPMIN_EDEFAULT, oldKiwppminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiwppmin() {
        return kiwppminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKpwpp() {
        return kpwpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpwpp( Float newKpwpp ) {
        Float oldKpwpp = kpwpp;
        kpwpp = newKpwpp;
        boolean oldKpwppESet = kpwppESet;
        kpwppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP, oldKpwpp, kpwpp, !oldKpwppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpwpp() {
        Float oldKpwpp = kpwpp;
        boolean oldKpwppESet = kpwppESet;
        kpwpp = KPWPP_EDEFAULT;
        kpwppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP, oldKpwpp, KPWPP_EDEFAULT, oldKpwppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpwpp() {
        return kpwppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getKwppref() {
        return kwppref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKwppref( Float newKwppref ) {
        Float oldKwppref = kwppref;
        kwppref = newKwppref;
        boolean oldKwpprefESet = kwpprefESet;
        kwpprefESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF, oldKwppref, kwppref, !oldKwpprefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKwppref() {
        Float oldKwppref = kwppref;
        boolean oldKwpprefESet = kwpprefESet;
        kwppref = KWPPREF_EDEFAULT;
        kwpprefESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF, oldKwppref, KWPPREF_EDEFAULT, oldKwpprefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKwppref() {
        return kwpprefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPrefmax() {
        return prefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefmax( Float newPrefmax ) {
        Float oldPrefmax = prefmax;
        prefmax = newPrefmax;
        boolean oldPrefmaxESet = prefmaxESet;
        prefmaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX, oldPrefmax, prefmax, !oldPrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefmax() {
        Float oldPrefmax = prefmax;
        boolean oldPrefmaxESet = prefmaxESet;
        prefmax = PREFMAX_EDEFAULT;
        prefmaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX, oldPrefmax, PREFMAX_EDEFAULT, oldPrefmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefmax() {
        return prefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPrefmin() {
        return prefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrefmin( Float newPrefmin ) {
        Float oldPrefmin = prefmin;
        prefmin = newPrefmin;
        boolean oldPrefminESet = prefminESet;
        prefminESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN, oldPrefmin, prefmin, !oldPrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPrefmin() {
        Float oldPrefmin = prefmin;
        boolean oldPrefminESet = prefminESet;
        prefmin = PREFMIN_EDEFAULT;
        prefminESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN, oldPrefmin, PREFMIN_EDEFAULT, oldPrefminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPrefmin() {
        return prefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpft() {
        return tpft;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpft( Float newTpft ) {
        Float oldTpft = tpft;
        tpft = newTpft;
        boolean oldTpftESet = tpftESet;
        tpftESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT, oldTpft, tpft, !oldTpftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpft() {
        Float oldTpft = tpft;
        boolean oldTpftESet = tpftESet;
        tpft = TPFT_EDEFAULT;
        tpftESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT, oldTpft, TPFT_EDEFAULT, oldTpftESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpft() {
        return tpftESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpfv() {
        return tpfv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfv( Float newTpfv ) {
        Float oldTpfv = tpfv;
        tpfv = newTpfv;
        boolean oldTpfvESet = tpfvESet;
        tpfvESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV, oldTpfv, tpfv, !oldTpfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfv() {
        Float oldTpfv = tpfv;
        boolean oldTpfvESet = tpfvESet;
        tpfv = TPFV_EDEFAULT;
        tpfvESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV, oldTpfv, TPFV_EDEFAULT, oldTpfvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfv() {
        return tpfvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwpffiltp() {
        return twpffiltp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwpffiltp( Float newTwpffiltp ) {
        Float oldTwpffiltp = twpffiltp;
        twpffiltp = newTwpffiltp;
        boolean oldTwpffiltpESet = twpffiltpESet;
        twpffiltpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP, oldTwpffiltp, twpffiltp, !oldTwpffiltpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwpffiltp() {
        Float oldTwpffiltp = twpffiltp;
        boolean oldTwpffiltpESet = twpffiltpESet;
        twpffiltp = TWPFFILTP_EDEFAULT;
        twpffiltpESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP,
                        oldTwpffiltp, TWPFFILTP_EDEFAULT, oldTwpffiltpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwpffiltp() {
        return twpffiltpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTwppfiltp() {
        return twppfiltp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTwppfiltp( Float newTwppfiltp ) {
        Float oldTwppfiltp = twppfiltp;
        twppfiltp = newTwppfiltp;
        boolean oldTwppfiltpESet = twppfiltpESet;
        twppfiltpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP, oldTwppfiltp, twppfiltp, !oldTwppfiltpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTwppfiltp() {
        Float oldTwppfiltp = twppfiltp;
        boolean oldTwppfiltpESet = twppfiltpESet;
        twppfiltp = TWPPFILTP_EDEFAULT;
        twppfiltpESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP,
                        oldTwppfiltp, TWPPFILTP_EDEFAULT, oldTwppfiltpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTwppfiltp() {
        return twppfiltpESet;
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
                    WindDynamicsLookupTable.class, this,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PLANT_FREQ_PCONTROL_IEC );
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
    public WindPlantIEC getWindPlantIEC() {
        return windPlantIEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantIEC( WindPlantIEC newWindPlantIEC, NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = newWindPlantIEC;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, newWindPlantIEC,
                    !oldWindPlantIECESet );
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
    public void setWindPlantIEC( WindPlantIEC newWindPlantIEC ) {
        if( newWindPlantIEC != windPlantIEC ) {
            NotificationChain msgs = null;
            if( windPlantIEC != null ) msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, WindPlantIEC.class, msgs );
            if( newWindPlantIEC != null ) msgs = ( ( InternalEObject ) newWindPlantIEC ).eInverseAdd( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicSetWindPlantIEC( newWindPlantIEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, newWindPlantIEC, newWindPlantIEC,
                    !oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantIEC( NotificationChain msgs ) {
        WindPlantIEC oldWindPlantIEC = windPlantIEC;
        windPlantIEC = null;
        boolean oldWindPlantIECESet = windPlantIECESet;
        windPlantIECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, oldWindPlantIEC, null,
                    oldWindPlantIECESet );
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
    public void unsetWindPlantIEC() {
        if( windPlantIEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, WindPlantIEC.class, msgs );
            msgs = basicUnsetWindPlantIEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantIECESet = windPlantIECESet;
            windPlantIECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC, null, null, oldWindPlantIECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantIEC() {
        return windPlantIECESet;
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            if( windPlantIEC != null ) msgs = ( ( InternalEObject ) windPlantIEC ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_IEC__WIND_PLANT_FREQ_PCONTROL_IEC, WindPlantIEC.class, msgs );
            return basicSetWindPlantIEC( ( WindPlantIEC ) otherEnd, msgs );
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            return basicUnsetWindPlantIEC( msgs );
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX:
            return getDprefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN:
            return getDprefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX:
            return getDpwprefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN:
            return getDpwprefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP:
            return getKiwpp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX:
            return getKiwppmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN:
            return getKiwppmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP:
            return getKpwpp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF:
            return getKwppref();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX:
            return getPrefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN:
            return getPrefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT:
            return getTpft();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV:
            return getTpfv();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP:
            return getTwpffiltp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP:
            return getTwppfiltp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            return getWindPlantIEC();
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX:
            setDprefmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN:
            setDprefmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX:
            setDpwprefmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN:
            setDpwprefmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP:
            setKiwpp( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX:
            setKiwppmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN:
            setKiwppmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP:
            setKpwpp( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF:
            setKwppref( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX:
            setPrefmax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN:
            setPrefmin( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT:
            setTpft( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV:
            setTpfv( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP:
            setTwpffiltp( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP:
            setTwppfiltp( ( Float ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            setWindPlantIEC( ( WindPlantIEC ) newValue );
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX:
            unsetDprefmax();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN:
            unsetDprefmin();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX:
            unsetDpwprefmax();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN:
            unsetDpwprefmin();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP:
            unsetKiwpp();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX:
            unsetKiwppmax();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN:
            unsetKiwppmin();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP:
            unsetKpwpp();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF:
            unsetKwppref();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX:
            unsetPrefmax();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN:
            unsetPrefmin();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT:
            unsetTpft();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV:
            unsetTpfv();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP:
            unsetTwpffiltp();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP:
            unsetTwppfiltp();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            unsetWindPlantIEC();
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
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMAX:
            return isSetDprefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPREFMIN:
            return isSetDprefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMAX:
            return isSetDpwprefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__DPWPREFMIN:
            return isSetDpwprefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPP:
            return isSetKiwpp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMAX:
            return isSetKiwppmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KIWPPMIN:
            return isSetKiwppmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KPWPP:
            return isSetKpwpp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__KWPPREF:
            return isSetKwppref();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMAX:
            return isSetPrefmax();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__PREFMIN:
            return isSetPrefmin();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFT:
            return isSetTpft();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TPFV:
            return isSetTpfv();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPFFILTP:
            return isSetTwpffiltp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__TWPPFILTP:
            return isSetTwppfiltp();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_PLANT_FREQ_PCONTROL_IEC__WIND_PLANT_IEC:
            return isSetWindPlantIEC();
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
        result.append( " (dprefmax: " );
        if( dprefmaxESet )
            result.append( dprefmax );
        else
            result.append( "<unset>" );
        result.append( ", dprefmin: " );
        if( dprefminESet )
            result.append( dprefmin );
        else
            result.append( "<unset>" );
        result.append( ", dpwprefmax: " );
        if( dpwprefmaxESet )
            result.append( dpwprefmax );
        else
            result.append( "<unset>" );
        result.append( ", dpwprefmin: " );
        if( dpwprefminESet )
            result.append( dpwprefmin );
        else
            result.append( "<unset>" );
        result.append( ", kiwpp: " );
        if( kiwppESet )
            result.append( kiwpp );
        else
            result.append( "<unset>" );
        result.append( ", kiwppmax: " );
        if( kiwppmaxESet )
            result.append( kiwppmax );
        else
            result.append( "<unset>" );
        result.append( ", kiwppmin: " );
        if( kiwppminESet )
            result.append( kiwppmin );
        else
            result.append( "<unset>" );
        result.append( ", kpwpp: " );
        if( kpwppESet )
            result.append( kpwpp );
        else
            result.append( "<unset>" );
        result.append( ", kwppref: " );
        if( kwpprefESet )
            result.append( kwppref );
        else
            result.append( "<unset>" );
        result.append( ", prefmax: " );
        if( prefmaxESet )
            result.append( prefmax );
        else
            result.append( "<unset>" );
        result.append( ", prefmin: " );
        if( prefminESet )
            result.append( prefmin );
        else
            result.append( "<unset>" );
        result.append( ", tpft: " );
        if( tpftESet )
            result.append( tpft );
        else
            result.append( "<unset>" );
        result.append( ", tpfv: " );
        if( tpfvESet )
            result.append( tpfv );
        else
            result.append( "<unset>" );
        result.append( ", twpffiltp: " );
        if( twpffiltpESet )
            result.append( twpffiltp );
        else
            result.append( "<unset>" );
        result.append( ", twppfiltp: " );
        if( twppfiltpESet )
            result.append( twppfiltp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindPlantFreqPcontrolIECImpl
