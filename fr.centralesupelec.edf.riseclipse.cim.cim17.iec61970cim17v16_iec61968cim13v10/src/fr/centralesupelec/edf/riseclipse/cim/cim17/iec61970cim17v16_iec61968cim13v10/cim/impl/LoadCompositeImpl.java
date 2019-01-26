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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadComposite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEpfd <em>Epfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEpfs <em>Epfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEpvd <em>Epvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEpvs <em>Epvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEqfd <em>Eqfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEqfs <em>Eqfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEqvd <em>Eqvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getEqvs <em>Eqvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getH <em>H</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getLfrac <em>Lfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.LoadCompositeImpl#getPfrac <em>Pfrac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadCompositeImpl extends LoadDynamicsImpl implements LoadComposite {
    /**
     * The default value of the '{@link #getEpfd() <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpfd()
     * @generated
     * @ordered
     */
    protected static final Float EPFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpfd() <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpfd()
     * @generated
     * @ordered
     */
    protected Float epfd = EPFD_EDEFAULT;

    /**
     * This is true if the Epfd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean epfdESet;

    /**
     * The default value of the '{@link #getEpfs() <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpfs()
     * @generated
     * @ordered
     */
    protected static final Float EPFS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpfs() <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpfs()
     * @generated
     * @ordered
     */
    protected Float epfs = EPFS_EDEFAULT;

    /**
     * This is true if the Epfs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean epfsESet;

    /**
     * The default value of the '{@link #getEpvd() <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpvd()
     * @generated
     * @ordered
     */
    protected static final Float EPVD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpvd() <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpvd()
     * @generated
     * @ordered
     */
    protected Float epvd = EPVD_EDEFAULT;

    /**
     * This is true if the Epvd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean epvdESet;

    /**
     * The default value of the '{@link #getEpvs() <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpvs()
     * @generated
     * @ordered
     */
    protected static final Float EPVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEpvs() <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEpvs()
     * @generated
     * @ordered
     */
    protected Float epvs = EPVS_EDEFAULT;

    /**
     * This is true if the Epvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean epvsESet;

    /**
     * The default value of the '{@link #getEqfd() <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqfd()
     * @generated
     * @ordered
     */
    protected static final Float EQFD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEqfd() <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqfd()
     * @generated
     * @ordered
     */
    protected Float eqfd = EQFD_EDEFAULT;

    /**
     * This is true if the Eqfd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eqfdESet;

    /**
     * The default value of the '{@link #getEqfs() <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqfs()
     * @generated
     * @ordered
     */
    protected static final Float EQFS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEqfs() <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqfs()
     * @generated
     * @ordered
     */
    protected Float eqfs = EQFS_EDEFAULT;

    /**
     * This is true if the Eqfs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eqfsESet;

    /**
     * The default value of the '{@link #getEqvd() <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqvd()
     * @generated
     * @ordered
     */
    protected static final Float EQVD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEqvd() <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqvd()
     * @generated
     * @ordered
     */
    protected Float eqvd = EQVD_EDEFAULT;

    /**
     * This is true if the Eqvd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eqvdESet;

    /**
     * The default value of the '{@link #getEqvs() <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqvs()
     * @generated
     * @ordered
     */
    protected static final Float EQVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEqvs() <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEqvs()
     * @generated
     * @ordered
     */
    protected Float eqvs = EQVS_EDEFAULT;

    /**
     * This is true if the Eqvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eqvsESet;

    /**
     * The default value of the '{@link #getH() <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH()
     * @generated
     * @ordered
     */
    protected static final Float H_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getH() <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH()
     * @generated
     * @ordered
     */
    protected Float h = H_EDEFAULT;

    /**
     * This is true if the H attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hESet;

    /**
     * The default value of the '{@link #getLfrac() <em>Lfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLfrac()
     * @generated
     * @ordered
     */
    protected static final Float LFRAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLfrac() <em>Lfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLfrac()
     * @generated
     * @ordered
     */
    protected Float lfrac = LFRAC_EDEFAULT;

    /**
     * This is true if the Lfrac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lfracESet;

    /**
     * The default value of the '{@link #getPfrac() <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfrac()
     * @generated
     * @ordered
     */
    protected static final Float PFRAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPfrac() <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfrac()
     * @generated
     * @ordered
     */
    protected Float pfrac = PFRAC_EDEFAULT;

    /**
     * This is true if the Pfrac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfracESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadCompositeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadComposite();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEpfd() {
        return epfd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEpfd( Float newEpfd ) {
        Float oldEpfd = epfd;
        epfd = newEpfd;
        boolean oldEpfdESet = epfdESet;
        epfdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EPFD, oldEpfd, epfd, !oldEpfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEpfd() {
        Float oldEpfd = epfd;
        boolean oldEpfdESet = epfdESet;
        epfd = EPFD_EDEFAULT;
        epfdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EPFD, oldEpfd, EPFD_EDEFAULT, oldEpfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEpfd() {
        return epfdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEpfs() {
        return epfs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEpfs( Float newEpfs ) {
        Float oldEpfs = epfs;
        epfs = newEpfs;
        boolean oldEpfsESet = epfsESet;
        epfsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EPFS, oldEpfs, epfs, !oldEpfsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEpfs() {
        Float oldEpfs = epfs;
        boolean oldEpfsESet = epfsESet;
        epfs = EPFS_EDEFAULT;
        epfsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EPFS, oldEpfs, EPFS_EDEFAULT, oldEpfsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEpfs() {
        return epfsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEpvd() {
        return epvd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEpvd( Float newEpvd ) {
        Float oldEpvd = epvd;
        epvd = newEpvd;
        boolean oldEpvdESet = epvdESet;
        epvdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EPVD, oldEpvd, epvd, !oldEpvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEpvd() {
        Float oldEpvd = epvd;
        boolean oldEpvdESet = epvdESet;
        epvd = EPVD_EDEFAULT;
        epvdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EPVD, oldEpvd, EPVD_EDEFAULT, oldEpvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEpvd() {
        return epvdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEpvs() {
        return epvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEpvs( Float newEpvs ) {
        Float oldEpvs = epvs;
        epvs = newEpvs;
        boolean oldEpvsESet = epvsESet;
        epvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EPVS, oldEpvs, epvs, !oldEpvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEpvs() {
        Float oldEpvs = epvs;
        boolean oldEpvsESet = epvsESet;
        epvs = EPVS_EDEFAULT;
        epvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EPVS, oldEpvs, EPVS_EDEFAULT, oldEpvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEpvs() {
        return epvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEqfd() {
        return eqfd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEqfd( Float newEqfd ) {
        Float oldEqfd = eqfd;
        eqfd = newEqfd;
        boolean oldEqfdESet = eqfdESet;
        eqfdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EQFD, oldEqfd, eqfd, !oldEqfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqfd() {
        Float oldEqfd = eqfd;
        boolean oldEqfdESet = eqfdESet;
        eqfd = EQFD_EDEFAULT;
        eqfdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EQFD, oldEqfd, EQFD_EDEFAULT, oldEqfdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqfd() {
        return eqfdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEqfs() {
        return eqfs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEqfs( Float newEqfs ) {
        Float oldEqfs = eqfs;
        eqfs = newEqfs;
        boolean oldEqfsESet = eqfsESet;
        eqfsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EQFS, oldEqfs, eqfs, !oldEqfsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqfs() {
        Float oldEqfs = eqfs;
        boolean oldEqfsESet = eqfsESet;
        eqfs = EQFS_EDEFAULT;
        eqfsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EQFS, oldEqfs, EQFS_EDEFAULT, oldEqfsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqfs() {
        return eqfsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEqvd() {
        return eqvd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEqvd( Float newEqvd ) {
        Float oldEqvd = eqvd;
        eqvd = newEqvd;
        boolean oldEqvdESet = eqvdESet;
        eqvdESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EQVD, oldEqvd, eqvd, !oldEqvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqvd() {
        Float oldEqvd = eqvd;
        boolean oldEqvdESet = eqvdESet;
        eqvd = EQVD_EDEFAULT;
        eqvdESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EQVD, oldEqvd, EQVD_EDEFAULT, oldEqvdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqvd() {
        return eqvdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEqvs() {
        return eqvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEqvs( Float newEqvs ) {
        Float oldEqvs = eqvs;
        eqvs = newEqvs;
        boolean oldEqvsESet = eqvsESet;
        eqvsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__EQVS, oldEqvs, eqvs, !oldEqvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEqvs() {
        Float oldEqvs = eqvs;
        boolean oldEqvsESet = eqvsESet;
        eqvs = EQVS_EDEFAULT;
        eqvsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__EQVS, oldEqvs, EQVS_EDEFAULT, oldEqvsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEqvs() {
        return eqvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getH() {
        return h;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setH( Float newH ) {
        Float oldH = h;
        h = newH;
        boolean oldHESet = hESet;
        hESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_COMPOSITE__H, oldH, h, !oldHESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetH() {
        Float oldH = h;
        boolean oldHESet = hESet;
        h = H_EDEFAULT;
        hESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__H, oldH, H_EDEFAULT, oldHESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetH() {
        return hESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLfrac() {
        return lfrac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLfrac( Float newLfrac ) {
        Float oldLfrac = lfrac;
        lfrac = newLfrac;
        boolean oldLfracESet = lfracESet;
        lfracESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__LFRAC, oldLfrac, lfrac, !oldLfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLfrac() {
        Float oldLfrac = lfrac;
        boolean oldLfracESet = lfracESet;
        lfrac = LFRAC_EDEFAULT;
        lfracESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__LFRAC, oldLfrac, LFRAC_EDEFAULT, oldLfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLfrac() {
        return lfracESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPfrac() {
        return pfrac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPfrac( Float newPfrac ) {
        Float oldPfrac = pfrac;
        pfrac = newPfrac;
        boolean oldPfracESet = pfracESet;
        pfracESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.LOAD_COMPOSITE__PFRAC, oldPfrac, pfrac, !oldPfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPfrac() {
        Float oldPfrac = pfrac;
        boolean oldPfracESet = pfracESet;
        pfrac = PFRAC_EDEFAULT;
        pfracESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.LOAD_COMPOSITE__PFRAC, oldPfrac, PFRAC_EDEFAULT, oldPfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPfrac() {
        return pfracESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LOAD_COMPOSITE__EPFD:
            return getEpfd();
        case CimPackage.LOAD_COMPOSITE__EPFS:
            return getEpfs();
        case CimPackage.LOAD_COMPOSITE__EPVD:
            return getEpvd();
        case CimPackage.LOAD_COMPOSITE__EPVS:
            return getEpvs();
        case CimPackage.LOAD_COMPOSITE__EQFD:
            return getEqfd();
        case CimPackage.LOAD_COMPOSITE__EQFS:
            return getEqfs();
        case CimPackage.LOAD_COMPOSITE__EQVD:
            return getEqvd();
        case CimPackage.LOAD_COMPOSITE__EQVS:
            return getEqvs();
        case CimPackage.LOAD_COMPOSITE__H:
            return getH();
        case CimPackage.LOAD_COMPOSITE__LFRAC:
            return getLfrac();
        case CimPackage.LOAD_COMPOSITE__PFRAC:
            return getPfrac();
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
        case CimPackage.LOAD_COMPOSITE__EPFD:
            setEpfd( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EPFS:
            setEpfs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EPVD:
            setEpvd( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EPVS:
            setEpvs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EQFD:
            setEqfd( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EQFS:
            setEqfs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EQVD:
            setEqvd( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__EQVS:
            setEqvs( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__H:
            setH( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__LFRAC:
            setLfrac( ( Float ) newValue );
            return;
        case CimPackage.LOAD_COMPOSITE__PFRAC:
            setPfrac( ( Float ) newValue );
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
        case CimPackage.LOAD_COMPOSITE__EPFD:
            unsetEpfd();
            return;
        case CimPackage.LOAD_COMPOSITE__EPFS:
            unsetEpfs();
            return;
        case CimPackage.LOAD_COMPOSITE__EPVD:
            unsetEpvd();
            return;
        case CimPackage.LOAD_COMPOSITE__EPVS:
            unsetEpvs();
            return;
        case CimPackage.LOAD_COMPOSITE__EQFD:
            unsetEqfd();
            return;
        case CimPackage.LOAD_COMPOSITE__EQFS:
            unsetEqfs();
            return;
        case CimPackage.LOAD_COMPOSITE__EQVD:
            unsetEqvd();
            return;
        case CimPackage.LOAD_COMPOSITE__EQVS:
            unsetEqvs();
            return;
        case CimPackage.LOAD_COMPOSITE__H:
            unsetH();
            return;
        case CimPackage.LOAD_COMPOSITE__LFRAC:
            unsetLfrac();
            return;
        case CimPackage.LOAD_COMPOSITE__PFRAC:
            unsetPfrac();
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
        case CimPackage.LOAD_COMPOSITE__EPFD:
            return isSetEpfd();
        case CimPackage.LOAD_COMPOSITE__EPFS:
            return isSetEpfs();
        case CimPackage.LOAD_COMPOSITE__EPVD:
            return isSetEpvd();
        case CimPackage.LOAD_COMPOSITE__EPVS:
            return isSetEpvs();
        case CimPackage.LOAD_COMPOSITE__EQFD:
            return isSetEqfd();
        case CimPackage.LOAD_COMPOSITE__EQFS:
            return isSetEqfs();
        case CimPackage.LOAD_COMPOSITE__EQVD:
            return isSetEqvd();
        case CimPackage.LOAD_COMPOSITE__EQVS:
            return isSetEqvs();
        case CimPackage.LOAD_COMPOSITE__H:
            return isSetH();
        case CimPackage.LOAD_COMPOSITE__LFRAC:
            return isSetLfrac();
        case CimPackage.LOAD_COMPOSITE__PFRAC:
            return isSetPfrac();
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
        result.append( " (epfd: " );
        if( epfdESet )
            result.append( epfd );
        else
            result.append( "<unset>" );
        result.append( ", epfs: " );
        if( epfsESet )
            result.append( epfs );
        else
            result.append( "<unset>" );
        result.append( ", epvd: " );
        if( epvdESet )
            result.append( epvd );
        else
            result.append( "<unset>" );
        result.append( ", epvs: " );
        if( epvsESet )
            result.append( epvs );
        else
            result.append( "<unset>" );
        result.append( ", eqfd: " );
        if( eqfdESet )
            result.append( eqfd );
        else
            result.append( "<unset>" );
        result.append( ", eqfs: " );
        if( eqfsESet )
            result.append( eqfs );
        else
            result.append( "<unset>" );
        result.append( ", eqvd: " );
        if( eqvdESet )
            result.append( eqvd );
        else
            result.append( "<unset>" );
        result.append( ", eqvs: " );
        if( eqvsESet )
            result.append( eqvs );
        else
            result.append( "<unset>" );
        result.append( ", h: " );
        if( hESet )
            result.append( h );
        else
            result.append( "<unset>" );
        result.append( ", lfrac: " );
        if( lfracESet )
            result.append( lfrac );
        else
            result.append( "<unset>" );
        result.append( ", pfrac: " );
        if( pfracESet )
            result.append( pfrac );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadCompositeImpl
