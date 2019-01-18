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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ISOUpperLayer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISO Upper Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getAeInvoke <em>Ae Invoke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getAeQual <em>Ae Qual</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getApInvoke <em>Ap Invoke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getApTitle <em>Ap Title</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getOsiPsel <em>Osi Psel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getOsiSsel <em>Osi Ssel</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ISOUpperLayerImpl#getOsiTsel <em>Osi Tsel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISOUpperLayerImpl extends TCPAccessPointImpl implements ISOUpperLayer {
    /**
     * The default value of the '{@link #getAeInvoke() <em>Ae Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAeInvoke()
     * @generated
     * @ordered
     */
    protected static final Integer AE_INVOKE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAeInvoke() <em>Ae Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAeInvoke()
     * @generated
     * @ordered
     */
    protected Integer aeInvoke = AE_INVOKE_EDEFAULT;

    /**
     * This is true if the Ae Invoke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aeInvokeESet;

    /**
     * The default value of the '{@link #getAeQual() <em>Ae Qual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAeQual()
     * @generated
     * @ordered
     */
    protected static final Integer AE_QUAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAeQual() <em>Ae Qual</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAeQual()
     * @generated
     * @ordered
     */
    protected Integer aeQual = AE_QUAL_EDEFAULT;

    /**
     * This is true if the Ae Qual attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aeQualESet;

    /**
     * The default value of the '{@link #getApInvoke() <em>Ap Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApInvoke()
     * @generated
     * @ordered
     */
    protected static final Integer AP_INVOKE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApInvoke() <em>Ap Invoke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApInvoke()
     * @generated
     * @ordered
     */
    protected Integer apInvoke = AP_INVOKE_EDEFAULT;

    /**
     * This is true if the Ap Invoke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apInvokeESet;

    /**
     * The default value of the '{@link #getApTitle() <em>Ap Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApTitle()
     * @generated
     * @ordered
     */
    protected static final String AP_TITLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApTitle() <em>Ap Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApTitle()
     * @generated
     * @ordered
     */
    protected String apTitle = AP_TITLE_EDEFAULT;

    /**
     * This is true if the Ap Title attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apTitleESet;

    /**
     * The default value of the '{@link #getOsiPsel() <em>Osi Psel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiPsel()
     * @generated
     * @ordered
     */
    protected static final String OSI_PSEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOsiPsel() <em>Osi Psel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiPsel()
     * @generated
     * @ordered
     */
    protected String osiPsel = OSI_PSEL_EDEFAULT;

    /**
     * This is true if the Osi Psel attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean osiPselESet;

    /**
     * The default value of the '{@link #getOsiSsel() <em>Osi Ssel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiSsel()
     * @generated
     * @ordered
     */
    protected static final String OSI_SSEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOsiSsel() <em>Osi Ssel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiSsel()
     * @generated
     * @ordered
     */
    protected String osiSsel = OSI_SSEL_EDEFAULT;

    /**
     * This is true if the Osi Ssel attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean osiSselESet;

    /**
     * The default value of the '{@link #getOsiTsel() <em>Osi Tsel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiTsel()
     * @generated
     * @ordered
     */
    protected static final String OSI_TSEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOsiTsel() <em>Osi Tsel</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOsiTsel()
     * @generated
     * @ordered
     */
    protected String osiTsel = OSI_TSEL_EDEFAULT;

    /**
     * This is true if the Osi Tsel attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean osiTselESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ISOUpperLayerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getISOUpperLayer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getAeInvoke() {
        return aeInvoke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAeInvoke( Integer newAeInvoke ) {
        Integer oldAeInvoke = aeInvoke;
        aeInvoke = newAeInvoke;
        boolean oldAeInvokeESet = aeInvokeESet;
        aeInvokeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__AE_INVOKE, oldAeInvoke, aeInvoke, !oldAeInvokeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAeInvoke() {
        Integer oldAeInvoke = aeInvoke;
        boolean oldAeInvokeESet = aeInvokeESet;
        aeInvoke = AE_INVOKE_EDEFAULT;
        aeInvokeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__AE_INVOKE, oldAeInvoke, AE_INVOKE_EDEFAULT, oldAeInvokeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAeInvoke() {
        return aeInvokeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getAeQual() {
        return aeQual;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAeQual( Integer newAeQual ) {
        Integer oldAeQual = aeQual;
        aeQual = newAeQual;
        boolean oldAeQualESet = aeQualESet;
        aeQualESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__AE_QUAL, oldAeQual, aeQual, !oldAeQualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAeQual() {
        Integer oldAeQual = aeQual;
        boolean oldAeQualESet = aeQualESet;
        aeQual = AE_QUAL_EDEFAULT;
        aeQualESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__AE_QUAL, oldAeQual, AE_QUAL_EDEFAULT, oldAeQualESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAeQual() {
        return aeQualESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getApInvoke() {
        return apInvoke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApInvoke( Integer newApInvoke ) {
        Integer oldApInvoke = apInvoke;
        apInvoke = newApInvoke;
        boolean oldApInvokeESet = apInvokeESet;
        apInvokeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__AP_INVOKE, oldApInvoke, apInvoke, !oldApInvokeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApInvoke() {
        Integer oldApInvoke = apInvoke;
        boolean oldApInvokeESet = apInvokeESet;
        apInvoke = AP_INVOKE_EDEFAULT;
        apInvokeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__AP_INVOKE, oldApInvoke, AP_INVOKE_EDEFAULT, oldApInvokeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApInvoke() {
        return apInvokeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getApTitle() {
        return apTitle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApTitle( String newApTitle ) {
        String oldApTitle = apTitle;
        apTitle = newApTitle;
        boolean oldApTitleESet = apTitleESet;
        apTitleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__AP_TITLE, oldApTitle, apTitle, !oldApTitleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApTitle() {
        String oldApTitle = apTitle;
        boolean oldApTitleESet = apTitleESet;
        apTitle = AP_TITLE_EDEFAULT;
        apTitleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__AP_TITLE, oldApTitle, AP_TITLE_EDEFAULT, oldApTitleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApTitle() {
        return apTitleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOsiPsel() {
        return osiPsel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOsiPsel( String newOsiPsel ) {
        String oldOsiPsel = osiPsel;
        osiPsel = newOsiPsel;
        boolean oldOsiPselESet = osiPselESet;
        osiPselESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__OSI_PSEL, oldOsiPsel, osiPsel, !oldOsiPselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOsiPsel() {
        String oldOsiPsel = osiPsel;
        boolean oldOsiPselESet = osiPselESet;
        osiPsel = OSI_PSEL_EDEFAULT;
        osiPselESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__OSI_PSEL, oldOsiPsel, OSI_PSEL_EDEFAULT, oldOsiPselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOsiPsel() {
        return osiPselESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOsiSsel() {
        return osiSsel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOsiSsel( String newOsiSsel ) {
        String oldOsiSsel = osiSsel;
        osiSsel = newOsiSsel;
        boolean oldOsiSselESet = osiSselESet;
        osiSselESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__OSI_SSEL, oldOsiSsel, osiSsel, !oldOsiSselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOsiSsel() {
        String oldOsiSsel = osiSsel;
        boolean oldOsiSselESet = osiSselESet;
        osiSsel = OSI_SSEL_EDEFAULT;
        osiSselESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__OSI_SSEL, oldOsiSsel, OSI_SSEL_EDEFAULT, oldOsiSselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOsiSsel() {
        return osiSselESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getOsiTsel() {
        return osiTsel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOsiTsel( String newOsiTsel ) {
        String oldOsiTsel = osiTsel;
        osiTsel = newOsiTsel;
        boolean oldOsiTselESet = osiTselESet;
        osiTselESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ISO_UPPER_LAYER__OSI_TSEL, oldOsiTsel, osiTsel, !oldOsiTselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOsiTsel() {
        String oldOsiTsel = osiTsel;
        boolean oldOsiTselESet = osiTselESet;
        osiTsel = OSI_TSEL_EDEFAULT;
        osiTselESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ISO_UPPER_LAYER__OSI_TSEL, oldOsiTsel, OSI_TSEL_EDEFAULT, oldOsiTselESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOsiTsel() {
        return osiTselESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ISO_UPPER_LAYER__AE_INVOKE:
            return getAeInvoke();
        case CimPackage.ISO_UPPER_LAYER__AE_QUAL:
            return getAeQual();
        case CimPackage.ISO_UPPER_LAYER__AP_INVOKE:
            return getApInvoke();
        case CimPackage.ISO_UPPER_LAYER__AP_TITLE:
            return getApTitle();
        case CimPackage.ISO_UPPER_LAYER__OSI_PSEL:
            return getOsiPsel();
        case CimPackage.ISO_UPPER_LAYER__OSI_SSEL:
            return getOsiSsel();
        case CimPackage.ISO_UPPER_LAYER__OSI_TSEL:
            return getOsiTsel();
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
        case CimPackage.ISO_UPPER_LAYER__AE_INVOKE:
            setAeInvoke( ( Integer ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__AE_QUAL:
            setAeQual( ( Integer ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__AP_INVOKE:
            setApInvoke( ( Integer ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__AP_TITLE:
            setApTitle( ( String ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_PSEL:
            setOsiPsel( ( String ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_SSEL:
            setOsiSsel( ( String ) newValue );
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_TSEL:
            setOsiTsel( ( String ) newValue );
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
        case CimPackage.ISO_UPPER_LAYER__AE_INVOKE:
            unsetAeInvoke();
            return;
        case CimPackage.ISO_UPPER_LAYER__AE_QUAL:
            unsetAeQual();
            return;
        case CimPackage.ISO_UPPER_LAYER__AP_INVOKE:
            unsetApInvoke();
            return;
        case CimPackage.ISO_UPPER_LAYER__AP_TITLE:
            unsetApTitle();
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_PSEL:
            unsetOsiPsel();
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_SSEL:
            unsetOsiSsel();
            return;
        case CimPackage.ISO_UPPER_LAYER__OSI_TSEL:
            unsetOsiTsel();
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
        case CimPackage.ISO_UPPER_LAYER__AE_INVOKE:
            return isSetAeInvoke();
        case CimPackage.ISO_UPPER_LAYER__AE_QUAL:
            return isSetAeQual();
        case CimPackage.ISO_UPPER_LAYER__AP_INVOKE:
            return isSetApInvoke();
        case CimPackage.ISO_UPPER_LAYER__AP_TITLE:
            return isSetApTitle();
        case CimPackage.ISO_UPPER_LAYER__OSI_PSEL:
            return isSetOsiPsel();
        case CimPackage.ISO_UPPER_LAYER__OSI_SSEL:
            return isSetOsiSsel();
        case CimPackage.ISO_UPPER_LAYER__OSI_TSEL:
            return isSetOsiTsel();
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
        result.append( " (aeInvoke: " );
        if( aeInvokeESet )
            result.append( aeInvoke );
        else
            result.append( "<unset>" );
        result.append( ", aeQual: " );
        if( aeQualESet )
            result.append( aeQual );
        else
            result.append( "<unset>" );
        result.append( ", apInvoke: " );
        if( apInvokeESet )
            result.append( apInvoke );
        else
            result.append( "<unset>" );
        result.append( ", apTitle: " );
        if( apTitleESet )
            result.append( apTitle );
        else
            result.append( "<unset>" );
        result.append( ", osiPsel: " );
        if( osiPselESet )
            result.append( osiPsel );
        else
            result.append( "<unset>" );
        result.append( ", osiSsel: " );
        if( osiSselESet )
            result.append( osiSsel );
        else
            result.append( "<unset>" );
        result.append( ", osiTsel: " );
        if( osiTselESet )
            result.append( osiTsel );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ISOUpperLayerImpl
