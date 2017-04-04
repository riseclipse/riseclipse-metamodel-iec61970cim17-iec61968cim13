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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC4B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEDC4B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEDC4BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEDC4BItemProvider( AdapterFactory adapterFactory ) {
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

            addEfd1PropertyDescriptor( object );
            addEfd2PropertyDescriptor( object );
            addKaPropertyDescriptor( object );
            addKdPropertyDescriptor( object );
            addKePropertyDescriptor( object );
            addKfPropertyDescriptor( object );
            addKiPropertyDescriptor( object );
            addKpPropertyDescriptor( object );
            addOelinPropertyDescriptor( object );
            addSeefd1PropertyDescriptor( object );
            addSeefd2PropertyDescriptor( object );
            addTaPropertyDescriptor( object );
            addTdPropertyDescriptor( object );
            addTePropertyDescriptor( object );
            addTfPropertyDescriptor( object );
            addUelinPropertyDescriptor( object );
            addVeminPropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Efd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_efd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_efd1_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Efd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Efd2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfd2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_efd2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_efd2_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Efd2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ka feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_ka_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_ka_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Ka(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kd feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_kd_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_kd_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Kd(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ke feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_ke_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_ke_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Ke(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_kf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_kf_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Kf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ki feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKiPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_ki_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_ki_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Ki(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kp feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKpPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_kp_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_kp_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Kp(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Oelin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOelinPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_oelin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_oelin_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Oelin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seefd1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeefd1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_seefd1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_seefd1_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Seefd1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Seefd2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSeefd2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_seefd2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_seefd2_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Seefd2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Ta feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTaPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_ta_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_ta_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Ta(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Td feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTdPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_td_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_td_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Td(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Te feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_te_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_te_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Te(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_tf_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_tf_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Tf(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Uelin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUelinPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_uelin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_uelin_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Uelin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vemin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVeminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_vemin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_vemin_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Vemin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_vrmax_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Vrmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEDC4B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEDC4B_vrmin_feature",
                                "_UI_ExcIEEEDC4B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEDC4B_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcIEEEDC4B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEDC4B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEDC4B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEDC4B_type" )
                : getString( "_UI_ExcIEEEDC4B_type" ) + " " + label;
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

        switch( notification.getFeatureID( ExcIEEEDC4B.class ) ) {
        case CimPackage.EXC_IEEEDC4B__EFD1:
        case CimPackage.EXC_IEEEDC4B__EFD2:
        case CimPackage.EXC_IEEEDC4B__KA:
        case CimPackage.EXC_IEEEDC4B__KD:
        case CimPackage.EXC_IEEEDC4B__KE:
        case CimPackage.EXC_IEEEDC4B__KF:
        case CimPackage.EXC_IEEEDC4B__KI:
        case CimPackage.EXC_IEEEDC4B__KP:
        case CimPackage.EXC_IEEEDC4B__OELIN:
        case CimPackage.EXC_IEEEDC4B__SEEFD1:
        case CimPackage.EXC_IEEEDC4B__SEEFD2:
        case CimPackage.EXC_IEEEDC4B__TA:
        case CimPackage.EXC_IEEEDC4B__TD:
        case CimPackage.EXC_IEEEDC4B__TE:
        case CimPackage.EXC_IEEEDC4B__TF:
        case CimPackage.EXC_IEEEDC4B__UELIN:
        case CimPackage.EXC_IEEEDC4B__VEMIN:
        case CimPackage.EXC_IEEEDC4B__VRMAX:
        case CimPackage.EXC_IEEEDC4B__VRMIN:
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
