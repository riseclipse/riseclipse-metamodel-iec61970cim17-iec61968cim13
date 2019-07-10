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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Approver;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Author;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Document;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Editor;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ElectronicAddress;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Issuer;
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
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getCreatedDateTime <em>Created Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getLastModifiedDateTime <em>Last Modified Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getElectronicAddress <em>Electronic Address</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getConfigurationEvents <em>Configuration Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getEditor <em>Editor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getApprover <em>Approver</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DocumentImpl#getIssuer <em>Issuer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends IdentifiedObjectImpl implements Document {
    /**
     * The default value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorName()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthorName()
     * @generated
     * @ordered
     */
    protected String authorName = AUTHOR_NAME_EDEFAULT;

    /**
     * This is true if the Author Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean authorNameESet;

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
     * The default value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedDateTime()
     * @generated
     * @ordered
     */
    protected static final Date LAST_MODIFIED_DATE_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLastModifiedDateTime() <em>Last Modified Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLastModifiedDateTime()
     * @generated
     * @ordered
     */
    protected Date lastModifiedDateTime = LAST_MODIFIED_DATE_TIME_EDEFAULT;

    /**
     * This is true if the Last Modified Date Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lastModifiedDateTimeESet;

    /**
     * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionNumber()
     * @generated
     * @ordered
     */
    protected static final String REVISION_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRevisionNumber()
     * @generated
     * @ordered
     */
    protected String revisionNumber = REVISION_NUMBER_EDEFAULT;

    /**
     * This is true if the Revision Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean revisionNumberESet;

    /**
     * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected static final String SUBJECT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubject()
     * @generated
     * @ordered
     */
    protected String subject = SUBJECT_EDEFAULT;

    /**
     * This is true if the Subject attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subjectESet;

    /**
     * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected static final String TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTitle()
     * @generated
     * @ordered
     */
    protected String title = TITLE_EDEFAULT;

    /**
     * This is true if the Title attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean titleESet;

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
     * The cached value of the '{@link #getDocStatus() <em>Doc Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocStatus()
     * @generated
     * @ordered
     */
    protected Status docStatus;

    /**
     * This is true if the Doc Status containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean docStatusESet;

    /**
     * The cached value of the '{@link #getElectronicAddress() <em>Electronic Address</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElectronicAddress()
     * @generated
     * @ordered
     */
    protected ElectronicAddress electronicAddress;

    /**
     * This is true if the Electronic Address containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean electronicAddressESet;

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
     * The cached value of the '{@link #getConfigurationEvents() <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfigurationEvents()
     * @generated
     * @ordered
     */
    protected EList< ConfigurationEvent > configurationEvents;

    /**
     * The cached value of the '{@link #getEditor() <em>Editor</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEditor()
     * @generated
     * @ordered
     */
    protected Editor editor;

    /**
     * This is true if the Editor reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean editorESet;

    /**
     * The cached value of the '{@link #getApprover() <em>Approver</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApprover()
     * @generated
     * @ordered
     */
    protected Approver approver;

    /**
     * This is true if the Approver reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean approverESet;

    /**
     * The cached value of the '{@link #getIssuer() <em>Issuer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIssuer()
     * @generated
     * @ordered
     */
    protected Issuer issuer;

    /**
     * This is true if the Issuer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean issuerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDocument();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getAuthorName() {
        return authorName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAuthorName( String newAuthorName ) {
        String oldAuthorName = authorName;
        authorName = newAuthorName;
        boolean oldAuthorNameESet = authorNameESet;
        authorNameESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DOCUMENT__AUTHOR_NAME, oldAuthorName, authorName, !oldAuthorNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAuthorName() {
        String oldAuthorName = authorName;
        boolean oldAuthorNameESet = authorNameESet;
        authorName = AUTHOR_NAME_EDEFAULT;
        authorNameESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DOCUMENT__AUTHOR_NAME, oldAuthorName, AUTHOR_NAME_EDEFAULT, oldAuthorNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAuthorName() {
        return authorNameESet;
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
                CimPackage.DOCUMENT__COMMENT, oldComment, comment, !oldCommentESet ) );
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
                CimPackage.DOCUMENT__COMMENT, oldComment, COMMENT_EDEFAULT, oldCommentESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__CREATED_DATE_TIME,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DOCUMENT__CREATED_DATE_TIME,
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
    public Date getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLastModifiedDateTime( Date newLastModifiedDateTime ) {
        Date oldLastModifiedDateTime = lastModifiedDateTime;
        lastModifiedDateTime = newLastModifiedDateTime;
        boolean oldLastModifiedDateTimeESet = lastModifiedDateTimeESet;
        lastModifiedDateTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME,
                    oldLastModifiedDateTime, lastModifiedDateTime, !oldLastModifiedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLastModifiedDateTime() {
        Date oldLastModifiedDateTime = lastModifiedDateTime;
        boolean oldLastModifiedDateTimeESet = lastModifiedDateTimeESet;
        lastModifiedDateTime = LAST_MODIFIED_DATE_TIME_EDEFAULT;
        lastModifiedDateTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME,
                    oldLastModifiedDateTime, LAST_MODIFIED_DATE_TIME_EDEFAULT, oldLastModifiedDateTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLastModifiedDateTime() {
        return lastModifiedDateTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRevisionNumber( String newRevisionNumber ) {
        String oldRevisionNumber = revisionNumber;
        revisionNumber = newRevisionNumber;
        boolean oldRevisionNumberESet = revisionNumberESet;
        revisionNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DOCUMENT__REVISION_NUMBER, oldRevisionNumber, revisionNumber, !oldRevisionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRevisionNumber() {
        String oldRevisionNumber = revisionNumber;
        boolean oldRevisionNumberESet = revisionNumberESet;
        revisionNumber = REVISION_NUMBER_EDEFAULT;
        revisionNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DOCUMENT__REVISION_NUMBER,
                    oldRevisionNumber, REVISION_NUMBER_EDEFAULT, oldRevisionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRevisionNumber() {
        return revisionNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getSubject() {
        return subject;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubject( String newSubject ) {
        String oldSubject = subject;
        subject = newSubject;
        boolean oldSubjectESet = subjectESet;
        subjectESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DOCUMENT__SUBJECT, oldSubject, subject, !oldSubjectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubject() {
        String oldSubject = subject;
        boolean oldSubjectESet = subjectESet;
        subject = SUBJECT_EDEFAULT;
        subjectESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DOCUMENT__SUBJECT, oldSubject, SUBJECT_EDEFAULT, oldSubjectESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubject() {
        return subjectESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTitle( String newTitle ) {
        String oldTitle = title;
        title = newTitle;
        boolean oldTitleESet = titleESet;
        titleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.DOCUMENT__TITLE, oldTitle, title, !oldTitleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTitle() {
        String oldTitle = title;
        boolean oldTitleESet = titleESet;
        title = TITLE_EDEFAULT;
        titleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.DOCUMENT__TITLE, oldTitle, TITLE_EDEFAULT, oldTitleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTitle() {
        return titleESet;
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
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__TYPE,
                oldType, type, !oldTypeESet ) );
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
                CimPackage.DOCUMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet ) );
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
    public Status getDocStatus() {
        return docStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocStatus( Status newDocStatus, NotificationChain msgs ) {
        Status oldDocStatus = docStatus;
        docStatus = newDocStatus;
        boolean oldDocStatusESet = docStatusESet;
        docStatusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__DOC_STATUS, oldDocStatus, newDocStatus, !oldDocStatusESet );
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
    public void setDocStatus( Status newDocStatus ) {
        if( newDocStatus != docStatus ) {
            NotificationChain msgs = null;
            if( docStatus != null ) msgs = ( ( InternalEObject ) docStatus ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__DOC_STATUS, null, msgs );
            if( newDocStatus != null ) msgs = ( ( InternalEObject ) newDocStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__DOC_STATUS, null, msgs );
            msgs = basicSetDocStatus( newDocStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDocStatusESet = docStatusESet;
            docStatusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__DOC_STATUS, newDocStatus, newDocStatus, !oldDocStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDocStatus( NotificationChain msgs ) {
        Status oldDocStatus = docStatus;
        docStatus = null;
        boolean oldDocStatusESet = docStatusESet;
        docStatusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__DOC_STATUS, oldDocStatus, null, oldDocStatusESet );
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
    public void unsetDocStatus() {
        if( docStatus != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) docStatus ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__DOC_STATUS, null, msgs );
            msgs = basicUnsetDocStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDocStatusESet = docStatusESet;
            docStatusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__DOC_STATUS, null, null, oldDocStatusESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDocStatus() {
        return docStatusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ElectronicAddress getElectronicAddress() {
        return electronicAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElectronicAddress( ElectronicAddress newElectronicAddress,
            NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = newElectronicAddress;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, oldElectronicAddress, newElectronicAddress,
                    !oldElectronicAddressESet );
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
    public void setElectronicAddress( ElectronicAddress newElectronicAddress ) {
        if( newElectronicAddress != electronicAddress ) {
            NotificationChain msgs = null;
            if( electronicAddress != null ) msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, msgs );
            if( newElectronicAddress != null ) msgs = ( ( InternalEObject ) newElectronicAddress ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicSetElectronicAddress( newElectronicAddress, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__ELECTRONIC_ADDRESS,
                        newElectronicAddress, newElectronicAddress, !oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetElectronicAddress( NotificationChain msgs ) {
        ElectronicAddress oldElectronicAddress = electronicAddress;
        electronicAddress = null;
        boolean oldElectronicAddressESet = electronicAddressESet;
        electronicAddressESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, oldElectronicAddress, null, oldElectronicAddressESet );
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
    public void unsetElectronicAddress() {
        if( electronicAddress != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) electronicAddress ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, msgs );
            msgs = basicUnsetElectronicAddress( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldElectronicAddressESet = electronicAddressESet;
            electronicAddressESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__ELECTRONIC_ADDRESS, null, null, oldElectronicAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetElectronicAddress() {
        return electronicAddressESet;
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__STATUS,
                    oldStatus, newStatus, !oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__STATUS, null, msgs );
            if( newStatus != null ) msgs = ( ( InternalEObject ) newStatus ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__STATUS, null, msgs );
            msgs = basicSetStatus( newStatus, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__STATUS, newStatus, newStatus, !oldStatusESet ) );
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
                    CimPackage.DOCUMENT__STATUS, oldStatus, null, oldStatusESet );
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
                    EOPPOSITE_FEATURE_BASE - CimPackage.DOCUMENT__STATUS, null, msgs );
            msgs = basicUnsetStatus( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStatusESet = statusESet;
            statusESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__STATUS, null, null, oldStatusESet ) );
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
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__AUTHOR,
                    oldAuthor, newAuthor, !oldAuthorESet );
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
                    CimPackage.AUTHOR__DOCUMENTS, Author.class, msgs );
            if( newAuthor != null ) msgs = ( ( InternalEObject ) newAuthor ).eInverseAdd( this,
                    CimPackage.AUTHOR__DOCUMENTS, Author.class, msgs );
            msgs = basicSetAuthor( newAuthor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuthorESet = authorESet;
            authorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__AUTHOR, newAuthor, newAuthor, !oldAuthorESet ) );
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
                    CimPackage.DOCUMENT__AUTHOR, oldAuthor, null, oldAuthorESet );
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
            msgs = ( ( InternalEObject ) author ).eInverseRemove( this, CimPackage.AUTHOR__DOCUMENTS, Author.class,
                    msgs );
            msgs = basicUnsetAuthor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAuthorESet = authorESet;
            authorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__AUTHOR, null, null, oldAuthorESet ) );
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
    public EList< ConfigurationEvent > getConfigurationEvents() {
        if( configurationEvents == null ) {
            configurationEvents = new EObjectWithInverseResolvingEList.Unsettable< ConfigurationEvent >(
                    ConfigurationEvent.class, this, CimPackage.DOCUMENT__CONFIGURATION_EVENTS,
                    CimPackage.CONFIGURATION_EVENT__CHANGED_DOCUMENT );
        }
        return configurationEvents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfigurationEvents() {
        if( configurationEvents != null ) ( ( InternalEList.Unsettable< ? > ) configurationEvents ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfigurationEvents() {
        return configurationEvents != null && ( ( InternalEList.Unsettable< ? > ) configurationEvents ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Editor getEditor() {
        return editor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEditor( Editor newEditor, NotificationChain msgs ) {
        Editor oldEditor = editor;
        editor = newEditor;
        boolean oldEditorESet = editorESet;
        editorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__EDITOR,
                    oldEditor, newEditor, !oldEditorESet );
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
    public void setEditor( Editor newEditor ) {
        if( newEditor != editor ) {
            NotificationChain msgs = null;
            if( editor != null ) msgs = ( ( InternalEObject ) editor ).eInverseRemove( this,
                    CimPackage.EDITOR__DOCUMENTS, Editor.class, msgs );
            if( newEditor != null ) msgs = ( ( InternalEObject ) newEditor ).eInverseAdd( this,
                    CimPackage.EDITOR__DOCUMENTS, Editor.class, msgs );
            msgs = basicSetEditor( newEditor, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEditorESet = editorESet;
            editorESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__EDITOR, newEditor, newEditor, !oldEditorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEditor( NotificationChain msgs ) {
        Editor oldEditor = editor;
        editor = null;
        boolean oldEditorESet = editorESet;
        editorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__EDITOR, oldEditor, null, oldEditorESet );
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
    public void unsetEditor() {
        if( editor != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) editor ).eInverseRemove( this, CimPackage.EDITOR__DOCUMENTS, Editor.class,
                    msgs );
            msgs = basicUnsetEditor( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEditorESet = editorESet;
            editorESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__EDITOR, null, null, oldEditorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEditor() {
        return editorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Approver getApprover() {
        return approver;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetApprover( Approver newApprover, NotificationChain msgs ) {
        Approver oldApprover = approver;
        approver = newApprover;
        boolean oldApproverESet = approverESet;
        approverESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__APPROVER, oldApprover, newApprover, !oldApproverESet );
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
    public void setApprover( Approver newApprover ) {
        if( newApprover != approver ) {
            NotificationChain msgs = null;
            if( approver != null ) msgs = ( ( InternalEObject ) approver ).eInverseRemove( this,
                    CimPackage.APPROVER__DOCUMENTS, Approver.class, msgs );
            if( newApprover != null ) msgs = ( ( InternalEObject ) newApprover ).eInverseAdd( this,
                    CimPackage.APPROVER__DOCUMENTS, Approver.class, msgs );
            msgs = basicSetApprover( newApprover, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApproverESet = approverESet;
            approverESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__APPROVER, newApprover, newApprover, !oldApproverESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetApprover( NotificationChain msgs ) {
        Approver oldApprover = approver;
        approver = null;
        boolean oldApproverESet = approverESet;
        approverESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__APPROVER, oldApprover, null, oldApproverESet );
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
    public void unsetApprover() {
        if( approver != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) approver ).eInverseRemove( this, CimPackage.APPROVER__DOCUMENTS,
                    Approver.class, msgs );
            msgs = basicUnsetApprover( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldApproverESet = approverESet;
            approverESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__APPROVER, null, null, oldApproverESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApprover() {
        return approverESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Issuer getIssuer() {
        return issuer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIssuer( Issuer newIssuer, NotificationChain msgs ) {
        Issuer oldIssuer = issuer;
        issuer = newIssuer;
        boolean oldIssuerESet = issuerESet;
        issuerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET, CimPackage.DOCUMENT__ISSUER,
                    oldIssuer, newIssuer, !oldIssuerESet );
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
    public void setIssuer( Issuer newIssuer ) {
        if( newIssuer != issuer ) {
            NotificationChain msgs = null;
            if( issuer != null ) msgs = ( ( InternalEObject ) issuer ).eInverseRemove( this,
                    CimPackage.ISSUER__DOCUMENTS, Issuer.class, msgs );
            if( newIssuer != null ) msgs = ( ( InternalEObject ) newIssuer ).eInverseAdd( this,
                    CimPackage.ISSUER__DOCUMENTS, Issuer.class, msgs );
            msgs = basicSetIssuer( newIssuer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuerESet = issuerESet;
            issuerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.DOCUMENT__ISSUER, newIssuer, newIssuer, !oldIssuerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetIssuer( NotificationChain msgs ) {
        Issuer oldIssuer = issuer;
        issuer = null;
        boolean oldIssuerESet = issuerESet;
        issuerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__ISSUER, oldIssuer, null, oldIssuerESet );
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
    public void unsetIssuer() {
        if( issuer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) issuer ).eInverseRemove( this, CimPackage.ISSUER__DOCUMENTS, Issuer.class,
                    msgs );
            msgs = basicUnsetIssuer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldIssuerESet = issuerESet;
            issuerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DOCUMENT__ISSUER, null, null, oldIssuerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIssuer() {
        return issuerESet;
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
        case CimPackage.DOCUMENT__AUTHOR:
            if( author != null ) msgs = ( ( InternalEObject ) author ).eInverseRemove( this,
                    CimPackage.AUTHOR__DOCUMENTS, Author.class, msgs );
            return basicSetAuthor( ( Author ) otherEnd, msgs );
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConfigurationEvents() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DOCUMENT__EDITOR:
            if( editor != null ) msgs = ( ( InternalEObject ) editor ).eInverseRemove( this,
                    CimPackage.EDITOR__DOCUMENTS, Editor.class, msgs );
            return basicSetEditor( ( Editor ) otherEnd, msgs );
        case CimPackage.DOCUMENT__APPROVER:
            if( approver != null ) msgs = ( ( InternalEObject ) approver ).eInverseRemove( this,
                    CimPackage.APPROVER__DOCUMENTS, Approver.class, msgs );
            return basicSetApprover( ( Approver ) otherEnd, msgs );
        case CimPackage.DOCUMENT__ISSUER:
            if( issuer != null ) msgs = ( ( InternalEObject ) issuer ).eInverseRemove( this,
                    CimPackage.ISSUER__DOCUMENTS, Issuer.class, msgs );
            return basicSetIssuer( ( Issuer ) otherEnd, msgs );
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
        case CimPackage.DOCUMENT__DOC_STATUS:
            return basicUnsetDocStatus( msgs );
        case CimPackage.DOCUMENT__ELECTRONIC_ADDRESS:
            return basicUnsetElectronicAddress( msgs );
        case CimPackage.DOCUMENT__STATUS:
            return basicUnsetStatus( msgs );
        case CimPackage.DOCUMENT__AUTHOR:
            return basicUnsetAuthor( msgs );
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            return ( ( InternalEList< ? > ) getConfigurationEvents() ).basicRemove( otherEnd, msgs );
        case CimPackage.DOCUMENT__EDITOR:
            return basicUnsetEditor( msgs );
        case CimPackage.DOCUMENT__APPROVER:
            return basicUnsetApprover( msgs );
        case CimPackage.DOCUMENT__ISSUER:
            return basicUnsetIssuer( msgs );
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
        case CimPackage.DOCUMENT__AUTHOR_NAME:
            return getAuthorName();
        case CimPackage.DOCUMENT__COMMENT:
            return getComment();
        case CimPackage.DOCUMENT__CREATED_DATE_TIME:
            return getCreatedDateTime();
        case CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
            return getLastModifiedDateTime();
        case CimPackage.DOCUMENT__REVISION_NUMBER:
            return getRevisionNumber();
        case CimPackage.DOCUMENT__SUBJECT:
            return getSubject();
        case CimPackage.DOCUMENT__TITLE:
            return getTitle();
        case CimPackage.DOCUMENT__TYPE:
            return getType();
        case CimPackage.DOCUMENT__DOC_STATUS:
            return getDocStatus();
        case CimPackage.DOCUMENT__ELECTRONIC_ADDRESS:
            return getElectronicAddress();
        case CimPackage.DOCUMENT__STATUS:
            return getStatus();
        case CimPackage.DOCUMENT__AUTHOR:
            return getAuthor();
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            return getConfigurationEvents();
        case CimPackage.DOCUMENT__EDITOR:
            return getEditor();
        case CimPackage.DOCUMENT__APPROVER:
            return getApprover();
        case CimPackage.DOCUMENT__ISSUER:
            return getIssuer();
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
        case CimPackage.DOCUMENT__AUTHOR_NAME:
            setAuthorName( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__COMMENT:
            setComment( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__CREATED_DATE_TIME:
            setCreatedDateTime( ( Date ) newValue );
            return;
        case CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
            setLastModifiedDateTime( ( Date ) newValue );
            return;
        case CimPackage.DOCUMENT__REVISION_NUMBER:
            setRevisionNumber( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__SUBJECT:
            setSubject( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__TITLE:
            setTitle( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__TYPE:
            setType( ( String ) newValue );
            return;
        case CimPackage.DOCUMENT__DOC_STATUS:
            setDocStatus( ( Status ) newValue );
            return;
        case CimPackage.DOCUMENT__ELECTRONIC_ADDRESS:
            setElectronicAddress( ( ElectronicAddress ) newValue );
            return;
        case CimPackage.DOCUMENT__STATUS:
            setStatus( ( Status ) newValue );
            return;
        case CimPackage.DOCUMENT__AUTHOR:
            setAuthor( ( Author ) newValue );
            return;
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            getConfigurationEvents().clear();
            getConfigurationEvents().addAll( ( Collection< ? extends ConfigurationEvent > ) newValue );
            return;
        case CimPackage.DOCUMENT__EDITOR:
            setEditor( ( Editor ) newValue );
            return;
        case CimPackage.DOCUMENT__APPROVER:
            setApprover( ( Approver ) newValue );
            return;
        case CimPackage.DOCUMENT__ISSUER:
            setIssuer( ( Issuer ) newValue );
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
        case CimPackage.DOCUMENT__AUTHOR_NAME:
            unsetAuthorName();
            return;
        case CimPackage.DOCUMENT__COMMENT:
            unsetComment();
            return;
        case CimPackage.DOCUMENT__CREATED_DATE_TIME:
            unsetCreatedDateTime();
            return;
        case CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
            unsetLastModifiedDateTime();
            return;
        case CimPackage.DOCUMENT__REVISION_NUMBER:
            unsetRevisionNumber();
            return;
        case CimPackage.DOCUMENT__SUBJECT:
            unsetSubject();
            return;
        case CimPackage.DOCUMENT__TITLE:
            unsetTitle();
            return;
        case CimPackage.DOCUMENT__TYPE:
            unsetType();
            return;
        case CimPackage.DOCUMENT__DOC_STATUS:
            unsetDocStatus();
            return;
        case CimPackage.DOCUMENT__ELECTRONIC_ADDRESS:
            unsetElectronicAddress();
            return;
        case CimPackage.DOCUMENT__STATUS:
            unsetStatus();
            return;
        case CimPackage.DOCUMENT__AUTHOR:
            unsetAuthor();
            return;
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            unsetConfigurationEvents();
            return;
        case CimPackage.DOCUMENT__EDITOR:
            unsetEditor();
            return;
        case CimPackage.DOCUMENT__APPROVER:
            unsetApprover();
            return;
        case CimPackage.DOCUMENT__ISSUER:
            unsetIssuer();
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
        case CimPackage.DOCUMENT__AUTHOR_NAME:
            return isSetAuthorName();
        case CimPackage.DOCUMENT__COMMENT:
            return isSetComment();
        case CimPackage.DOCUMENT__CREATED_DATE_TIME:
            return isSetCreatedDateTime();
        case CimPackage.DOCUMENT__LAST_MODIFIED_DATE_TIME:
            return isSetLastModifiedDateTime();
        case CimPackage.DOCUMENT__REVISION_NUMBER:
            return isSetRevisionNumber();
        case CimPackage.DOCUMENT__SUBJECT:
            return isSetSubject();
        case CimPackage.DOCUMENT__TITLE:
            return isSetTitle();
        case CimPackage.DOCUMENT__TYPE:
            return isSetType();
        case CimPackage.DOCUMENT__DOC_STATUS:
            return isSetDocStatus();
        case CimPackage.DOCUMENT__ELECTRONIC_ADDRESS:
            return isSetElectronicAddress();
        case CimPackage.DOCUMENT__STATUS:
            return isSetStatus();
        case CimPackage.DOCUMENT__AUTHOR:
            return isSetAuthor();
        case CimPackage.DOCUMENT__CONFIGURATION_EVENTS:
            return isSetConfigurationEvents();
        case CimPackage.DOCUMENT__EDITOR:
            return isSetEditor();
        case CimPackage.DOCUMENT__APPROVER:
            return isSetApprover();
        case CimPackage.DOCUMENT__ISSUER:
            return isSetIssuer();
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
        result.append( " (authorName: " );
        if( authorNameESet )
            result.append( authorName );
        else
            result.append( "<unset>" );
        result.append( ", comment: " );
        if( commentESet )
            result.append( comment );
        else
            result.append( "<unset>" );
        result.append( ", createdDateTime: " );
        if( createdDateTimeESet )
            result.append( createdDateTime );
        else
            result.append( "<unset>" );
        result.append( ", lastModifiedDateTime: " );
        if( lastModifiedDateTimeESet )
            result.append( lastModifiedDateTime );
        else
            result.append( "<unset>" );
        result.append( ", revisionNumber: " );
        if( revisionNumberESet )
            result.append( revisionNumber );
        else
            result.append( "<unset>" );
        result.append( ", subject: " );
        if( subjectESet )
            result.append( subject );
        else
            result.append( "<unset>" );
        result.append( ", title: " );
        if( titleESet )
            result.append( title );
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

} //DocumentImpl
