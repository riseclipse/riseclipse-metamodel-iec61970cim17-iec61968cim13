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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ERTConfidenceKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.EstimatedRestorationTime;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Outage;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Estimated Restoration Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EstimatedRestorationTimeImpl#getConfidenceKind <em>Confidence Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EstimatedRestorationTimeImpl#getErt <em>Ert</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EstimatedRestorationTimeImpl#getErtSource <em>Ert Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.EstimatedRestorationTimeImpl#getOutage <em>Outage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EstimatedRestorationTimeImpl extends CimObjectWithIDImpl implements EstimatedRestorationTime {
    /**
     * The default value of the '{@link #getConfidenceKind() <em>Confidence Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceKind()
     * @generated
     * @ordered
     */
    protected static final ERTConfidenceKind CONFIDENCE_KIND_EDEFAULT = ERTConfidenceKind.HIGH;

    /**
     * The cached value of the '{@link #getConfidenceKind() <em>Confidence Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidenceKind()
     * @generated
     * @ordered
     */
    protected ERTConfidenceKind confidenceKind = CONFIDENCE_KIND_EDEFAULT;

    /**
     * This is true if the Confidence Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confidenceKindESet;

    /**
     * The default value of the '{@link #getErt() <em>Ert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErt()
     * @generated
     * @ordered
     */
    protected static final Date ERT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErt() <em>Ert</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErt()
     * @generated
     * @ordered
     */
    protected Date ert = ERT_EDEFAULT;

    /**
     * This is true if the Ert attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ertESet;

    /**
     * The default value of the '{@link #getErtSource() <em>Ert Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErtSource()
     * @generated
     * @ordered
     */
    protected static final String ERT_SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getErtSource() <em>Ert Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getErtSource()
     * @generated
     * @ordered
     */
    protected String ertSource = ERT_SOURCE_EDEFAULT;

    /**
     * This is true if the Ert Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ertSourceESet;

    /**
     * The cached value of the '{@link #getOutage() <em>Outage</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutage()
     * @generated
     * @ordered
     */
    protected EList< Outage > outage;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EstimatedRestorationTimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEstimatedRestorationTime();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ERTConfidenceKind getConfidenceKind() {
        return confidenceKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfidenceKind( ERTConfidenceKind newConfidenceKind ) {
        ERTConfidenceKind oldConfidenceKind = confidenceKind;
        confidenceKind = newConfidenceKind == null ? CONFIDENCE_KIND_EDEFAULT : newConfidenceKind;
        boolean oldConfidenceKindESet = confidenceKindESet;
        confidenceKindESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND,
                        oldConfidenceKind, confidenceKind, !oldConfidenceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfidenceKind() {
        ERTConfidenceKind oldConfidenceKind = confidenceKind;
        boolean oldConfidenceKindESet = confidenceKindESet;
        confidenceKind = CONFIDENCE_KIND_EDEFAULT;
        confidenceKindESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND,
                        oldConfidenceKind, CONFIDENCE_KIND_EDEFAULT, oldConfidenceKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfidenceKind() {
        return confidenceKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getErt() {
        return ert;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setErt( Date newErt ) {
        Date oldErt = ert;
        ert = newErt;
        boolean oldErtESet = ertESet;
        ertESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ESTIMATED_RESTORATION_TIME__ERT, oldErt, ert, !oldErtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetErt() {
        Date oldErt = ert;
        boolean oldErtESet = ertESet;
        ert = ERT_EDEFAULT;
        ertESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ESTIMATED_RESTORATION_TIME__ERT, oldErt, ERT_EDEFAULT, oldErtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetErt() {
        return ertESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getErtSource() {
        return ertSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setErtSource( String newErtSource ) {
        String oldErtSource = ertSource;
        ertSource = newErtSource;
        boolean oldErtSourceESet = ertSourceESet;
        ertSourceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE, oldErtSource, ertSource, !oldErtSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetErtSource() {
        String oldErtSource = ertSource;
        boolean oldErtSourceESet = ertSourceESet;
        ertSource = ERT_SOURCE_EDEFAULT;
        ertSourceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE,
                    oldErtSource, ERT_SOURCE_EDEFAULT, oldErtSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetErtSource() {
        return ertSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Outage > getOutage() {
        if( outage == null ) {
            outage = new EObjectWithInverseResolvingEList.Unsettable< Outage >( Outage.class, this,
                    CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE, CimPackage.OUTAGE__ESTIMATED_RESTORATION_TIME );
        }
        return outage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOutage() {
        if( outage != null ) ( ( InternalEList.Unsettable< ? > ) outage ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOutage() {
        return outage != null && ( ( InternalEList.Unsettable< ? > ) outage ).isSet();
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOutage() ).basicAdd( otherEnd,
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            return ( ( InternalEList< ? > ) getOutage() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND:
            return getConfidenceKind();
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT:
            return getErt();
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE:
            return getErtSource();
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            return getOutage();
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND:
            setConfidenceKind( ( ERTConfidenceKind ) newValue );
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT:
            setErt( ( Date ) newValue );
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE:
            setErtSource( ( String ) newValue );
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            getOutage().clear();
            getOutage().addAll( ( Collection< ? extends Outage > ) newValue );
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND:
            unsetConfidenceKind();
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT:
            unsetErt();
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE:
            unsetErtSource();
            return;
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            unsetOutage();
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
        case CimPackage.ESTIMATED_RESTORATION_TIME__CONFIDENCE_KIND:
            return isSetConfidenceKind();
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT:
            return isSetErt();
        case CimPackage.ESTIMATED_RESTORATION_TIME__ERT_SOURCE:
            return isSetErtSource();
        case CimPackage.ESTIMATED_RESTORATION_TIME__OUTAGE:
            return isSetOutage();
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
        result.append( " (confidenceKind: " );
        if( confidenceKindESet )
            result.append( confidenceKind );
        else
            result.append( "<unset>" );
        result.append( ", ert: " );
        if( ertESet )
            result.append( ert );
        else
            result.append( "<unset>" );
        result.append( ", ertSource: " );
        if( ertSourceESet )
            result.append( ertSource );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EstimatedRestorationTimeImpl
