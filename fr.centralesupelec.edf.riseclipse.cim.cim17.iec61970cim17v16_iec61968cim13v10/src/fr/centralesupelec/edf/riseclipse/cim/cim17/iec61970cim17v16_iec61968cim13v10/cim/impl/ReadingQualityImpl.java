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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseReading;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQuality;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ReadingQualityType;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Quality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityImpl#getReading <em>Reading</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ReadingQualityImpl#getReadingQualityType <em>Reading Quality Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingQualityImpl extends CimObjectWithIDImpl implements ReadingQuality {
    /**
     * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected static final String COMMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComment()
     * @generated
     * @ordered
     */
    protected String comment = COMMENT_EDEFAULT;

    /**
     * This is true if the Comment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean commentESet;

    /**
     * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected static final String SOURCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected String source = SOURCE_EDEFAULT;

    /**
     * This is true if the Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sourceESet;

    /**
     * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected static final Date TIME_STAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStamp()
     * @generated
     * @ordered
     */
    protected Date timeStamp = TIME_STAMP_EDEFAULT;

    /**
     * This is true if the Time Stamp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStampESet;

    /**
     * The cached value of the '{@link #getReading() <em>Reading</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReading()
     * @generated
     * @ordered
     */
    protected BaseReading reading;

    /**
     * This is true if the Reading reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readingESet;

    /**
     * The cached value of the '{@link #getReadingQualityType() <em>Reading Quality Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadingQualityType()
     * @generated
     * @ordered
     */
    protected ReadingQualityType readingQualityType;

    /**
     * This is true if the Reading Quality Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean readingQualityTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadingQualityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReadingQuality();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getComment() {
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setComment( String newComment ) {
        String oldComment = comment;
        comment = newComment;
        boolean oldCommentESet = commentESet;
        commentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY__COMMENT, oldComment, comment, !oldCommentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetComment() {
        String oldComment = comment;
        boolean oldCommentESet = commentESet;
        comment = COMMENT_EDEFAULT;
        commentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_QUALITY__COMMENT, oldComment, COMMENT_EDEFAULT, oldCommentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetComment() {
        return commentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSource( String newSource ) {
        String oldSource = source;
        source = newSource;
        boolean oldSourceESet = sourceESet;
        sourceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY__SOURCE, oldSource, source, !oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSource() {
        String oldSource = source;
        boolean oldSourceESet = sourceESet;
        source = SOURCE_EDEFAULT;
        sourceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_QUALITY__SOURCE, oldSource, SOURCE_EDEFAULT, oldSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSource() {
        return sourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStamp( Date newTimeStamp ) {
        Date oldTimeStamp = timeStamp;
        timeStamp = newTimeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStampESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.READING_QUALITY__TIME_STAMP, oldTimeStamp, timeStamp, !oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStamp() {
        Date oldTimeStamp = timeStamp;
        boolean oldTimeStampESet = timeStampESet;
        timeStamp = TIME_STAMP_EDEFAULT;
        timeStampESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.READING_QUALITY__TIME_STAMP, oldTimeStamp, TIME_STAMP_EDEFAULT, oldTimeStampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStamp() {
        return timeStampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseReading getReading() {
        return reading;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReading( BaseReading newReading, NotificationChain msgs ) {
        BaseReading oldReading = reading;
        reading = newReading;
        boolean oldReadingESet = readingESet;
        readingESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_QUALITY__READING, oldReading, newReading, !oldReadingESet );
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
    public void setReading( BaseReading newReading ) {
        if( newReading != reading ) {
            NotificationChain msgs = null;
            if( reading != null ) msgs = ( ( InternalEObject ) reading ).eInverseRemove( this,
                    CimPackage.BASE_READING__READING_QUALITIES, BaseReading.class, msgs );
            if( newReading != null ) msgs = ( ( InternalEObject ) newReading ).eInverseAdd( this,
                    CimPackage.BASE_READING__READING_QUALITIES, BaseReading.class, msgs );
            msgs = basicSetReading( newReading, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingESet = readingESet;
            readingESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_QUALITY__READING, newReading, newReading, !oldReadingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReading( NotificationChain msgs ) {
        BaseReading oldReading = reading;
        reading = null;
        boolean oldReadingESet = readingESet;
        readingESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_QUALITY__READING, oldReading, null, oldReadingESet );
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
    public void unsetReading() {
        if( reading != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reading ).eInverseRemove( this, CimPackage.BASE_READING__READING_QUALITIES,
                    BaseReading.class, msgs );
            msgs = basicUnsetReading( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingESet = readingESet;
            readingESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_QUALITY__READING, null, null, oldReadingESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReading() {
        return readingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReadingQualityType getReadingQualityType() {
        return readingQualityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReadingQualityType( ReadingQualityType newReadingQualityType,
            NotificationChain msgs ) {
        ReadingQualityType oldReadingQualityType = readingQualityType;
        readingQualityType = newReadingQualityType;
        boolean oldReadingQualityTypeESet = readingQualityTypeESet;
        readingQualityTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.READING_QUALITY__READING_QUALITY_TYPE, oldReadingQualityType, newReadingQualityType,
                    !oldReadingQualityTypeESet );
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
    public void setReadingQualityType( ReadingQualityType newReadingQualityType ) {
        if( newReadingQualityType != readingQualityType ) {
            NotificationChain msgs = null;
            if( readingQualityType != null ) msgs = ( ( InternalEObject ) readingQualityType ).eInverseRemove( this,
                    CimPackage.READING_QUALITY_TYPE__READING_QUALITIES, ReadingQualityType.class, msgs );
            if( newReadingQualityType != null ) msgs = ( ( InternalEObject ) newReadingQualityType ).eInverseAdd( this,
                    CimPackage.READING_QUALITY_TYPE__READING_QUALITIES, ReadingQualityType.class, msgs );
            msgs = basicSetReadingQualityType( newReadingQualityType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingQualityTypeESet = readingQualityTypeESet;
            readingQualityTypeESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.READING_QUALITY__READING_QUALITY_TYPE,
                            newReadingQualityType, newReadingQualityType, !oldReadingQualityTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReadingQualityType( NotificationChain msgs ) {
        ReadingQualityType oldReadingQualityType = readingQualityType;
        readingQualityType = null;
        boolean oldReadingQualityTypeESet = readingQualityTypeESet;
        readingQualityTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_QUALITY__READING_QUALITY_TYPE, oldReadingQualityType, null,
                    oldReadingQualityTypeESet );
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
    public void unsetReadingQualityType() {
        if( readingQualityType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) readingQualityType ).eInverseRemove( this,
                    CimPackage.READING_QUALITY_TYPE__READING_QUALITIES, ReadingQualityType.class, msgs );
            msgs = basicUnsetReadingQualityType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReadingQualityTypeESet = readingQualityTypeESet;
            readingQualityTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.READING_QUALITY__READING_QUALITY_TYPE, null, null, oldReadingQualityTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReadingQualityType() {
        return readingQualityTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.READING_QUALITY__READING:
            if( reading != null ) msgs = ( ( InternalEObject ) reading ).eInverseRemove( this,
                    CimPackage.BASE_READING__READING_QUALITIES, BaseReading.class, msgs );
            return basicSetReading( ( BaseReading ) otherEnd, msgs );
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            if( readingQualityType != null ) msgs = ( ( InternalEObject ) readingQualityType ).eInverseRemove( this,
                    CimPackage.READING_QUALITY_TYPE__READING_QUALITIES, ReadingQualityType.class, msgs );
            return basicSetReadingQualityType( ( ReadingQualityType ) otherEnd, msgs );
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
        case CimPackage.READING_QUALITY__READING:
            return basicUnsetReading( msgs );
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            return basicUnsetReadingQualityType( msgs );
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
        case CimPackage.READING_QUALITY__COMMENT:
            return getComment();
        case CimPackage.READING_QUALITY__SOURCE:
            return getSource();
        case CimPackage.READING_QUALITY__TIME_STAMP:
            return getTimeStamp();
        case CimPackage.READING_QUALITY__READING:
            return getReading();
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            return getReadingQualityType();
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
        case CimPackage.READING_QUALITY__COMMENT:
            setComment( ( String ) newValue );
            return;
        case CimPackage.READING_QUALITY__SOURCE:
            setSource( ( String ) newValue );
            return;
        case CimPackage.READING_QUALITY__TIME_STAMP:
            setTimeStamp( ( Date ) newValue );
            return;
        case CimPackage.READING_QUALITY__READING:
            setReading( ( BaseReading ) newValue );
            return;
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            setReadingQualityType( ( ReadingQualityType ) newValue );
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
        case CimPackage.READING_QUALITY__COMMENT:
            unsetComment();
            return;
        case CimPackage.READING_QUALITY__SOURCE:
            unsetSource();
            return;
        case CimPackage.READING_QUALITY__TIME_STAMP:
            unsetTimeStamp();
            return;
        case CimPackage.READING_QUALITY__READING:
            unsetReading();
            return;
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            unsetReadingQualityType();
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
        case CimPackage.READING_QUALITY__COMMENT:
            return isSetComment();
        case CimPackage.READING_QUALITY__SOURCE:
            return isSetSource();
        case CimPackage.READING_QUALITY__TIME_STAMP:
            return isSetTimeStamp();
        case CimPackage.READING_QUALITY__READING:
            return isSetReading();
        case CimPackage.READING_QUALITY__READING_QUALITY_TYPE:
            return isSetReadingQualityType();
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
        result.append( " (comment: " );
        if( commentESet )
            result.append( comment );
        else
            result.append( "<unset>" );
        result.append( ", source: " );
        if( sourceESet )
            result.append( source );
        else
            result.append( "<unset>" );
        result.append( ", timeStamp: " );
        if( timeStampESet )
            result.append( timeStamp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ReadingQualityImpl
