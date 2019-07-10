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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RatioTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerCoreAdmittance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerMeshImpedance;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerStarImpedance;

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
 * An implementation of the model object '<em><b>Transformer End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getBmagSat <em>Bmag Sat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getMagBaseU <em>Mag Base U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getMagSatFlux <em>Mag Sat Flux</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getRground <em>Rground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getXground <em>Xground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getToMeshImpedance <em>To Mesh Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getCoreAdmittance <em>Core Admittance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getStarImpedance <em>Star Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getFromMeshImpedance <em>From Mesh Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TransformerEndImpl#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerEndImpl extends IdentifiedObjectImpl implements TransformerEnd {
    /**
     * The default value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBmagSat()
     * @generated
     * @ordered
     */
    protected static final Float BMAG_SAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBmagSat() <em>Bmag Sat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBmagSat()
     * @generated
     * @ordered
     */
    protected Float bmagSat = BMAG_SAT_EDEFAULT;

    /**
     * This is true if the Bmag Sat attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bmagSatESet;

    /**
     * The default value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected static final Integer END_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected Integer endNumber = END_NUMBER_EDEFAULT;

    /**
     * This is true if the End Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endNumberESet;

    /**
     * The default value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected Boolean grounded = GROUNDED_EDEFAULT;

    /**
     * This is true if the Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedESet;

    /**
     * The default value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMagBaseU()
     * @generated
     * @ordered
     */
    protected static final Float MAG_BASE_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMagBaseU() <em>Mag Base U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMagBaseU()
     * @generated
     * @ordered
     */
    protected Float magBaseU = MAG_BASE_U_EDEFAULT;

    /**
     * This is true if the Mag Base U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean magBaseUESet;

    /**
     * The default value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMagSatFlux()
     * @generated
     * @ordered
     */
    protected static final Float MAG_SAT_FLUX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMagSatFlux() <em>Mag Sat Flux</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMagSatFlux()
     * @generated
     * @ordered
     */
    protected Float magSatFlux = MAG_SAT_FLUX_EDEFAULT;

    /**
     * This is true if the Mag Sat Flux attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean magSatFluxESet;

    /**
     * The default value of the '{@link #getRground() <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRground()
     * @generated
     * @ordered
     */
    protected static final Float RGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRground() <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRground()
     * @generated
     * @ordered
     */
    protected Float rground = RGROUND_EDEFAULT;

    /**
     * This is true if the Rground attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rgroundESet;

    /**
     * The default value of the '{@link #getXground() <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXground()
     * @generated
     * @ordered
     */
    protected static final Float XGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXground() <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXground()
     * @generated
     * @ordered
     */
    protected Float xground = XGROUND_EDEFAULT;

    /**
     * This is true if the Xground attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xgroundESet;

    /**
     * The cached value of the '{@link #getToMeshImpedance() <em>To Mesh Impedance</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToMeshImpedance()
     * @generated
     * @ordered
     */
    protected EList< TransformerMeshImpedance > toMeshImpedance;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The cached value of the '{@link #getCoreAdmittance() <em>Core Admittance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoreAdmittance()
     * @generated
     * @ordered
     */
    protected TransformerCoreAdmittance coreAdmittance;

    /**
     * This is true if the Core Admittance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coreAdmittanceESet;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChanger()
     * @generated
     * @ordered
     */
    protected RatioTapChanger ratioTapChanger;

    /**
     * This is true if the Ratio Tap Changer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratioTapChangerESet;

    /**
     * The cached value of the '{@link #getStarImpedance() <em>Star Impedance</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStarImpedance()
     * @generated
     * @ordered
     */
    protected TransformerStarImpedance starImpedance;

    /**
     * This is true if the Star Impedance reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean starImpedanceESet;

    /**
     * The cached value of the '{@link #getFromMeshImpedance() <em>From Mesh Impedance</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromMeshImpedance()
     * @generated
     * @ordered
     */
    protected EList< TransformerMeshImpedance > fromMeshImpedance;

    /**
     * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseTapChanger()
     * @generated
     * @ordered
     */
    protected PhaseTapChanger phaseTapChanger;

    /**
     * This is true if the Phase Tap Changer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseTapChangerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerEnd();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBmagSat() {
        return bmagSat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBmagSat( Float newBmagSat ) {
        Float oldBmagSat = bmagSat;
        bmagSat = newBmagSat;
        boolean oldBmagSatESet = bmagSatESet;
        bmagSatESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__BMAG_SAT, oldBmagSat, bmagSat, !oldBmagSatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBmagSat() {
        Float oldBmagSat = bmagSat;
        boolean oldBmagSatESet = bmagSatESet;
        bmagSat = BMAG_SAT_EDEFAULT;
        bmagSatESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__BMAG_SAT, oldBmagSat, BMAG_SAT_EDEFAULT, oldBmagSatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBmagSat() {
        return bmagSatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getEndNumber() {
        return endNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndNumber( Integer newEndNumber ) {
        Integer oldEndNumber = endNumber;
        endNumber = newEndNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__END_NUMBER, oldEndNumber, endNumber, !oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndNumber() {
        Integer oldEndNumber = endNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumber = END_NUMBER_EDEFAULT;
        endNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__END_NUMBER, oldEndNumber, END_NUMBER_EDEFAULT, oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndNumber() {
        return endNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGrounded() {
        return grounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrounded( Boolean newGrounded ) {
        Boolean oldGrounded = grounded;
        grounded = newGrounded;
        boolean oldGroundedESet = groundedESet;
        groundedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__GROUNDED, oldGrounded, grounded, !oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrounded() {
        Boolean oldGrounded = grounded;
        boolean oldGroundedESet = groundedESet;
        grounded = GROUNDED_EDEFAULT;
        groundedESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__GROUNDED, oldGrounded, GROUNDED_EDEFAULT, oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrounded() {
        return groundedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMagBaseU() {
        return magBaseU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMagBaseU( Float newMagBaseU ) {
        Float oldMagBaseU = magBaseU;
        magBaseU = newMagBaseU;
        boolean oldMagBaseUESet = magBaseUESet;
        magBaseUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__MAG_BASE_U, oldMagBaseU, magBaseU, !oldMagBaseUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMagBaseU() {
        Float oldMagBaseU = magBaseU;
        boolean oldMagBaseUESet = magBaseUESet;
        magBaseU = MAG_BASE_U_EDEFAULT;
        magBaseUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__MAG_BASE_U, oldMagBaseU, MAG_BASE_U_EDEFAULT, oldMagBaseUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMagBaseU() {
        return magBaseUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMagSatFlux() {
        return magSatFlux;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMagSatFlux( Float newMagSatFlux ) {
        Float oldMagSatFlux = magSatFlux;
        magSatFlux = newMagSatFlux;
        boolean oldMagSatFluxESet = magSatFluxESet;
        magSatFluxESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__MAG_SAT_FLUX, oldMagSatFlux, magSatFlux, !oldMagSatFluxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMagSatFlux() {
        Float oldMagSatFlux = magSatFlux;
        boolean oldMagSatFluxESet = magSatFluxESet;
        magSatFlux = MAG_SAT_FLUX_EDEFAULT;
        magSatFluxESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__MAG_SAT_FLUX, oldMagSatFlux, MAG_SAT_FLUX_EDEFAULT, oldMagSatFluxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMagSatFlux() {
        return magSatFluxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRground() {
        return rground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRground( Float newRground ) {
        Float oldRground = rground;
        rground = newRground;
        boolean oldRgroundESet = rgroundESet;
        rgroundESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__RGROUND, oldRground, rground, !oldRgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRground() {
        Float oldRground = rground;
        boolean oldRgroundESet = rgroundESet;
        rground = RGROUND_EDEFAULT;
        rgroundESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__RGROUND, oldRground, RGROUND_EDEFAULT, oldRgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRground() {
        return rgroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXground() {
        return xground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXground( Float newXground ) {
        Float oldXground = xground;
        xground = newXground;
        boolean oldXgroundESet = xgroundESet;
        xgroundESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TRANSFORMER_END__XGROUND, oldXground, xground, !oldXgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXground() {
        Float oldXground = xground;
        boolean oldXgroundESet = xgroundESet;
        xground = XGROUND_EDEFAULT;
        xgroundESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TRANSFORMER_END__XGROUND, oldXground, XGROUND_EDEFAULT, oldXgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXground() {
        return xgroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerMeshImpedance > getToMeshImpedance() {
        if( toMeshImpedance == null ) {
            toMeshImpedance = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< TransformerMeshImpedance >(
                    TransformerMeshImpedance.class, this, CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__TO_TRANSFORMER_END );
        }
        return toMeshImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToMeshImpedance() {
        if( toMeshImpedance != null ) ( ( InternalEList.Unsettable< ? > ) toMeshImpedance ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToMeshImpedance() {
        return toMeshImpedance != null && ( ( InternalEList.Unsettable< ? > ) toMeshImpedance ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs );
            if( newTerminal != null ) msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this,
                    CimPackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__TERMINAL, newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__TERMINAL, oldTerminal, null, oldTerminalESet );
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
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TRANSFORMER_END,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__TERMINAL, null, null, oldTerminalESet ) );
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
    public TransformerCoreAdmittance getCoreAdmittance() {
        return coreAdmittance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCoreAdmittance( TransformerCoreAdmittance newCoreAdmittance,
            NotificationChain msgs ) {
        TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
        coreAdmittance = newCoreAdmittance;
        boolean oldCoreAdmittanceESet = coreAdmittanceESet;
        coreAdmittanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__CORE_ADMITTANCE, oldCoreAdmittance, newCoreAdmittance,
                    !oldCoreAdmittanceESet );
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
    public void setCoreAdmittance( TransformerCoreAdmittance newCoreAdmittance ) {
        if( newCoreAdmittance != coreAdmittance ) {
            NotificationChain msgs = null;
            if( coreAdmittance != null ) msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs );
            if( newCoreAdmittance != null ) msgs = ( ( InternalEObject ) newCoreAdmittance ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs );
            msgs = basicSetCoreAdmittance( newCoreAdmittance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoreAdmittanceESet = coreAdmittanceESet;
            coreAdmittanceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__CORE_ADMITTANCE,
                        newCoreAdmittance, newCoreAdmittance, !oldCoreAdmittanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCoreAdmittance( NotificationChain msgs ) {
        TransformerCoreAdmittance oldCoreAdmittance = coreAdmittance;
        coreAdmittance = null;
        boolean oldCoreAdmittanceESet = coreAdmittanceESet;
        coreAdmittanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__CORE_ADMITTANCE, oldCoreAdmittance, null, oldCoreAdmittanceESet );
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
    public void unsetCoreAdmittance() {
        if( coreAdmittance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs );
            msgs = basicUnsetCoreAdmittance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCoreAdmittanceESet = coreAdmittanceESet;
            coreAdmittanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__CORE_ADMITTANCE, null, null, oldCoreAdmittanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoreAdmittance() {
        return coreAdmittanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            if( newBaseVoltage != null ) msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                    CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this, CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS,
                    BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChanger getRatioTapChanger() {
        if( ratioTapChanger != null && ratioTapChanger.eIsProxy() ) {
            InternalEObject oldRatioTapChanger = ( InternalEObject ) ratioTapChanger;
            ratioTapChanger = ( RatioTapChanger ) eResolveProxy( oldRatioTapChanger );
            if( ratioTapChanger != oldRatioTapChanger ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, ratioTapChanger ) );
            }
        }
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RatioTapChanger basicGetRatioTapChanger() {
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRatioTapChanger( RatioTapChanger newRatioTapChanger, NotificationChain msgs ) {
        RatioTapChanger oldRatioTapChanger = ratioTapChanger;
        ratioTapChanger = newRatioTapChanger;
        boolean oldRatioTapChangerESet = ratioTapChangerESet;
        ratioTapChangerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, newRatioTapChanger,
                    !oldRatioTapChangerESet );
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
    public void setRatioTapChanger( RatioTapChanger newRatioTapChanger ) {
        if( newRatioTapChanger != ratioTapChanger ) {
            NotificationChain msgs = null;
            if( ratioTapChanger != null ) msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            if( newRatioTapChanger != null ) msgs = ( ( InternalEObject ) newRatioTapChanger ).eInverseAdd( this,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            msgs = basicSetRatioTapChanger( newRatioTapChanger, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerESet = ratioTapChangerESet;
            ratioTapChangerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER,
                        newRatioTapChanger, newRatioTapChanger, !oldRatioTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRatioTapChanger( NotificationChain msgs ) {
        RatioTapChanger oldRatioTapChanger = ratioTapChanger;
        ratioTapChanger = null;
        boolean oldRatioTapChangerESet = ratioTapChangerESet;
        ratioTapChangerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, null, oldRatioTapChangerESet );
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
    public void unsetRatioTapChanger() {
        if( ratioTapChanger != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            msgs = basicUnsetRatioTapChanger( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerESet = ratioTapChangerESet;
            ratioTapChangerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, null, null, oldRatioTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChanger() {
        return ratioTapChangerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerStarImpedance getStarImpedance() {
        return starImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStarImpedance( TransformerStarImpedance newStarImpedance,
            NotificationChain msgs ) {
        TransformerStarImpedance oldStarImpedance = starImpedance;
        starImpedance = newStarImpedance;
        boolean oldStarImpedanceESet = starImpedanceESet;
        starImpedanceESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__STAR_IMPEDANCE, oldStarImpedance, newStarImpedance,
                    !oldStarImpedanceESet );
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
    public void setStarImpedance( TransformerStarImpedance newStarImpedance ) {
        if( newStarImpedance != starImpedance ) {
            NotificationChain msgs = null;
            if( starImpedance != null ) msgs = ( ( InternalEObject ) starImpedance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs );
            if( newStarImpedance != null ) msgs = ( ( InternalEObject ) newStarImpedance ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs );
            msgs = basicSetStarImpedance( newStarImpedance, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStarImpedanceESet = starImpedanceESet;
            starImpedanceESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__STAR_IMPEDANCE,
                        newStarImpedance, newStarImpedance, !oldStarImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStarImpedance( NotificationChain msgs ) {
        TransformerStarImpedance oldStarImpedance = starImpedance;
        starImpedance = null;
        boolean oldStarImpedanceESet = starImpedanceESet;
        starImpedanceESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__STAR_IMPEDANCE, oldStarImpedance, null, oldStarImpedanceESet );
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
    public void unsetStarImpedance() {
        if( starImpedance != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) starImpedance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs );
            msgs = basicUnsetStarImpedance( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStarImpedanceESet = starImpedanceESet;
            starImpedanceESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__STAR_IMPEDANCE, null, null, oldStarImpedanceESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStarImpedance() {
        return starImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerMeshImpedance > getFromMeshImpedance() {
        if( fromMeshImpedance == null ) {
            fromMeshImpedance = new EObjectWithInverseResolvingEList.Unsettable< TransformerMeshImpedance >(
                    TransformerMeshImpedance.class, this, CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE,
                    CimPackage.TRANSFORMER_MESH_IMPEDANCE__FROM_TRANSFORMER_END );
        }
        return fromMeshImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromMeshImpedance() {
        if( fromMeshImpedance != null ) ( ( InternalEList.Unsettable< ? > ) fromMeshImpedance ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromMeshImpedance() {
        return fromMeshImpedance != null && ( ( InternalEList.Unsettable< ? > ) fromMeshImpedance ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChanger getPhaseTapChanger() {
        return phaseTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhaseTapChanger( PhaseTapChanger newPhaseTapChanger, NotificationChain msgs ) {
        PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
        phaseTapChanger = newPhaseTapChanger;
        boolean oldPhaseTapChangerESet = phaseTapChangerESet;
        phaseTapChangerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, oldPhaseTapChanger, newPhaseTapChanger,
                    !oldPhaseTapChangerESet );
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
    public void setPhaseTapChanger( PhaseTapChanger newPhaseTapChanger ) {
        if( newPhaseTapChanger != phaseTapChanger ) {
            NotificationChain msgs = null;
            if( phaseTapChanger != null ) msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            if( newPhaseTapChanger != null ) msgs = ( ( InternalEObject ) newPhaseTapChanger ).eInverseAdd( this,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            msgs = basicSetPhaseTapChanger( newPhaseTapChanger, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerESet = phaseTapChangerESet;
            phaseTapChangerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER,
                        newPhaseTapChanger, newPhaseTapChanger, !oldPhaseTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhaseTapChanger( NotificationChain msgs ) {
        PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
        phaseTapChanger = null;
        boolean oldPhaseTapChangerESet = phaseTapChangerESet;
        phaseTapChangerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, oldPhaseTapChanger, null, oldPhaseTapChangerESet );
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
    public void unsetPhaseTapChanger() {
        if( phaseTapChanger != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            msgs = basicUnsetPhaseTapChanger( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerESet = phaseTapChangerESet;
            phaseTapChangerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, null, null, oldPhaseTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseTapChanger() {
        return phaseTapChangerESet;
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
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getToMeshImpedance() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__TERMINAL:
            if( terminal != null ) msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this,
                    CimPackage.TERMINAL__TRANSFORMER_END, Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            if( coreAdmittance != null ) msgs = ( ( InternalEObject ) coreAdmittance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_CORE_ADMITTANCE__TRANSFORMER_END, TransformerCoreAdmittance.class, msgs );
            return basicSetCoreAdmittance( ( TransformerCoreAdmittance ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            if( baseVoltage != null ) msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            if( ratioTapChanger != null ) msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            return basicSetRatioTapChanger( ( RatioTapChanger ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            if( starImpedance != null ) msgs = ( ( InternalEObject ) starImpedance ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_STAR_IMPEDANCE__TRANSFORMER_END, TransformerStarImpedance.class, msgs );
            return basicSetStarImpedance( ( TransformerStarImpedance ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getFromMeshImpedance() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            if( phaseTapChanger != null ) msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            return basicSetPhaseTapChanger( ( PhaseTapChanger ) otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            return ( ( InternalEList< ? > ) getToMeshImpedance() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            return basicUnsetCoreAdmittance( msgs );
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            return basicUnsetRatioTapChanger( msgs );
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            return basicUnsetStarImpedance( msgs );
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            return ( ( InternalEList< ? > ) getFromMeshImpedance() ).basicRemove( otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            return basicUnsetPhaseTapChanger( msgs );
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
        case CimPackage.TRANSFORMER_END__BMAG_SAT:
            return getBmagSat();
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            return getEndNumber();
        case CimPackage.TRANSFORMER_END__GROUNDED:
            return getGrounded();
        case CimPackage.TRANSFORMER_END__MAG_BASE_U:
            return getMagBaseU();
        case CimPackage.TRANSFORMER_END__MAG_SAT_FLUX:
            return getMagSatFlux();
        case CimPackage.TRANSFORMER_END__RGROUND:
            return getRground();
        case CimPackage.TRANSFORMER_END__XGROUND:
            return getXground();
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            return getToMeshImpedance();
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return getTerminal();
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            return getCoreAdmittance();
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            if( resolve ) return getRatioTapChanger();
            return basicGetRatioTapChanger();
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            return getStarImpedance();
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            return getFromMeshImpedance();
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            return getPhaseTapChanger();
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
        case CimPackage.TRANSFORMER_END__BMAG_SAT:
            setBmagSat( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            setEndNumber( ( Integer ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__MAG_BASE_U:
            setMagBaseU( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__MAG_SAT_FLUX:
            setMagSatFlux( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__RGROUND:
            setRground( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__XGROUND:
            setXground( ( Float ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            getToMeshImpedance().clear();
            getToMeshImpedance().addAll( ( Collection< ? extends TransformerMeshImpedance > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__TERMINAL:
            setTerminal( ( Terminal ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            setCoreAdmittance( ( TransformerCoreAdmittance ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            setRatioTapChanger( ( RatioTapChanger ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            setStarImpedance( ( TransformerStarImpedance ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            getFromMeshImpedance().clear();
            getFromMeshImpedance().addAll( ( Collection< ? extends TransformerMeshImpedance > ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            setPhaseTapChanger( ( PhaseTapChanger ) newValue );
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
        case CimPackage.TRANSFORMER_END__BMAG_SAT:
            unsetBmagSat();
            return;
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            unsetEndNumber();
            return;
        case CimPackage.TRANSFORMER_END__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.TRANSFORMER_END__MAG_BASE_U:
            unsetMagBaseU();
            return;
        case CimPackage.TRANSFORMER_END__MAG_SAT_FLUX:
            unsetMagSatFlux();
            return;
        case CimPackage.TRANSFORMER_END__RGROUND:
            unsetRground();
            return;
        case CimPackage.TRANSFORMER_END__XGROUND:
            unsetXground();
            return;
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            unsetToMeshImpedance();
            return;
        case CimPackage.TRANSFORMER_END__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            unsetCoreAdmittance();
            return;
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            unsetRatioTapChanger();
            return;
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            unsetStarImpedance();
            return;
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            unsetFromMeshImpedance();
            return;
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            unsetPhaseTapChanger();
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
        case CimPackage.TRANSFORMER_END__BMAG_SAT:
            return isSetBmagSat();
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            return isSetEndNumber();
        case CimPackage.TRANSFORMER_END__GROUNDED:
            return isSetGrounded();
        case CimPackage.TRANSFORMER_END__MAG_BASE_U:
            return isSetMagBaseU();
        case CimPackage.TRANSFORMER_END__MAG_SAT_FLUX:
            return isSetMagSatFlux();
        case CimPackage.TRANSFORMER_END__RGROUND:
            return isSetRground();
        case CimPackage.TRANSFORMER_END__XGROUND:
            return isSetXground();
        case CimPackage.TRANSFORMER_END__TO_MESH_IMPEDANCE:
            return isSetToMeshImpedance();
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return isSetTerminal();
        case CimPackage.TRANSFORMER_END__CORE_ADMITTANCE:
            return isSetCoreAdmittance();
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            return isSetRatioTapChanger();
        case CimPackage.TRANSFORMER_END__STAR_IMPEDANCE:
            return isSetStarImpedance();
        case CimPackage.TRANSFORMER_END__FROM_MESH_IMPEDANCE:
            return isSetFromMeshImpedance();
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            return isSetPhaseTapChanger();
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
        result.append( " (bmagSat: " );
        if( bmagSatESet )
            result.append( bmagSat );
        else
            result.append( "<unset>" );
        result.append( ", endNumber: " );
        if( endNumberESet )
            result.append( endNumber );
        else
            result.append( "<unset>" );
        result.append( ", grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", magBaseU: " );
        if( magBaseUESet )
            result.append( magBaseU );
        else
            result.append( "<unset>" );
        result.append( ", magSatFlux: " );
        if( magSatFluxESet )
            result.append( magSatFlux );
        else
            result.append( "<unset>" );
        result.append( ", rground: " );
        if( rgroundESet )
            result.append( rground );
        else
            result.append( "<unset>" );
        result.append( ", xground: " );
        if( xgroundESet )
            result.append( xground );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerEndImpl
