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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcLimIEEE1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UnderexcLimIEEE1ItemProvider extends UnderexcitationLimiterDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnderexcLimIEEE1ItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addKucPropertyDescriptor( object );
            addKufPropertyDescriptor( object );
            addKuiPropertyDescriptor( object );
            addKulPropertyDescriptor( object );
            addKurPropertyDescriptor( object );
            addTu1PropertyDescriptor( object );
            addTu2PropertyDescriptor( object );
            addTu3PropertyDescriptor( object );
            addTu4PropertyDescriptor( object );
            addVucmaxPropertyDescriptor( object );
            addVuimaxPropertyDescriptor( object );
            addVuiminPropertyDescriptor( object );
            addVulmaxPropertyDescriptor( object );
            addVulminPropertyDescriptor( object );
            addVurmaxPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kuc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKucPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_kuc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_kuc_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Kuc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kuf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKufPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_kuf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_kuf_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Kuf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kui feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKuiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_kui_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_kui_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Kui(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kul feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKulPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_kul_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_kul_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Kul(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kur feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKurPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_kur_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_kur_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Kur(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_tu1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_tu1_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Tu1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_tu2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_tu2_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Tu2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu3 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu3PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_tu3_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_tu3_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Tu3(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tu4 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTu4PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_tu4_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_tu4_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Tu4(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vucmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVucmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vucmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vucmax_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vucmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuimaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vuimax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vuimax_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vuimax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vuimin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVuiminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vuimin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vuimin_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vuimin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vulmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVulmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vulmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vulmax_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vulmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vulmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVulminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vulmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vulmin_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vulmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vurmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVurmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_UnderexcLimIEEE1_vurmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_UnderexcLimIEEE1_vurmax_feature",
                                "_UI_UnderexcLimIEEE1_type" ),
                        CimPackage.eINSTANCE.getUnderexcLimIEEE1_Vurmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns UnderexcLimIEEE1.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/UnderexcLimIEEE1" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( UnderexcLimIEEE1 ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_UnderexcLimIEEE1_type" )
                : getString( "_UI_UnderexcLimIEEE1_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( UnderexcLimIEEE1.class ) ) {
        case CimPackage.UNDEREXC_LIM_IEEE1__KUC:
        case CimPackage.UNDEREXC_LIM_IEEE1__KUF:
        case CimPackage.UNDEREXC_LIM_IEEE1__KUI:
        case CimPackage.UNDEREXC_LIM_IEEE1__KUL:
        case CimPackage.UNDEREXC_LIM_IEEE1__KUR:
        case CimPackage.UNDEREXC_LIM_IEEE1__TU1:
        case CimPackage.UNDEREXC_LIM_IEEE1__TU2:
        case CimPackage.UNDEREXC_LIM_IEEE1__TU3:
        case CimPackage.UNDEREXC_LIM_IEEE1__TU4:
        case CimPackage.UNDEREXC_LIM_IEEE1__VUCMAX:
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMAX:
        case CimPackage.UNDEREXC_LIM_IEEE1__VUIMIN:
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMAX:
        case CimPackage.UNDEREXC_LIM_IEEE1__VULMIN:
        case CimPackage.UNDEREXC_LIM_IEEE1__VURMAX:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
