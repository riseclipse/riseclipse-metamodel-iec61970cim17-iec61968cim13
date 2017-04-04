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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ActivityRecord;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Asset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Author;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Status;

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
 * An implementation of the model object '<em><b>Activity Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ActivityRecordImpl#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityRecordImpl extends IdentifiedObjectImpl implements ActivityRecord {
    /**
     * The default value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date CREATED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreatedDateTime() <em>Created Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreatedDateTime()
     * @generated
     * @ordered
     */
    protected Date createdDateTime = CREATED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Created Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean createdDateTimeESet;

    /**
     * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected static final String REASON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReason()
     * @generated
     * @ordered
     */
    protected String reason = REASON_EDEFAULT;

    /**
     * This is true if the Reason attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reasonESet;

    /**
     * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected static final String SEVERITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeverity()
     * @generated
     * @ordered
     */
    protected String severity = SEVERITY_EDEFAULT;

    /**
     * This is true if the Severity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean severityESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStatus()
     * @generated
     * @ordered
     */
    protected Status status;

    /**
     * This is true if the Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean statusESet;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected Author author;

    /**
     * This is true if the Author reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean authorESet;

    /**
     * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssets()
     * @generated
     * @ordered
     */
    protected EList< Asset > assets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActivityRecordImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getActivityRecord();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCreatedDateTime( Date newCreatedDateTime ) {
        Date oldCreatedDateTime = createdDateTime;
        createdDateTime = newCreatedDateTime;
        boolean oldCreatedDateTimeESet = createdDateTimeESet;
        createdDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME,
                    oldCreatedDateTime, createdDateTime, !oldCreatedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCreatedDateTime() {
        Date oldCreatedDateTime = createdDateTime;
        boolean oldCreatedDateTimeESet = createdDateTimeESet;
        createdDateTime = CREATED_DATE_TIME_EDEFAULT;
        createdDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME,
                    oldCreatedDateTime, CREATED_DATE_TIME_EDEFAULT, oldCreatedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCreatedDateTime() {
        return createdDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getReason() {
        return reason;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReason( String newReason ) {
        String oldReason = reason;
        reason = newReason;
        boolean oldReasonESet = reasonESet;
        reasonESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACTIVITY_RECORD__REASON, oldReason, reason, !oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReason() {
        String oldReason = reason;
        boolean oldReasonESet = reasonESet;
        reason = REASON_EDEFAULT;
        reasonESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACTIVITY_RECORD__REASON, oldReason, REASON_EDEFAULT, oldReasonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReason() {
        return reasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSeverity() {
        return severity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeverity( String newSeverity ) {
        String oldSeverity = severity;
        severity = newSeverity;
        boolean oldSeverityESet = severityESet;
        severityESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACTIVITY_RECORD__SEVERITY, oldSeverity, severity, !oldSeverityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeverity() {
        String oldSeverity = severity;
        boolean oldSeverityESet = severityESet;
        severity = SEVERITY_EDEFAULT;
        severityESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACTIVITY_RECORD__SEVERITY, oldSeverity, SEVERITY_EDEFAULT, oldSeverityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeverity() {
        return severityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType( String newType ) {
        String oldType = type;
        type = newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ACTIVITY_RECORD__TYPE, oldType, type, !oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetType() {
        String oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ACTIVITY_RECORD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetType() {
        return typeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Status getStatus() {
        return status;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStatus( Status newStatus, NotificationChain msgs ) {
        Status oldStatus = status;
        status = newStatus;
        boolean oldStatusESet = statusESet;
        statusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACTIVITY_RECORD__STATUS, oldStatus, newStatus, !oldStatusESet );
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
    public void setStatus( Status newStatus ) {
        if( newStatus != status ) {
            NotificationChain msgs = null;
            if( status != null ) msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ACTIVITY_RECORD__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ACTIVITY_RECORD__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACTIVITY_RECORD__STATUS, newStatus, newStatus, !oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStatus( NotificationChain msgs ) {
        Status oldStatus = status;
        status = null;
        boolean oldStatusESet = statusESet;
        statusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACTIVITY_RECORD__STATUS, oldStatus, null, oldStatusESet );
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
    public void unsetStatus() {
        if( status != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) status ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.ACTIVITY_RECORD__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACTIVITY_RECORD__STATUS, null, null, oldStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStatus() {
        return statusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Author getAuthor() {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAuthor( Author newAuthor, NotificationChain msgs ) {
        Author oldAuthor = author;
        author = newAuthor;
        boolean oldAuthorESet = authorESet;
        authorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACTIVITY_RECORD__AUTHOR, oldAuthor, newAuthor, !oldAuthorESet );
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
    public void setAuthor( Author newAuthor ) {
        if( newAuthor != author ) {
            NotificationChain msgs = null;
            if( author != null ) msgs = ( ( InternalEObject ) author ).eInverseRemove( this,
                    CimPackage.AUTHOR__ACTIVITY_RECORDS, Author.class, msgs );
            if( newAuthor != null ) msgs = ( ( InternalEObject ) newAuthor ).eInverseAdd( this,
                    CimPackage.AUTHOR__ACTIVITY_RECORDS, Author.class, msgs );
            msgs = basicSetAuthor( newAuthor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuthorESet = authorESet;
            authorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACTIVITY_RECORD__AUTHOR, newAuthor, newAuthor, !oldAuthorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAuthor( NotificationChain msgs ) {
        Author oldAuthor = author;
        author = null;
        boolean oldAuthorESet = authorESet;
        authorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACTIVITY_RECORD__AUTHOR, oldAuthor, null, oldAuthorESet );
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
    public void unsetAuthor() {
        if( author != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) author ).eInverseRemove( this, CimPackage.AUTHOR__ACTIVITY_RECORDS,
                    Author.class, msgs );
            msgs = basicUnsetAuthor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuthorESet = authorESet;
            authorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACTIVITY_RECORD__AUTHOR, null, null, oldAuthorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuthor() {
        return authorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Asset > getAssets() {
        if( assets == null ) {
            assets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< Asset >( Asset.class, this,
                    CimPackage.ACTIVITY_RECORD__ASSETS, CimPackage.ASSET__ACTIVITY_RECORDS );
        }
        return assets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAssets() {
        if( assets != null ) ( ( InternalEList.Unsettable< ? > ) assets ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAssets() {
        return assets != null && ( ( InternalEList.Unsettable< ? > ) assets ).isSet();
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
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            if( author != null ) msgs = ( ( InternalEObject ) author ).eInverseRemove( this,
                    CimPackage.AUTHOR__ACTIVITY_RECORDS, Author.class, msgs );
            return basicSetAuthor( ( Author ) otherEnd, msgs );
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAssets() ).basicAdd( otherEnd,
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
        case CimPackage.ACTIVITY_RECORD__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            return basicUnsetAuthor( msgs );
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            return ( ( InternalEList< ? > ) getAssets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
            return getCreatedDateTime();
        case CimPackage.ACTIVITY_RECORD__REASON:
            return getReason();
        case CimPackage.ACTIVITY_RECORD__SEVERITY:
            return getSeverity();
        case CimPackage.ACTIVITY_RECORD__TYPE:
            return getType();
        case CimPackage.ACTIVITY_RECORD__STATUS:
            return getStatus();
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            return getAuthor();
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            return getAssets();
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
        case CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
            setCreatedDateTime( ( Date ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__REASON:
            setReason( ( String ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__SEVERITY:
            setSeverity( ( String ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            setAuthor( ( Author ) newValue );
            return;
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            getAssets().clear();
            getAssets().addAll( ( Collection< ? extends Asset > ) newValue );
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
        case CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
            unsetCreatedDateTime();
            return;
        case CimPackage.ACTIVITY_RECORD__REASON:
            unsetReason();
            return;
        case CimPackage.ACTIVITY_RECORD__SEVERITY:
            unsetSeverity();
            return;
        case CimPackage.ACTIVITY_RECORD__TYPE:
            unsetType();
            return;
        case CimPackage.ACTIVITY_RECORD__STATUS:
            unsetStatus();
            return;
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            unsetAuthor();
            return;
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            unsetAssets();
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
        case CimPackage.ACTIVITY_RECORD__CREATED_DATE_TIME:
            return isSetCreatedDateTime();
        case CimPackage.ACTIVITY_RECORD__REASON:
            return isSetReason();
        case CimPackage.ACTIVITY_RECORD__SEVERITY:
            return isSetSeverity();
        case CimPackage.ACTIVITY_RECORD__TYPE:
            return isSetType();
        case CimPackage.ACTIVITY_RECORD__STATUS:
            return isSetStatus();
        case CimPackage.ACTIVITY_RECORD__AUTHOR:
            return isSetAuthor();
        case CimPackage.ACTIVITY_RECORD__ASSETS:
            return isSetAssets();
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
        result.append( " (createdDateTime: " );
        if( createdDateTimeESet )
            result.append( createdDateTime );
        else
            result.append( "<unset>" );
        result.append( ", reason: " );
        if( reasonESet )
            result.append( reason );
        else
            result.append( "<unset>" );
        result.append( ", severity: " );
        if( severityESet )
            result.append( severity );
        else
            result.append( "<unset>" );
        result.append( ", type: " );
        if( typeESet )
            result.append( type );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ActivityRecordImpl
