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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindProtectionIEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType1or2IEC;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindTurbineType3or4IEC;

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
 * An implementation of the model object '<em><b>Wind Protection IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getDfimax <em>Dfimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getFover <em>Fover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getFunder <em>Funder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getMzc <em>Mzc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getTfma <em>Tfma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getUover <em>Uover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getUunder <em>Uunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.WindProtectionIECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindProtectionIECImpl extends IdentifiedObjectImpl implements WindProtectionIEC {
    /**
     * The default value of the '{@link #getDfimax() <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfimax()
     * @generated
     * @ordered
     */
    protected static final Float DFIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDfimax() <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDfimax()
     * @generated
     * @ordered
     */
    protected Float dfimax = DFIMAX_EDEFAULT;

    /**
     * This is true if the Dfimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dfimaxESet;

    /**
     * The default value of the '{@link #getFover() <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFover()
     * @generated
     * @ordered
     */
    protected static final Float FOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFover() <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFover()
     * @generated
     * @ordered
     */
    protected Float fover = FOVER_EDEFAULT;

    /**
     * This is true if the Fover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean foverESet;

    /**
     * The default value of the '{@link #getFunder() <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunder()
     * @generated
     * @ordered
     */
    protected static final Float FUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFunder() <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFunder()
     * @generated
     * @ordered
     */
    protected Float funder = FUNDER_EDEFAULT;

    /**
     * This is true if the Funder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean funderESet;

    /**
     * The default value of the '{@link #getMzc() <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMzc()
     * @generated
     * @ordered
     */
    protected static final Boolean MZC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMzc() <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMzc()
     * @generated
     * @ordered
     */
    protected Boolean mzc = MZC_EDEFAULT;

    /**
     * This is true if the Mzc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mzcESet;

    /**
     * The default value of the '{@link #getTfma() <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfma()
     * @generated
     * @ordered
     */
    protected static final Float TFMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfma() <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfma()
     * @generated
     * @ordered
     */
    protected Float tfma = TFMA_EDEFAULT;

    /**
     * This is true if the Tfma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfmaESet;

    /**
     * The default value of the '{@link #getUover() <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUover()
     * @generated
     * @ordered
     */
    protected static final Float UOVER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUover() <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUover()
     * @generated
     * @ordered
     */
    protected Float uover = UOVER_EDEFAULT;

    /**
     * This is true if the Uover attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uoverESet;

    /**
     * The default value of the '{@link #getUunder() <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUunder()
     * @generated
     * @ordered
     */
    protected static final Float UUNDER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUunder() <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUunder()
     * @generated
     * @ordered
     */
    protected Float uunder = UUNDER_EDEFAULT;

    /**
     * This is true if the Uunder attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uunderESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4IEC() <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4IEC windTurbineType3or4IEC;

    /**
     * This is true if the Wind Turbine Type3or4 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4IECESet;

    /**
     * The cached value of the '{@link #getWindTurbineType1or2IEC() <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType1or2IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType1or2IEC windTurbineType1or2IEC;

    /**
     * This is true if the Wind Turbine Type1or2 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType1or2IECESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindProtectionIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindProtectionIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getDfimax() {
        return dfimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDfimax( Float newDfimax ) {
        Float oldDfimax = dfimax;
        dfimax = newDfimax;
        boolean oldDfimaxESet = dfimaxESet;
        dfimaxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__DFIMAX, oldDfimax, dfimax, !oldDfimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDfimax() {
        Float oldDfimax = dfimax;
        boolean oldDfimaxESet = dfimaxESet;
        dfimax = DFIMAX_EDEFAULT;
        dfimaxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__DFIMAX, oldDfimax, DFIMAX_EDEFAULT, oldDfimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDfimax() {
        return dfimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFover() {
        return fover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFover( Float newFover ) {
        Float oldFover = fover;
        fover = newFover;
        boolean oldFoverESet = foverESet;
        foverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__FOVER, oldFover, fover, !oldFoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFover() {
        Float oldFover = fover;
        boolean oldFoverESet = foverESet;
        fover = FOVER_EDEFAULT;
        foverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__FOVER, oldFover, FOVER_EDEFAULT, oldFoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFover() {
        return foverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFunder() {
        return funder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFunder( Float newFunder ) {
        Float oldFunder = funder;
        funder = newFunder;
        boolean oldFunderESet = funderESet;
        funderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__FUNDER, oldFunder, funder, !oldFunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFunder() {
        Float oldFunder = funder;
        boolean oldFunderESet = funderESet;
        funder = FUNDER_EDEFAULT;
        funderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__FUNDER, oldFunder, FUNDER_EDEFAULT, oldFunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFunder() {
        return funderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMzc() {
        return mzc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMzc( Boolean newMzc ) {
        Boolean oldMzc = mzc;
        mzc = newMzc;
        boolean oldMzcESet = mzcESet;
        mzcESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__MZC, oldMzc, mzc, !oldMzcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMzc() {
        Boolean oldMzc = mzc;
        boolean oldMzcESet = mzcESet;
        mzc = MZC_EDEFAULT;
        mzcESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__MZC, oldMzc, MZC_EDEFAULT, oldMzcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMzc() {
        return mzcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTfma() {
        return tfma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfma( Float newTfma ) {
        Float oldTfma = tfma;
        tfma = newTfma;
        boolean oldTfmaESet = tfmaESet;
        tfmaESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__TFMA, oldTfma, tfma, !oldTfmaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfma() {
        Float oldTfma = tfma;
        boolean oldTfmaESet = tfmaESet;
        tfma = TFMA_EDEFAULT;
        tfmaESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__TFMA, oldTfma, TFMA_EDEFAULT, oldTfmaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfma() {
        return tfmaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUover() {
        return uover;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUover( Float newUover ) {
        Float oldUover = uover;
        uover = newUover;
        boolean oldUoverESet = uoverESet;
        uoverESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__UOVER, oldUover, uover, !oldUoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUover() {
        Float oldUover = uover;
        boolean oldUoverESet = uoverESet;
        uover = UOVER_EDEFAULT;
        uoverESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__UOVER, oldUover, UOVER_EDEFAULT, oldUoverESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUover() {
        return uoverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getUunder() {
        return uunder;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUunder( Float newUunder ) {
        Float oldUunder = uunder;
        uunder = newUunder;
        boolean oldUunderESet = uunderESet;
        uunderESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.WIND_PROTECTION_IEC__UUNDER, oldUunder, uunder, !oldUunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUunder() {
        Float oldUunder = uunder;
        boolean oldUunderESet = uunderESet;
        uunder = UUNDER_EDEFAULT;
        uunderESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.WIND_PROTECTION_IEC__UUNDER, oldUunder, UUNDER_EDEFAULT, oldUunderESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUunder() {
        return uunderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        if( windTurbineType3or4IEC != null && windTurbineType3or4IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType3or4IEC = ( InternalEObject ) windTurbineType3or4IEC;
            windTurbineType3or4IEC = ( WindTurbineType3or4IEC ) eResolveProxy( oldWindTurbineType3or4IEC );
            if( windTurbineType3or4IEC != oldWindTurbineType3or4IEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
                        windTurbineType3or4IEC ) );
            }
        }
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3or4IEC basicGetWindTurbineType3or4IEC() {
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC,
            NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = newWindTurbineType3or4IEC;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
                    newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet );
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
    public void setWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC ) {
        if( newWindTurbineType3or4IEC != windTurbineType3or4IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            if( newWindTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicSetWindTurbineType3or4IEC( newWindTurbineType3or4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, newWindTurbineType3or4IEC,
                    newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4IEC( NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = null;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC, null,
                    oldWindTurbineType3or4IECESet );
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
    public void unsetWindTurbineType3or4IEC() {
        if( windTurbineType3or4IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3or4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC, null, null,
                    oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4IEC() {
        return windTurbineType3or4IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType1or2IEC getWindTurbineType1or2IEC() {
        if( windTurbineType1or2IEC != null && windTurbineType1or2IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType1or2IEC = ( InternalEObject ) windTurbineType1or2IEC;
            windTurbineType1or2IEC = ( WindTurbineType1or2IEC ) eResolveProxy( oldWindTurbineType1or2IEC );
            if( windTurbineType1or2IEC != oldWindTurbineType1or2IEC ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC,
                        windTurbineType1or2IEC ) );
            }
        }
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType1or2IEC basicGetWindTurbineType1or2IEC() {
        return windTurbineType1or2IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC,
            NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = newWindTurbineType1or2IEC;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC,
                    newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet );
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
    public void setWindTurbineType1or2IEC( WindTurbineType1or2IEC newWindTurbineType1or2IEC ) {
        if( newWindTurbineType1or2IEC != windTurbineType1or2IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            if( newWindTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType1or2IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicSetWindTurbineType1or2IEC( newWindTurbineType1or2IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, newWindTurbineType1or2IEC,
                    newWindTurbineType1or2IEC, !oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType1or2IEC( NotificationChain msgs ) {
        WindTurbineType1or2IEC oldWindTurbineType1or2IEC = windTurbineType1or2IEC;
        windTurbineType1or2IEC = null;
        boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
        windTurbineType1or2IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, oldWindTurbineType1or2IEC, null,
                    oldWindTurbineType1or2IECESet );
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
    public void unsetWindTurbineType1or2IEC() {
        if( windTurbineType1or2IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            msgs = basicUnsetWindTurbineType1or2IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType1or2IECESet = windTurbineType1or2IECESet;
            windTurbineType1or2IECESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC, null, null,
                    oldWindTurbineType1or2IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType1or2IEC() {
        return windTurbineType1or2IECESet;
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
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_PROTECTION_IEC );
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
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_PROTECTION_IEC, WindTurbineType3or4IEC.class, msgs );
            return basicSetWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) otherEnd, msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            if( windTurbineType1or2IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType1or2IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE1OR2_IEC__WIND_PROTECTION_IEC, WindTurbineType1or2IEC.class, msgs );
            return basicSetWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) otherEnd, msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
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
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return basicUnsetWindTurbineType3or4IEC( msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return basicUnsetWindTurbineType1or2IEC( msgs );
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIND_PROTECTION_IEC__DFIMAX:
            return getDfimax();
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            return getFover();
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            return getFunder();
        case CimPackage.WIND_PROTECTION_IEC__MZC:
            return getMzc();
        case CimPackage.WIND_PROTECTION_IEC__TFMA:
            return getTfma();
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            return getUover();
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            return getUunder();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( resolve ) return getWindTurbineType3or4IEC();
            return basicGetWindTurbineType3or4IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            if( resolve ) return getWindTurbineType1or2IEC();
            return basicGetWindTurbineType1or2IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
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
        case CimPackage.WIND_PROTECTION_IEC__DFIMAX:
            setDfimax( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            setFover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            setFunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__MZC:
            setMzc( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFMA:
            setTfma( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            setUover( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            setUunder( ( Float ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            setWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            setWindTurbineType1or2IEC( ( WindTurbineType1or2IEC ) newValue );
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
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
        case CimPackage.WIND_PROTECTION_IEC__DFIMAX:
            unsetDfimax();
            return;
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            unsetFover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            unsetFunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__MZC:
            unsetMzc();
            return;
        case CimPackage.WIND_PROTECTION_IEC__TFMA:
            unsetTfma();
            return;
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            unsetUover();
            return;
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            unsetUunder();
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            unsetWindTurbineType3or4IEC();
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            unsetWindTurbineType1or2IEC();
            return;
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
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
        case CimPackage.WIND_PROTECTION_IEC__DFIMAX:
            return isSetDfimax();
        case CimPackage.WIND_PROTECTION_IEC__FOVER:
            return isSetFover();
        case CimPackage.WIND_PROTECTION_IEC__FUNDER:
            return isSetFunder();
        case CimPackage.WIND_PROTECTION_IEC__MZC:
            return isSetMzc();
        case CimPackage.WIND_PROTECTION_IEC__TFMA:
            return isSetTfma();
        case CimPackage.WIND_PROTECTION_IEC__UOVER:
            return isSetUover();
        case CimPackage.WIND_PROTECTION_IEC__UUNDER:
            return isSetUunder();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE3OR4_IEC:
            return isSetWindTurbineType3or4IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_TURBINE_TYPE1OR2_IEC:
            return isSetWindTurbineType1or2IEC();
        case CimPackage.WIND_PROTECTION_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
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
        result.append( " (dfimax: " );
        if( dfimaxESet )
            result.append( dfimax );
        else
            result.append( "<unset>" );
        result.append( ", fover: " );
        if( foverESet )
            result.append( fover );
        else
            result.append( "<unset>" );
        result.append( ", funder: " );
        if( funderESet )
            result.append( funder );
        else
            result.append( "<unset>" );
        result.append( ", mzc: " );
        if( mzcESet )
            result.append( mzc );
        else
            result.append( "<unset>" );
        result.append( ", tfma: " );
        if( tfmaESet )
            result.append( tfma );
        else
            result.append( "<unset>" );
        result.append( ", uover: " );
        if( uoverESet )
            result.append( uover );
        else
            result.append( "<unset>" );
        result.append( ", uunder: " );
        if( uunderESet )
            result.append( uunder );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindProtectionIECImpl
